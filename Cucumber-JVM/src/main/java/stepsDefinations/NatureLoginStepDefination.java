package stepsDefinations;


	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import pageObjects.ConfirmUserPageObject;
	import pageObjects.HomePage;
	import pageObjects.HomePageObject;
	import pageObjects.NatureLogin;
	import pageObjects.NewUserPageObject;



	import cucumber.api.Scenario;
	import cucumber.api.java.After;
	import cucumber.api.java.Before;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;



	public class NatureLoginStepDefination {

	    WebDriver driver;
	    String url;
	    HomePageObject homePageObject;
	    NewUserPageObject newUserPageObject;
	    ConfirmUserPageObject confirmUserPageObject;
	    //WebElement element = driver.findElement(By.linkText("Product Category"));
	    
	    NatureLogin login = new NatureLogin();
	    //login.clickOnNewUserLink().click();


	    @Before
	    public void beforeScenario() {
	        driver=new FirefoxDriver();
	        url = "http://bdt-registration.herokuapp.com/users";
	        
		 //WebDriver driver;
		    //String url;
		  
		
		   
		    //WebElement element = driver.findElement(By.linkText("Product Category"));
	   // NatureLogin login = new NatureLogin();
	    
	  
	  //HomePage homePage = new HomePage();


		 }

		@Given("^User navigate to nature\\.com login page$")
		public void user_navigate_to_nature_com_login_page() throws Throwable {
			//driver.get(url);
			//login.lnkLogin().click();
			//NatureLogin login = new NatureLogin();
			//login.navigateTo();
			driver.get(url);
		}

		@When("^I click on new userd link$")
		public void I_click_on_new_userd_link() throws Throwable {
			 //NatureLogin login = new NatureLogin();
			 //HomePage homePage = new HomePage();
			//driver.get(url);
			//homePage.lnkLogin().click();
			//login.loginUser("quickstepusernature_login@mailinator.com", "qwer1234");
			 //homePageObject = new HomePageObject(driver);
		        //newUserPageObject= homePageObject.clickOnNewUserLink();
		        //NatureLogin login = new NatureLogin();
		        login.clickOnNewUserLink().click();
		        //return newUserPageObject;
		}

		
		//@When("^I click on new users link$")
		public void I_click_on_new_users_link() throws Throwable {
			 //NatureLogin login = new NatureLogin();
			 //HomePage homePage = new HomePage();
			//driver.get(url);
			//homePage.lnkLogin().click();
			//login.loginUser("quickstepusernature_login@mailinator.com", "qwer1234");
			 homePageObject = new HomePageObject(driver);
		        //newUserPageObject= homePageObject.clickOnNewUserLink();
		        //return newUserPageObject;
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

