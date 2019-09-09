package parallel;

import org.testng.annotations.DataProvider;

//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//TODO :- REMEMBER TO ADD RUNNER AND STEDDEF CLASSESS IN THE SAME PACKAGE
@CucumberOptions(
		features="src/test/resources/parallel/"
		,plugin = {"html:report/html"
				,"json:report/json/cucumber.json"
				,"junit:report/junit/cucumber.xml"}
		,monochrome = true
		,glue={"parallel"}
		
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}