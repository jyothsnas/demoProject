package com.portal.demoProject.steps;

import com.portal.demoProject.service.ScreenshotService;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.testng.annotations.AfterTest;


public class CucumberHooks {

    @Lazy
    @Autowired
    private ScreenshotService screenshotService;

    @Lazy
    @Autowired
    private ApplicationContext applicationContext;


    @AfterStep
    public void afterStep(Scenario scenario){
        if(scenario.isFailed()){
            scenario.attach(this.screenshotService.getScreenshot(), "image/png", scenario.getName());
            //scenario.embed(this.screenshotService.getScreenshot(), "image/png", scenario.getName());
        }
    }

    @After
    public void afterScenario(){
        this.applicationContext.getBean(WebDriver.class).quit();
    }


}