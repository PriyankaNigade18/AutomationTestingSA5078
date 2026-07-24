package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * 1.Single testcase/scenario: tags="@homePage"
 * 2.grouping of scenarios when different tagnames are in feature file: tags="@homePage or @mobilesPage"
 * 3.grouping of scenarios when same tagnames are in feature file: tags="@Regression"
 * 4.How to skip any scenario: tags="not @Regression"
 */


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
				glue={"stepdef"},
				tags="not @ignore",
				publish=true)
public class AmazonRunner {

}
