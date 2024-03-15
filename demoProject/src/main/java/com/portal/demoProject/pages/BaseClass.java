package com.portal.demoProject.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseClass {

    @Autowired
    protected WebDriver driver;

    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver, this);
    }

    @Autowired
    protected WebDriverWait wait;

    public abstract boolean verifyPage();

}
