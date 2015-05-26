package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewLeadCreationPageObjects {
	WebDriver driver;
	

    public void navigateTo() {
        driver.get("http://10.78.58.44");
    }
    
    //Admission Tab
    
    public WebElement tabAdmission() {
    return driver.findElement(By.xpath(".//*[@id='_ctl1_TopNavRow']/td[2]"));
   
    }
    
    //Admission Manager Link
    
       public WebElement lnkAdmissionsManager() {
    	
        return driver.findElement(By.linkText("Admissions Manager"));
    }
       
       //Link Add New Lead/Referral
       
       public WebElement lnkAddNewLeadReferral() {
       	
           return driver.findElement(By.xpath(".//*[@id='tabnavi_TabRow']/td[20]/a/img"));
       }
       
       //Info Call Radio Button
       
       public WebElement rbInfocall() {
          	
           return driver.findElement(By.xpath(".//*[@id='CtlApplyForm1_RadCheck_0']"));
       }
       
       //Referral Radio Button
       
       public WebElement rbReferral() {
         	
           return driver.findElement(By.xpath(".//*[@id='CtlApplyForm1_RadCheck_1']"));
       }
       
       //Live Chat Radio Button
       
       public WebElement rbLivechat() {
        	
           return driver.findElement(By.xpath(".//*[@id='CtlApplyForm1_RadCheck_2']"));
       }
       
       //Radio WarmTransfer
       
       public WebElement rbWarmTransfer() {
       	
           return driver.findElement(By.xpath(".//*[@id='CtlApplyForm1_RadCheck_3']"));
       }
       
       //First Name Text Field
       
       public WebElement txtFName() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRFname"));
       }
       
       
  //Last Name Text Field
       
       public WebElement txtLName() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRLname"));
       }
       
       
       //Email Text Field
       
       public WebElement txtEmail() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLREmail"));
       }
       
       
       //Home Phone  Text Field
       
       public WebElement txtHomePhone() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNHPhone"));
       }
       
       //Day Time Phone Text Field
       
       public WebElement txtDayTimePhone() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRWPhone"));
       }
       
    //City Text Field
       
       public WebElement txtCity() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNCity"));
       }
   //State Text Field
       
       public WebElement txtState() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNState"));
       }
       
    //ZIP Code Text Field
       
       public WebElement txtZipCode() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRZip"));
       }
       
//Country Text Field
       
       public WebElement dropDownCountry() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNCountry"));
       }
       
//TCPA Disclosure Radio Button Yes
       
       public WebElement rbtnTCPA_Yes() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRTCPA_Disc_0"));
       }
       
//TCPA Disclosure Radio Button No
       
       public WebElement rbtnTCPA_No() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRTCPA_Disc_1"));
       }
       
//Spouse Military Radio Button Yes
       
       public WebElement rbtnMilitary_Yes() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRMilitary_0"));
       }
       
       
      //Spouse Military Radio Button No
       
       public WebElement rbtnMilitary_No() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRMilitary_1"));
       }
       
       
       
      //Highest Education Text Field
       
       public WebElement dropDownHighestEducation() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNHighestEducation"));
       }
       
    //Drop Down Military Type Field
       
       public WebElement DropDownMilitaryType() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNMilitary2"));
       }
       
      // Button Add New Lead
       
       public WebElement btnAddLead() {
         	
           return driver.findElement(By.id("CtlApplyForm1_btnAddLead"));
       }
       
       public WebElement lnkgmail() {
   	 	
           //return driver.findElement(By.className("gb_ma"));
    	   
    	   return driver.findElement(By.linkText("Gmail"));
       
       }

}
