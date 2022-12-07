package booking.question;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static booking.utils.customMatch.Keywords.TOTAL_PRICE;

public class   visualcieResponse implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
    return SerenityRest.lastResponse().jsonPath().getJsonObject(TOTAL_PRICE);
    }
    public static visualcieResponse withData(){
        return new visualcieResponse();
    }
}
