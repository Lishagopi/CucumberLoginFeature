package com.quinbay.cucumber;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {
  WebDriver driver = new  ChromeDriver();

  @Before
    public void testBefore()
  {
    System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
    driver= new  ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }

  @After
  public void testAfter(){
    driver.quit();
  }
}
