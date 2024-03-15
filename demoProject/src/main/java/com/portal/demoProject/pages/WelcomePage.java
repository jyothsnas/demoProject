package com.portal.demoProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class WelcomePage extends BaseClass{

    @FindBy(xpath = " //h2[@class='ng-binding']")
    private WebElement welcome;

    @FindBy(xpath = " //h3[contains(text(),'Here are our latest 5 jobs for you…')]")
    private WebElement numberOfJobs;

    private By listOfjobs = By.xpath("//table/tbody/tr");

    @FindBy(css ="div.alert.alert-success" )
    private WebElement alert;

    @Override
    public boolean verifyPage() {
        return this.wait.until((d)-> this.welcome.isDisplayed());
    }

    public int numberOfJobsDisplayed()
    {
        List<WebElement> columnsNumber = driver.findElements(listOfjobs);
       return columnsNumber.size();
    }

    public boolean welcomeMessage()
    {
        return this.alert.getText().equals("Your registration has been successful!");
    }

}
