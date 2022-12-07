package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static utils.KeyWord.TIME;

public class Visible implements Interaction {
    private Target target;
    public Visible(Target target){
        this.target=target;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible()).forNoMoreThan(TIME).seconds()
        );
    }

    public static Visible waitVisible(Target target) {
        return new Visible(target);
    }
}
