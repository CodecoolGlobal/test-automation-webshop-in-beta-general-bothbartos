package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Item extends BaseComponent {

    @FindBy(xpath = "//*[@data-test='nventory-item-name']")
    private WebElement itemName;

    @FindBy(xpath = "//*[@data-test='inventory-item-price']")
    private WebElement itemPrice;

    @FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCart;

    public Item(WebElement root) {
        super(root);
        PageFactory.initElements(root, this);
    }

    public String getName() {
        return itemName.getText();
    }

    public double getPrice() {
        return Double.parseDouble(itemPrice.getText());
    }

    public void addToCart() {
        addToCart.click();
    }
}
