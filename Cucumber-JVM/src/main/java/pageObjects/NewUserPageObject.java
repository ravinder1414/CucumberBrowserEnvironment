package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewUserPageObject {

    WebDriver driver;

    public NewUserPageObject(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_firstName")
    WebElement firstName;

    @FindBy(id  = "user_lastName")
    WebElement lastName;

    @FindBy(id = "user_emailAddr")
    WebElement emailAddress;

    @FindBy(id = "user_username")
    WebElement username;

    @FindBy(id = "user_password")
    WebElement password;

    @FindBy(id = "user_phone")
    WebElement phone;

    @FindBy(id = "user_address")
    WebElement address;

    @FindBy(id = "user_postcode")
    WebElement postcode;

    @FindBy(id = "user_dob_1i")
    WebElement dobyear;

    @FindBy(id = "user_dob_2i")
    WebElement dobmonth;

    @FindBy(id = "user_dob_3i")
    WebElement dobday;

    @FindBy(id = "user_sex")
    WebElement sex;

    @FindBy(id = "user_comments")
    WebElement comments;

    @FindBy(css = ".actions > input")
    WebElement createUserButton;


    public void setFirstName(String first_name){
        firstName.sendKeys(first_name);
    }

    public void setLastName(String last_name){
        lastName.sendKeys(last_name);
    }

    public void setEmailAddress(String email){
        emailAddress.sendKeys(email);
    }

    public void setUsername(String user_name){
        username.sendKeys(user_name);
    }

    public void setPassword(String user_password){
        password.sendKeys(user_password);
    }

    public void setPhone(String phone_no){
       phone.sendKeys(phone_no);
    }

    public void setAddress(String user_address){
        address.sendKeys(user_address);
    }

    public void setPostcode(String user_postcode){
       postcode.sendKeys(user_postcode);
    }

    public void setDobYear(String year) {
        dobyear.sendKeys(year);
    }

    public void setDobMonth(String month) {
        dobmonth.sendKeys(month);
    }

    public void setDobDay(String day) {
        dobday.sendKeys(day);
    }

    public void setSex(String user_sex){
        sex.sendKeys(user_sex);
    }

    public void setComments(String user_comments){
        comments.sendKeys(user_comments);
    }

    public ConfirmUserPageObject clickCreateUserButton()  {
        createUserButton.click();
        return new ConfirmUserPageObject(driver);
    }

}