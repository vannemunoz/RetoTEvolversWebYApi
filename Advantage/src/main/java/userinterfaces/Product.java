package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Product {
    public static final Target HOME = Target.the("btn home")
            .located(By.xpath("//a[contains(text(),'HOME')]"));
    public static final Target CATEGORY = Target.the("Category product")
            .locatedBy("//span[@id='{0}']");
    public static final Target PRODUCT = Target.the("Category product")
            .locatedBy("//a[contains(text(),'{0}')]");
    public static final Target ADD_TO_CART = Target.the("add to cart")
            .located(By.name("save_to_cart"));
    public static final Target SHOPPING_CART = Target.the("add to cart")
            .located(By.id("shoppingCartLink"));


}
