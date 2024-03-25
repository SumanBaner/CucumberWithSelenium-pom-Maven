package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/LoginFeature.feature"},
        glue = {"stepdefinitions"},
        tags = "@Sanity",
        plugin = {"pretty"}
)
public class TestRunner {
}
