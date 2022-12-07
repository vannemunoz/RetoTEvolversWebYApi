package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;
import questions.ValidateTotal;
import tasks.AddToCart;

import static userinterfaces.ShoppingCart.TOTAL;
import static utils.KeyWord.PESOS_SYMBOL;
import static utils.KeyWord.SEPARATOR;

public class ShoppingCarStepDefinition {

    @When("you select products to add to the shopping cart")
    public void you_select_products_to_add_to_the_shopping_cart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.addToCart());
    }
    @Then("the products are displayed in the shopping cart with the total price of the products.")
    public void the_products_are_displayed_in_the_shopping_cart_with_the_total_price_of_the_products() {
        String total = Text.of(TOTAL).answeredBy(OnStage.theActorInTheSpotlight());
        total = total.replace(SEPARATOR,"").replace(PESOS_SYMBOL,"");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTotal.total(), Matchers.is(Double.parseDouble(total))));

    }
}
