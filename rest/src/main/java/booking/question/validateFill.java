package booking.question;

import booking.models.ResponseGetBooking;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class validateFill  implements Question {
    @Override
    public Object answeredBy(Actor actor) {
      return SerenityRest.lastResponse().body().as(ResponseGetBooking.class);
    }
    public static validateFill fill(){
     return new validateFill();
    }
}
