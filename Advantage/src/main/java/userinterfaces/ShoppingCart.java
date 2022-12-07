package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCart {
    public static final Target PRICE = Target.the("price of products")
            .locatedBy("(//td[@class='smollCell']//p[@class='price roboto-regular ng-binding'])[{0}]");
    public static final Target TOTAL = Target.the("total of products")
            .located(By.xpath("(//td[@colspan='2']//span[@class='roboto-medium ng-binding'])[2]"));
}
