package booking.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static booking.utils.customMatch.Keywords.BOOKING;

public class GetBooking implements Task {

    private int id;
    public GetBooking(int id){
        this.id=id;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource(BOOKING+"/"+id+"").with(Request-> Request
                        .log().all()
                )
        );
    }
    public static GetBooking obtener(int id){
        return Tasks.instrumented(GetBooking.class,id);
    }
}
