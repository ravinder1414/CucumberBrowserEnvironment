package stepsDefinations;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.ConfirmUserPageObject;
import pageObjects.HomePageObject;
import pageObjects.NewUserPageObject;



import java.util.List;


public class MyStepdefs {
	

    WebDriver driver;
    String url;
    HomePageObject homePageObject;
    NewUserPageObject newUserPageObject;
    ConfirmUserPageObject confirmUserPageObject;
    //WebElement element = driver.findElement(By.linkText("Product Category"));
    
  


    @Before
    public void beforeScenario() {
        driver=new FirefoxDriver();
        //url = "http://bdt-registration.herokuapp.com/users";
        //url = "http://google.co.in";
        url = "http://10.78.58.44/Orion.aspx?r=http://10.78.58.44/Default.aspx";
        //WebElement element = driver.findElement(By.linkText("Product Category"));
        
       // Actions action = new Actions(driver);
        
        //action.moveToElement(element).build().perform();
        
        
    }

    @Given("^I am in users page$")
    public void I_am_in_users_page() throws Throwable {
        driver.get(url);
    }

    @Then("^I click on new user link$")
    public void I_click_on_new_user_link() throws Throwable {

        homePageObject = new HomePageObject(driver);
        driver.switchTo().frame("Orion");
        //newUserPageObject= homePageObject.clickOnNewUserLink();
        //return newUserPageObject;
        //homePageObject.newUserLink.click();
        //homePageObject.GmailLink.click();
        homePageObject.tabHome.click();
        //homePageObject.tabAcademics.click();
        
    }

    @And("^enter user first name as ([^\"]*)$")
    public void enter_user_first_name_as(String firstName) throws Throwable {
        newUserPageObject.setFirstName(firstName);
    }

    @And("^enter user last name as ([^\"]*)")
    public void enter_user_last_name_as(String lastName) throws Throwable {
        newUserPageObject.setLastName(lastName);
      //WebElement element = driver.findElement(By.linkText("Product Category"));
        
        //Actions action = new Actions(driver);
        
        //action.moveToElement(element).build().perform();
        //driver.navigate().refresh();
    }

    @And("^enter user email id as ([^\"]*)")
    public void enter_user_email_id_as(String email) throws Throwable {
        newUserPageObject.setEmailAddress(email);
    }

    @And("^enter user username as ([^\"]*)")
    public void enter_user_username_as(String username) throws Throwable {
        newUserPageObject.setUsername(username);
    }

    @And("^enter user password as ([^\"]*)")
    public void enter_user_password_as(String password) throws Throwable {
        newUserPageObject.setPassword(password);
    }

    @And("^enter user phone as ([^\"]*)")
    public void enter_user_phone_as(String phone) throws Throwable {
        newUserPageObject.setPhone(phone);
    }

    @And("^enter user address as ([^\"]*)")
    public void enter_user_address_as(String address) throws Throwable {
        newUserPageObject.setAddress(address);
    }

    @And("^enter user postcode as ([^\"]*)")
    public void enter_user_postcode_as(String postcode) throws Throwable {
        newUserPageObject.setPostcode(postcode);
    }

    @And("^enter user year of dob as ([^\"]*)")
    public void enter_user_year_of_dob_as(String dobyear) throws Throwable {
        newUserPageObject.setDobYear(dobyear);
    }

    @And("^enter user month of dob as ([^\"]*)")
    public void enter_user_month_of_dob_as(String dobmonth) throws Throwable {
        newUserPageObject.setDobMonth(dobmonth);
    }

    @And("^enter user day of dob as ([^\"]*)")
    public void enter_user_day_of_dob_as(String dobDay) throws Throwable {
        newUserPageObject.setDobDay(dobDay);
    }

    @And("^enter user sex as ([^\"]*)")
    public void enter_user_sex_as(String sex) throws Throwable {
        newUserPageObject.setSex(sex);
    }

    @And("^enter user comments as ([^\"]*)")
    public void enter_user_comments_as(String comments) throws Throwable {
        newUserPageObject.setComments(comments);
    }

    @And("^click create user button$")
    public ConfirmUserPageObject click_create_user_button() throws Throwable {
        confirmUserPageObject=newUserPageObject.clickCreateUserButton();
        return confirmUserPageObject;
    }

    @Then("^verify user is on confirm page$")
    public void verify_user_is_on_confirm_page() throws Throwable {
        Assert.assertEquals("User was successfully created.",confirmUserPageObject.getSuccessMessage());
    }

    @And("^I enter user details as:$")
    public void enterNewUserDetails(DataTable userDetails) throws Throwable {
        NewUserPageObject newUserPageObject = new NewUserPageObject(driver);
        List<String> data = userDetails.raw().get(1);
        newUserPageObject.setFirstName(data.get(0));
        newUserPageObject.setLastName(data.get(1));
        newUserPageObject.setEmailAddress(data.get(2));
        newUserPageObject.setUsername(data.get(3));
        newUserPageObject.setPassword(data.get(4));
        newUserPageObject.setPhone(data.get(5));
        newUserPageObject.setAddress(data.get(6));
        newUserPageObject.setPostcode(data.get(7));
        newUserPageObject.setComments(data.get(8));
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        driver.close();
        driver.quit();
    }
}