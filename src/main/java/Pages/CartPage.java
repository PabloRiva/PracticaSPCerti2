package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    @FindBy(id="remove-sauce-labs-backpack")
    WebElement removeButton;
    @FindBy(className = "cart_item")
    WebElement cartItem;
    @FindBy(id="checkout")
    WebElement checkOutButton;
    @FindBy(className = "title")
    WebElement title;
    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnRemoveButton(){
        removeButton.click();
    }
    public boolean productIsDisplayedOnCart(){
        boolean cartItemIsDisplayed = removeButton.isDisplayed();
        return  cartItemIsDisplayed;
    }
    public void clickOnCheckOutButton(){
        checkOutButton.click();
    }
    public boolean titleIsDisplayed(){
        boolean titleIsDisplayed = title.isDisplayed();
        return titleIsDisplayed;
    }

}
