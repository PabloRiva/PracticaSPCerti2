package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
    WebDriver driver;
    @FindBy(className = "title")
    WebElement title;
    @FindBy(id = "finish")
    WebElement finish;
    public OverviewPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean titleIsDisplayed(){
        boolean titleIsDisplayed = title.isDisplayed();
        return titleIsDisplayed;
    }
    public void clickOnFinishButton(){
        finish.click();
    }
}
