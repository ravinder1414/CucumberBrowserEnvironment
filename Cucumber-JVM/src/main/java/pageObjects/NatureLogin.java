package pageObjects;

	import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

	import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.DriverSelector;
import common.Url;

	public class NatureLogin{
		
		WebDriver driver;

	    //public void navigateRegistration() {
	        //DriverSelector webbrowser = new DriverSelector(System.getProperty("browser"));
	        //driver = webbrowser.getBrowser();
	        //Url domain = new Url(System.getProperty("env"));
	        //driver.get(domain.createUrl() + JournalUrl);
	    
	    
	   // public String  createUrl(){
	        //Url domain = new Url(System.getProperty("env"));
	        //return domain.createUrl();	
	    

	    //public void navigateUrl(String requiredUrl) {
	        //DriverSelector webbrowser = new DriverSelector(System.getProperty("browser"));
	        //driver = webbrowser.getBrowser();
	                //driver.get(requiredUrl);
	    
	    /*public WebElement firstname() {
	        return driver.findElement(By.xpath("//*[@id='firstname']"));
	    }

	    public WebElement lastname() {
	        return driver.findElement(By.xpath("//*[@id='lastname']"));
	    */


	    public static final String LOGIN_COOKIE = "login";

	    
	    public void navigateTo() {
	        driver.get("http://www.nature.com");
	    }
	    
	    public WebElement lnkLogin() {
	    	
	        //return driver.findElement(By.xpath());
	    	return driver.findElement(By.xpath(".//*[@id='hdr']/div[2]/div/p/a[1]"));
	    }
	    
public WebElement clickOnNewUserLink() {
	    	
	        return driver.findElement(By.linkText("New User"));
	    }
	   
	    

	   
	    public WebElement fldEmailAddress() {
	       
	        return driver.findElement(By.id("login-username"));
	    }

	    public WebElement fldPassword() {
	        //ensure().element(By.id("login-password")).seconds(15);
	        return driver.findElement(By.id("login-password"));
	    }

	    public WebElement btnLogin() {
	        //ensure().element(By.id("login-submit")).seconds(15);
	        return driver.findElement(By.id("login-submit"));
	    }

	    public WebElement lnkLogout() {
	        //ensure().element(By.className("logoff")).seconds(15);
	        return driver.findElement(By.className("logoff"));
	    }

	    public void loginUser(String email, String password) {
	        fldEmailAddress().clear();
	        fldPassword().clear();
	        fldEmailAddress().sendKeys(email);
	        fldPassword().sendKeys(password);
	        btnLogin().click();
	    }

	    public void validateUserSuccessfullyLoggedIN() {
	        Cookie loginCookie = driver.manage().getCookieNamed(LOGIN_COOKIE);
	        assertNotNull(loginCookie);
	    }

	    public void clickOnLogoutLink() {
	        lnkLogout().click();
	    }

	    public void validateUserNotLoggedIN() {
	        Cookie loginCookie = driver.manage().getCookieNamed(LOGIN_COOKIE);
	        assertNull(loginCookie);
	    }

	    public WebElement lnkAthensLogin() {
	        return driver.findElement(By.linkText("Login via Athens"));
	    }

	}
