package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/MyDemp.feature"}
,glue= {"PracticeInfo","StepDefination"}
,tags = {"@TC01"}
,monochrome=true,plugin= {"html:target/cucumber-html-report"})



public class TestRunner {
	

}
