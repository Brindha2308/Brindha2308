package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BasePage;

public class MyHomePage extends BasePage{

	/*
	 * public MyHomePage(ChromeDriver driver) { this.driver=driver; }
	 */
	public MyLeadsPage clickLeadsTab() {
		getDriver().findElement(By.xpath("//a[text()='Leads']")).click();
		return new MyLeadsPage();
	}
	
}
