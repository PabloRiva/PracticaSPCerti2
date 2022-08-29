package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;
    @FindBy(id = "first-name")
    WebElement nameTextBox;
    @FindBy(id = "last-name")
    WebElement lastNameTextBox;
    @FindBy(id = "postal-code")
    WebElement zipTextBox;
    @FindBy(id = "continue")
    WebElement continueButton;
    @FindBy(className = "error")
    WebElement error;
    @FindBy(id = "cancel")
    WebElement cancelButton;
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnContinueButton(){
        continueButton.click();
    }
    public boolean errorMessageIsDisplayed(){
        boolean errorMessageIsDisplayed = error.isDisplayed();
        return  errorMessageIsDisplayed;
    }
    public void clickOnCancelButton(){
        cancelButton.click();
    }
    public void setNameTextBox(String name){
        nameTextBox.sendKeys(name);
    }
    public void setLastNameTextBox(String lastName){
        lastNameTextBox.sendKeys(lastName);
    }
    public void setZipTextBox(String zip){
        zipTextBox.sendKeys(zip);
    }
}
