package booking.task;

import booking.utils.customMatch.Keywords;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;


import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static booking.utils.customMatch.Keywords.*;

public class CreateToken implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(AUTH).with(Request -> Request
                        .header(CONTENT_TYPE, ContentType.JSON).
                        body(
                               "{\n" +
                                       "    \"username\" : \"admin\",\n" +
                                       "    \"password\" : \"password123\"\n" +
                                       "}"
                            )
                )
        );
    actor.remember(Keywords.CODIGO, SerenityRest.lastResponse().jsonPath().getString(TOKEN));
    }

    public static CreateToken token() {
        return Tasks.instrumented(CreateToken.class);
    }
}
