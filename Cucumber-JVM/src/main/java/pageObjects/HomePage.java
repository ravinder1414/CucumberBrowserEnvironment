package pageObjects;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.DriverSelector;



public class HomePage {
	WebDriver driver;

    public void navigateRegistration() {
        DriverSelector webbrowser = new DriverSelector(System.getProperty("browser"));
        driver = webbrowser.getBrowser();
}
	
	

    /**
     * Navigates to the Nature homepage.
     * 
     * @throws Exception
   

    /**
     * Returns a handle to the log in link.
     * 
     * @return <code>WebElement</code> as a handle to the log in link.
     */
    public WebElement lnkLogin() {
        return driver.findElement(By.className("login"));
    }

    public void clickOnLoginLink() {
        lnkLogin().click();
    }

    /**
     * Checks to see whether the element displaying the cover of the current
     * Nature issue is present.
     * 
     * @return <code>true</code> if present, <code>false</code> if not.
     */
    public boolean isCoverPresent() {
        return driver.findElements(By.className("cover-link")).size() == 1;
    }

    /**
     * Checks to see whether the element displaying the inside nature section is
     * present.
     * 
     * @return <code>true</code> if present, <code>false</code> if not.
     */
    public boolean isInsideNaturePresent() {
        return driver.findElements(By.xpath("//h2[text() = 'Inside nature.com']")).size() == 1;
    }

    /**
     * Checks to see whether the element displaying the news section is present.
     * 
     * @return <code>true</code> if present, <code>false</code> if not.
     */
    public boolean isNewsSectionPresent() {
        return driver.findElements(By.className("news")).size() == 1;
    }

    /**
     * Returns a handle to the log in link.
     * 
     * @return <code>WebElement</code> as a handle to the log in link.
     */
    public WebElement lnkLogIn() {
        //ensure().element(By.className("login")).seconds(15);
        return driver.findElement(By.className("login"));
    }

 
    public WebElement lnkRegister() {
        return driver.findElement(By.linkText("Register"));
    }

    /**
     * This method validates weather we are on nature.com home page or not
     * 
     * @throws Exception
     */
    public void validateNatureHomePage() throws Exception {
        //WebDriverUtils.waitForURLToContainSubstring(driver(), "nature.com");
    }

    public void navigateToJournalHomePage(String journal, String title) throws Exception {
    	//driver.get(context().getURL("nature.com/" + journal + "/index.html"));
        validateJournalHomePage(journal, title);
    }

    public void validateJournalHomePage(String journal, String title) throws Exception {
        assertEquals(title, driver.getTitle());
        //WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com/" + journal);
    }

}
