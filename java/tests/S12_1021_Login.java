package tests;

import org.testng.annotations.Test;

import hooks.BasePage;
import screens.LoginPage;

public class S12_1021_Login extends BasePage {
@Test
	public void loginPage() {
	new LoginPage()
	.typeUserName("Demosalesmanager")
	.typePassword("crmsfa")
	.clickLogin()
	.clickCRMSFA();
	
}
}
