package com.portal.demoProject.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LandingPage extends BaseClass{

    @FindBy(xpath = "")
    private WebElement register;

    @Value("${application.url}")
    private String url;

    public void navigateTo(){
        try {
            //to handle captcha
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    @Override
    public boolean verifyPage() {
        return this.wait.until((d)-> this.register.isDisplayed());
    }

    public void clickRegisterButton(){
        this.wait.until((d)-> this.register.isDisplayed());
        this.register.click();
    }

}
