package common;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;
//import org.openqa.selenium.iphone.IPhoneDriver;

public class DriverSelector {
	private static final String IPHONE = "iphon";
    private static final String INTERNET_EXPLORER = "ie";
    
    private static final String phantomjs="js";

   // private static final String FIREFOX = "ff";

    public static final String CHROME = "chrome";
    
 
	public static final String Xport = System.getProperty("lmportal.xvfb.id",":1");
	
	// Setup Firefox binary to start in Xvfb
	//public static final File firefoxPath = new File(System.getProperty("lmportal.deploy.firefox.path", "/opt/firefox/firefox"));

	// Setup Chrome binary to start in Xvfb
	public static ChromeDriverService service;
	public static final File chromePath = new File(System.getProperty(
			"webdriver.chrome.driver", "/opt/chromedriver.exe"));
	
    String browserChoice;
    WebDriver driver;

    public DriverSelector(String browser) {
        browserChoice = browser;
    }

	public WebDriver getBrowser() {

		if (CHROME.equals(browserChoice)) {
			service = new ChromeDriverService.Builder().usingDriverExecutable(chromePath).
					usingAnyFreePort().withEnvironment(ImmutableMap.of("DISPLAY",":1")).build();
			try {
				service.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			driver = new ChromeDriver(service);
			return driver;
			
        } //else if (FIREFOX.equals(browserChoice)) {
        	//FirefoxBinary firefox = new FirefoxBinary(firefoxPath);
    		//firefox.setEnvironmentProperty("DISPLAY", Xport);
    		//FirefoxDriver driver = new FirefoxDriver(firefox, null);
            //return driver;
		
		

		else if(phantomjs.equals(browserChoice)) {
		DesiredCapabilities DesireCaps = new DesiredCapabilities();
		DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C://phantomjs.exe");
		driver = new PhantomJSDriver(DesireCaps);
		return driver;
		}
		

	        

		

            
        else if (INTERNET_EXPLORER.equals(browserChoice)) {
            System.setProperty("webdriver.ie.driver","C:\\ie\\IEDriverServer.exe");
            return driver = new InternetExplorerDriver();
 
        } else {
            System.out
                    .println("DEBUG: No browser was set for the BrowserFactory so I am running on firefox driver.  Please ignore this if you are running in an IDE");
        	//FirefoxBinary firefox = new FirefoxBinary(firefoxPath);
    		//firefox.setEnvironmentProperty("DISPLAY", Xport);
    		//FirefoxDriver driver = new FirefoxDriver(firefox, null);
            FirefoxDriver driver=new FirefoxDriver();
             
            return driver;
            
        }
	}
		
		

		/*else if (phantomjs.equals(browserChoice)) {
			DesiredCapabilities caps = new DesiredCapabilities();
			//caps = new DesiredCapabilities();

                String phantomJSLocation = "/usr/local/bin/phantomjs";

                if (System.getProperty("os.name").toLowerCase().contains("win")) {
                    phantomJSLocation = ".\\target\\test-classes\\binaries\\phantomjs\\phantomjs.exe";
                } else if (System.getProperty("os.name").toLowerCase().contains("mac os")) {

                    phantomJSLocation = "target/test-classes/binaries/phantomjs/phantomjs";
                } else {
                    // Assume Linux
                    phantomJSLocation = "target/test-classes/binaries/phantomjs/phantomjs";
                }

                caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomJSLocation);

                return driver;
            }
            
            */
	
	
	
	 protected static WebDriver launchIPad(DesiredCapabilities caps) {
	        caps = new DesiredCapabilities();
	        caps.setCapability("device", "iPad Simulator");
	        caps.setCapability("version", "6.1");
	        caps.setCapability("app", "safari");
	        WebDriver driver = null;
	        try {
	            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        return driver;
	        
	       
	        
	        

          /*  if (whichBrowser != Browser.iphoneBrowser && whichBrowser != Browser.ipadBrowser
                    && whichBrowser != Browser.iphoneApp) {
                browser.manage().window().setSize(new Dimension(1280, 800));
                browser.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                // Implicit waits for iphone and ipad are set in the
                // launchIPhone() and launchIPad() methods
                
                

	
    
    public WebDriver browser() {
        return driver;
   */ }

}
