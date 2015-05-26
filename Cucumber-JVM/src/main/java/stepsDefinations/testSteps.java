package stepsDefinations;

import org.openqa.selenium.WebDriver;

import pageObjects.ConfirmUserPageObject;
import pageObjects.HomePageObject;
import pageObjects.NewUserPageObject;


import java.util.List;

public class testSteps{

    WebDriver driver;
    String url="http://bdt-registration.herokuapp.com/users";
    HomePageObject homePageObject;
    NewUserPageObject newUserPageObject;
    ConfirmUserPageObject confirmUserPageObject;

}
