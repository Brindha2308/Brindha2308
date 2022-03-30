package tests;

import org.testng.annotations.Test;

import hooks.BasePage;
import screens.CreateLeadPage;
import screens.LoginPage;
import screens.MyLeadsPage;

public class S12_1022_CreateLeadTest extends BasePage {
@Test
public void createLead() {
	
	
	  new LoginPage() 
	  .typeUserName("Demosalesmanager")
	  .typePassword("crmsfa")
	  .clickLogin()
	  .clickCRMSFA()
	  .clickLeadsTab()
	  .clickCreateLead()
	  .createCompanyName()
	  .createFirstName()
	  .createLastName()
	  .finalCreateLead();
	 	
}
}
