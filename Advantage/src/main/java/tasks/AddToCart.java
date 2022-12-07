package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.Product.*;
import static utils.ProductWord.*;

public class AddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORY.of(CATEGORY_SPEAKER)),
                Click.on(PRODUCT.of(SOUNDLINK)),
                Click.on(ADD_TO_CART),
                Click.on(HOME),
                Click.on(CATEGORY.of(CATEGORY_TABLET)),
                Click.on(PRODUCT.of(HP_ELITE_PAD)),
                Click.on(ADD_TO_CART),
                Click.on(HOME),
                Click.on(CATEGORY.of(CATEGORY_LAPTOP)),
                Click.on(PRODUCT.of(HP_CHROMEBOOK)),
                Click.on(ADD_TO_CART),
                Click.on(SHOPPING_CART)
        );
    }
    public static AddToCart addToCart(){
        return Tasks.instrumented(AddToCart.class);
    }
}
