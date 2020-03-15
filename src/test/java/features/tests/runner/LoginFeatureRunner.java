package features.tests.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:login.feature",
        glue = "classpath:features.tests",
        plugin = "html:target/cucumber-reports.html"
)
public class LoginFeatureRunner {
}
