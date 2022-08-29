package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
    WebDriver driver;
    @FindBy(className = "title")
    WebElement title;

    public FinishPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean titleIsDisplayed(){
        boolean titleIsDisplayed = title.isDisplayed();
        return  titleIsDisplayed;
    }
}
