import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.DriverManager;
import com.google.common.collect.Ordering;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Driver;
import java.util.List;

public class HomeTests extends BaseTest{
    @Test
    public void verifyAllItemsOption(){
        // Login with standard user
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        // Click on CartIcon
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnCartIcon();
        // Click on MenuIcon
        homepage.clickOnHamburguerButton();
        homepage.clickOnAllItems();
        //DriverManager.getDriver().driver.navigate().refresh(); // F5
        // Verifications
        Assert.assertTrue(homepage.appLogoIsDisplayed());
    }
    @Test
    public void verifyHighToLowPriceItemsFilterTest() {
        // Login with standard user
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        // Filtering by price
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.selectProductFilter("Price (high to low)");
        List<Double> prices = homepage.getAllItemPrices();
        boolean pricesAreSorted = Ordering.natural().reverse().isOrdered(prices);
        Assert.assertTrue(pricesAreSorted);
    }

}
