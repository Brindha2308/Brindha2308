package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hooks.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BasePage{
	
	/*
	 * public LoginPage(ChromeDriver driver) { this.driver=driver; }
	 */
	
	/**
	 * Type the user name in the login screen
	 * @param userId -- The different username to login
	 * @return 
	 */
	
	
	@Given("Enter user name as {string}")
	public LoginPage typeUserName(String userId) {
		getDriver().findElement(By.id("username")).sendKeys(userId);
		return this;
	}
	
	/**
	 * Type the password in the login screen
	 * @param password -- The different password to login
	 * @return 
	 */
	@Given("Enter password as {string}")
	public LoginPage typePassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this; 
	}
	
	/**
	 * Click the login button
	 * @return 
	 */
	@When("Click on login button")
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

	@Then("Homepage should displayed")
	public void display() {
	
	System.out.println("Homepage Displayed Successfully");
	}	
	
}







