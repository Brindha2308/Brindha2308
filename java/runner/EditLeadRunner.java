package runner;

import hooks.BasePage;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/editLead.feature",
					glue= "steps",
							monochrome=true,publish=true,dryRun=true)

public class EditLeadRunner extends BasePage {

}
