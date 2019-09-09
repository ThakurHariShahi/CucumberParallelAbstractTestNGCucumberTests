package parallel;

import org.testng.annotations.DataProvider;

//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//TODO :- 1.REMEMBER TO ADD RUNNER AND STEDDEF CLASSESS IN THE SAME PACKAGE AND THE PACKAG NAME MUST BE PARALLEL
//        2.THIS CODE HAS TO BE RUN IN CMD USING "mvn clean intall" COMMAND
//		  3.USE maven-surefire-plugin PLUGIN TO PERFORM PARALLEL EXECUTION OF FEATURE FILES OR MULTIPLE SCENARIOS OF SINGLE FEATURE FILE
//        4.THE RUNNER CLASS SHOULD HAVE TEST AT THE END OF ITS NAME
@CucumberOptions(
		features="src/test/resources/parallel/"
		,plugin = {"html:report/html"
				,"json:report/json/cucumber.json"
				,"junit:report/junit/cucumber.xml"}
		,monochrome = true
		,glue={"parallel"}
		
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests{
//public class Runner extends AbstractTestNGCucumberTests{	

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}