package setups;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static utils.KeyWord.*;

public class Hook {

    @Managed(driver = CHROME)
    protected WebDriver hisBrowser;
    @Before
    public void Actor(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled(ACTOR);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(ADVANTAGE_URL));
    }
}
