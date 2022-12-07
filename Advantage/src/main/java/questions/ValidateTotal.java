package questions;

import interactions.Visible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ShoppingCart.PRICE;
import static utils.KeyWord.PESOS_SYMBOL;
import static utils.KeyWord.SEPARATOR;

public class ValidateTotal implements Question {

    private double sumTotal = 0;
    @Override
    public Double answeredBy(Actor actor) {
        for(int i = 1;i<4;i++){
            actor.attemptsTo(
                    Visible.waitVisible(PRICE.of(String.valueOf(i)))
            );
            String price = Text.of(PRICE.of(String.valueOf(i)).getCssOrXPathSelector()).answeredBy(actor);
            price =  price.replace(PESOS_SYMBOL,"").replace(SEPARATOR,"");
            sumTotal = sumTotal + Double.parseDouble(price);
        }
        return sumTotal;
    }
    public static ValidateTotal total(){
    return new ValidateTotal();
    }
}
