package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class E2E {

    @RunWith(Cucumber.class)
    @CucumberOptions(plugin={"html:target/cucumber-reports2.html",
            "json:target/json-reports/cucumber2.json",
            "junit:target/xml-report/cucumber2.xml"
    },
            features = "src/test/resources/features",
            glue = "stepDefinitions",
            tags = "@1,@2",
            dryRun = false
    )

    public class TestRunners {
    }
}
