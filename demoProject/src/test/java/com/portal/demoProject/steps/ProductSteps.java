package com.portal.demoProject.steps;

import com.portal.demoProject.pages.LandingPage;
import com.portal.demoProject.pages.ProductPage;
import com.portal.demoProject.pages.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@CucumberContextConfiguration
@SpringBootTest
public class ProductSteps {

    @Autowired
    private LandingPage landingPage;

    @Autowired
    private ProductPage productPage;

    @Autowired
    private WelcomePage welcomePage;


    @Given("^user is on the homepage$")
    public void userisonthehomepage(){
        this.landingPage.navigateTo();
       // Assert.assertTrue(this.landingPage.verifyPage());

    }
    @Given("user clicked on the signup link")
    public void userClickedOnTheSignupLink() {
      //  this.landingPage.clickRegisterButton();

    }

    @Then("user lands on the registration page")
    public void userLandsOnTheproductPage() {
        Assert.assertTrue(this.productPage.verifyPage());

    }

    @And("user is on the registration page")
    public void userIsOnTheproductPage() {
        Assert.assertTrue(this.productPage.verifyPage());
    }

    @And("user enters <firstname> <Web Address> <email> <password> <confirm password><job interests>")
    public void userEntersFirstnameWebAddressEmailPasswordConfirmPasswordJobInterests() {
//        this.productPage.enterName("teja");
//        this.productPage.enterEmail("Test@gmail.com");
//        this.productPage.enterWebAdd("jkjkjkjkjkjk");
//        this.productPage.enterInterests("testing");
//        this.productPage.enterPassword("abcd1234");
//        this.productPage.enterConfirmPassword("abcd1234");


    }

    @When("user clicks on submit")
    public void userClicksOnSubmit() {
        //this.productPage.clickRegister();

    }

    @Then("user should see {string} displayed")
    public void userShouldSeeDisplayed(String arg0) {

//        this.productPage.errorAlertIsDisplayed();
//        Assert.assertTrue(this.productPage.getErrorText().contains(arg0));

    }



    @Then("user lands on the dashboard page")
    public void userLandsOnTheDashboardPage() {
        Assert.assertTrue(this.welcomePage.verifyPage());
    }

    @And("user enters {string} {string} {string} {string} {string} {string}")
    public void userEnters(String firstname, String webAddress, String email, String password, String confirmpassword, String jobInterests) {
//        this.productPage.enterName(firstname);
//        this.productPage.enterEmail(email);
//        this.productPage.enterWebAdd(webAddress);
//        this.productPage.enterInterests(jobInterests);
//        this.productPage.enterPassword(password);
//        this.productPage.enterConfirmPassword(confirmpassword);
    }


    @And("user sees the Welcome message")
    public void userSeesTheWelcomeMessage() {
        Assert.assertTrue(this.welcomePage.welcomeMessage());
    }

    @And("user will see {int} jobs on the dashboard page")
    public void userWillSeeJobsOnTheDashboardPage(int arg0) {
        Assert.assertEquals(this.welcomePage.numberOfJobsDisplayed(),arg0);
    }

    //Amazon Test
    @Given("User landed on the HomePage")
    public void userLandedOnTheHomePage() {
      this.productPage.verifyHomePage();
      Assert.assertTrue(this.productPage.verifyHomePage());

    }

    @When("User selects {string} from the Main menu")
    public void userSelectsFromTheMainMenu(String arg0) {
        productPage.selectCompAndElectronics();
    }

    @And("selects {string}")
    public void selects(String arg0) {
       this.productPage.selectMobilesFromTheMenu();
       this.productPage.selectMobiles()
        Assert.assertTrue(this.productPage.verifyMobileAndAccHeader());
    }

    @And("Selects the Mobile phones {string}")
    public void selectsTheMobilePhones(String arg0) {
        this.productPage.selectProductType();

    }

    @Then("User should see the specifications for selected Mobile")
    public void userShouldSeeTheSpecificationsForSelectedMobile() {
        Assert.assertTrue(this.productPage.verifyMobileSpec());
        Assert.assertTrue(this.productPage.verifyMobileSpec1());
    }
    //negative register test
    @Given("user clicked on the new customer link")
    public void userClickedOnTheNewCustomerLink() {
    }

    @And("user enters {string} {string} {string} {string} {string}")
    public void userEnters(String arg0, String arg1, String arg2, String arg3, String arg4) {
    }
}
