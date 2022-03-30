package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BasePage;

public class CreateLeadPage extends BasePage {
	/*
	 * public CreateLeadPage(ChromeDriver driver) { this.driver=driver; }
	 */
	
public CreateLeadPage createCompanyName() {
	getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	return this;
}

public CreateLeadPage createFirstName() {
	getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	return this;
}

public CreateLeadPage createLastName() {
	getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	return this;
}

public CreateLeadPage finalCreateLead() {
	getDriver().findElement(By.name("submitButton")).click();
	return this;
}
}
