package booking.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\create_booking.feature",
        glue ="booking\\stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class createBooking {
}
