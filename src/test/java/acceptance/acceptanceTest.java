package acceptance;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="cases", plugin= {"html:target/cucumber/report.html"},monochrome=true,snippets=SnippetType.CAMELCASE,glue={"acceptance"})
 
public class acceptanceTest {

}
	