package common;

import org.openqa.selenium.WebDriver;




public class Url {

	
	String hostChoice;
//	Boolean authChoice;
	
	
	 
	    WebDriver driver;

	    public Url(String host) {
	        hostChoice = host;
	    }

	    public String host() {
	    	//if(hostChoice != null){
				if(hostChoice.equalsIgnoreCase("orion1dev")){
					return "http://10.78.5.47";
				}
	        
	    	
				 else if (hostChoice.equalsIgnoreCase("orion1test")){
					 return "http://10.78.4.61";
					
				}

				 else if (hostChoice.equalsIgnoreCase("orion1stage")){
					 return "http://10.78.58.44";
					
				 }
		/*	else {
	    	System.out.println("DEBUG: No environment was set for the Url so I am running against www-test.nature.com.  " +
	    			"Please ignore this if you are running in an IDE");
	    	return "www.";
	    }*/
	    return hostChoice;
	    
				 }   	
	    }








