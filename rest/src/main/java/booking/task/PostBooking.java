package booking.task;

import booking.models.ResponseGetBooking;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static booking.utils.customMatch.Keywords.*;

public class PostBooking implements Task {

   private ResponseGetBooking body;
    public PostBooking(ResponseGetBooking body){
        this.body = body;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to(BOOKING).with(request->request
                        .header(CONTENT_TYPE,ContentType.JSON)
                        .body(body)
                        .log().all()
                )

        );
        int id = SerenityRest.lastResponse().jsonPath().getInt(BOOKING_ID);
        actor.remember(BOOKING_ID,id);

    }
    public static PostBooking create(ResponseGetBooking body) {
        return Tasks.instrumented(PostBooking.class, body);
    }
}
