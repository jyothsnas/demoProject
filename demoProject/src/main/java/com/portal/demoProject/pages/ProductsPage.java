package com.portal.demoProject.pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class ProductPage extends BaseClass{

    @FindBy(xpath ="//div[@id='nav-logo']/a")
    private WebElement verifyHomePageText;

    @FindBy(xpath = "//div[@id ='nav-main']/div/a")
    private WebElement menuButton;

    @FindBy(xpath = "//div[@id='hmenu-content']/ul/li/a[@class='hmenu-item']/div[text()='Mobiles, Computers']")
    private WebElement clickOnMobilesAndComp;

    @FindBy(xpath = "//li/div[@class='hmenu-item hmenu-title '][contains(text(), 'Mobiles,')]")
    private WebElement mobileHeader;
    //to fail it
    @FindBy(xpath = "//li/div[@id=hmenu-nav")
    private WebElement clickonMobiles;

    @FindBy(xpath = "//li[@class='a-spacing-micro']/span/span[contains(text(),'Mobiles & Accessories')]")
    private WebElement verifyMobileHeader;

    @FindBy(xpath = "//div/span[text()= 'Brand']/../following-sibling::ul/li/span/a/span[text()='Samsung']")
    private WebElement selectSamsung;

    @FindBy(xpath = "//li/span[@class='a-list-item']/a/span[contains(text(),'Smartphones & Basic Mobiles')]")
    private WebElement clickMobiles;

    @FindBy(xpath = "//div[@data-cy='title-recipe']/h2/a/span")
    private WebElement mobileSpec;

    @FindBy(xpath = "//a/span[@class='a-price']/span")
    private WebElement mobileSpec1;

    @Override
    public boolean verifyHomePage(){
    this.wait.until((d)-> this.verifyHomePageText.isDisplayed());
    return this.verifyHomePageText.getAttribute("aria-label").contains("Amazon");
    }
    public void selectCompAndElectronics(){
        this.menuButton.click();
        this.wait.until((d)-> this.clickOnMobilesAndComp.isDisplayed());
        this.clickOnMobilesAndComp.click();
    }
    public boolean selectMobilesFromTheMenu(){
        this.wait.until((d)-> this.mobileHeader.isDisplayed());
        return this.mobileHeader.getText().equalsIgnoreCase("Mobiles, Tablets & More");

    }
    public void selectMobiles(){
        //not able to click
        this.wait.until((d)-> this.clickonMobiles.isDisplayed());
        this.clickonMobiles.click();

    }
    public boolean verifyMobileAndAccHeader(){
        this.wait.until((d)-> this.verifyMobileHeader.isDisplayed());
        return this.verifyMobileHeader.getText().equalsIgnoreCase("Mobiles & Accessories");
    }
   public void selectproductType(){
       this.wait.until((d)-> this.verifyMobileHeader.isDisplayed());
       this.clickMobiles.click();
       this.wait.until((d)-> this.selectSamsung.isDisplayed());
       this.selectSamsung.click();

   }
   public boolean verifyMobileSpec(){
       this.wait.until((d)-> this.mobileSpec.isDisplayed());
       return this.mobileSpec1.getText().contains("50MP Triple Cam");
   }
    public boolean verifyMobileSpec1(){
        this.wait.until((d)-> this.mobileSpec1.isDisplayed());
        return this.mobileSpec1.getText().contains("50MP Triple Cam");
    }
}
