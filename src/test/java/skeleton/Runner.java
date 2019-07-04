package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Reg.feature","src/test/resources/Case4.feature"},glue="skeleton",
					plugin="json:target/jsonreport.json"
					)

public class Runner {

}
