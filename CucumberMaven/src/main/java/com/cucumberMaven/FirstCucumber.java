package com.cucumberMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstCucumber {
	WebDriver driver;

	
	@Given("^Browser is launched$")
	public void Browser_is_launched() throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-nofifications");
			options.addArguments("--disable-infobars");
		   driver=new ChromeDriver(options);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}

	@When("^User enter the url as \"([^\"]*)\"$")
	public void User_enter_the_url_as(String url) throws Throwable {
		driver.get(url);
		Thread.sleep(3000);
	}

	@Then("^User landed on Login Page$")
	public void User_landed_on_Login_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).isDisplayed();
	}

	@When("^User enters the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_the_credentials_Admin_and_admin(String username,String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.close();
	    
	}



	
}
