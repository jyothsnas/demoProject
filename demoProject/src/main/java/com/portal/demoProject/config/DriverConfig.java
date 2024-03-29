package com.portal.demoProject.config;

import com.portal.demoProject.annotation.ThreadScopeBean;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class DriverConfig {

    @Value("${timeout.seconds:30}")
    private int timeout;


    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @ThreadScopeBean
    @ConditionalOnMissingBean
    public WebDriver chromeDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.addArguments("excludeSwitches", "enable-automation");
        chromeOptions.addArguments("useAutomationExtension", "False");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
    }

}
