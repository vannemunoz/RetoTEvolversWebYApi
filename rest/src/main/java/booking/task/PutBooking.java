package booking.task;

import booking.models.ResponseGetBooking;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static booking.utils.customMatch.Keywords.*;

public class PutBooking implements Task{

    ResponseGetBooking body;
    public PutBooking(ResponseGetBooking body){
        this.body=body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String token = actor.recall(CODIGO);
        int id = actor.recall(BOOKING_ID);
        actor.attemptsTo(
                Put.to(BOOKING+"/"+ id).with(request->request
                        .header(CONTENT_TYPE, ContentType.JSON)
                        .header(COOKIE, TOKEN+"=" + token)
                        .body(body)
                        .log().all()
                )
        );
        actor.remember(BOOK,body);
    }
    public static PutBooking update(ResponseGetBooking  body){
        return Tasks.instrumented(PutBooking.class,body);
    }
}
