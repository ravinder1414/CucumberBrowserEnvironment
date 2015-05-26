import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ConfirmUserPageObject;
import pageObjects.HomePageObject;
import pageObjects.NewUserPageObject;


/**
 * Created by ruchikarawat on 3/25/15.
 */
public class CreateUserTest {


    public WebDriver driver = new FirefoxDriver();
    public String url = "http://bdt-registration.herokuapp.com/users";

    @Before
    public void beforeClass() {
        driver.get(url);
    }


    //@Test
    public void verifyHomePage() {

        HomePageObject homePageObject = new HomePageObject(driver);
        NewUserPageObject newUserPageObject = homePageObject.clickOnNewUserLink();

        newUserPageObject.setFirstName("Ruchika");
        newUserPageObject.setLastName("Rawat");
        newUserPageObject.setEmailAddress("ruchi23rawat@gmail.com");
        newUserPageObject.setUsername("Ruchi_UserName");
        newUserPageObject.setPassword("Ruchi_Pwd");
        newUserPageObject.setPhone("9876543212");
        newUserPageObject.setAddress("Gurgaon");
        newUserPageObject.setPostcode("122002");
        newUserPageObject.setDobYear("1990");
        newUserPageObject.setDobMonth("June");
        newUserPageObject.setDobDay("23");
        newUserPageObject.setSex("Female");
        newUserPageObject.setComments("VodQA TW Gurgaon");

        ConfirmUserPageObject confirmUserPageObject = newUserPageObject.clickCreateUserButton();
        String message = confirmUserPageObject.getSuccessMessage();

    }


    @After
    public void afterClass() {
        driver.close();
        driver.quit();

    }

}
