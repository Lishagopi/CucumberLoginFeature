package com.quinbay.cucumber.steps;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;


public class LoginSteps {
  WebDriver driver;

  @Given("^I am on Facebook login page$")
  public void goToFacebook() {
    //System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
    //driver= new  ChromeDriver();
    //driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com");

  }

  @When("^I enter username as \"(.*)\"$")
  public void enterUserName(String str)
  {
    //Thread.sleep(3000);
    WebElement emailid=driver.findElement(By.id("email"));
  emailid.sendKeys("lishagopi12@gmail.com");

  }

  @And("^I enter password as \"(.*)\"$")
  public void iEnterPasswordAs(String str) {

WebElement password =driver.findElement(By.id("pass"));
password.sendKeys("gopi@2000");
  }

  @Then("Login should fail")
  public void loginShouldFail() {
    WebElement login =driver.findElement(By.name("login"));
    login.click();


  }

  @Then("this is a test")
  public void m2(){

  }

}
