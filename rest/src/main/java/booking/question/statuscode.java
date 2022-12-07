package booking.question;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class statuscode implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        SerenityRest.lastResponse().prettyPrint();
        return SerenityRest.lastResponse().getStatusCode();
    }
    public static statuscode theResponse(){
        return new statuscode();
    }
}
