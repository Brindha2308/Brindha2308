package runner;

import hooks.BasePage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/java/features/createlead.feature",
					glue = "screens",
					monochrome=true,
					publish = true)

public class CucumberRunner extends BasePage {
	
}
