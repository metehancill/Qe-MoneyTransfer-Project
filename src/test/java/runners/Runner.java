package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "timeline:target/timeline-report",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hook"},
        tags= "@HesapDuzenleme or @ParaEkleme or @ParaTransfer",
        dryRun = false

)
public class Runner {

}