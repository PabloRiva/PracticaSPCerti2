import Pages.*;
import Utilities.DriverManager;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class checkOutTests extends BaseTest{
    @Test @Ignore
    public void verifyErrorMessageIsShownWhenThereIsNoData(){
        // Login with standard user
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        // Adding a product
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnAddSauceLabsBackPackToCartButton();
        // Click on Cart Button
        homepage.clickOnCartIcon();
        // Click on checkout button
        CartPage cartPage = new CartPage(DriverManager.getDriver().driver);
        cartPage.clickOnCheckOutButton();
        // Click on Continue button
        CheckoutPage checkOutPage = new CheckoutPage(DriverManager.getDriver().driver);
        checkOutPage.clickOnContinueButton();
        // Verifications
        Assert.assertTrue(checkOutPage.errorMessageIsDisplayed());
    }
    @Test @Ignore
    public void verifyCancelButtonIsWorking(){
        // Login with standard user
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        // Adding a product
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnAddSauceLabsBackPackToCartButton();
        // Click on Cart Button
        homepage.clickOnCartIcon();
        // Click on checkout button
        CartPage cartPage = new CartPage(DriverManager.getDriver().driver);
        cartPage.clickOnCheckOutButton();
        // Click on Continue button
        CheckoutPage checkOutPage = new CheckoutPage(DriverManager.getDriver().driver);
        checkOutPage.clickOnCancelButton();
        // Verifications
        Assert.assertTrue(cartPage.titleIsDisplayed());
    }
    @Test
    public void verifyContinueButtonIsWorkingWhenTheDataIsOK(){
        // Login with standard user
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        // Adding a product
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnAddSauceLabsBackPackToCartButton();
        // Click on Cart Button
        homepage.clickOnCartIcon();
        // Click on checkout button
        CartPage cartPage = new CartPage(DriverManager.getDriver().driver);
        cartPage.clickOnCheckOutButton();
        // Click on Continue button
        CheckoutPage checkOutPage = new CheckoutPage(DriverManager.getDriver().driver);
        checkOutPage.setNameTextBox("Pablo");
        checkOutPage.setLastNameTextBox("Riva Ponce");
        checkOutPage.setZipTextBox("0000");
        checkOutPage.clickOnContinueButton();
        // Validations
        OverviewPage overviewPage = new OverviewPage(DriverManager.getDriver().driver);
        Assert.assertTrue(overviewPage.titleIsDisplayed());
    }
    @Test
    public void verifyFinishButtonIsWorking(){
        // Login with standard user
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        // Adding a product
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnAddSauceLabsBackPackToCartButton();
        // Click on Cart Button
        homepage.clickOnCartIcon();
        // Click on checkout button
        CartPage cartPage = new CartPage(DriverManager.getDriver().driver);
        cartPage.clickOnCheckOutButton();
        // Click on Continue button
        CheckoutPage checkOutPage = new CheckoutPage(DriverManager.getDriver().driver);
        checkOutPage.setNameTextBox("Pablo");
        checkOutPage.setLastNameTextBox("Riva Ponce");
        checkOutPage.setZipTextBox("0000");
        checkOutPage.clickOnContinueButton();
        // Click on Finish button
        OverviewPage overviewPage = new OverviewPage(DriverManager.getDriver().driver);
        overviewPage.clickOnFinishButton();
        // Validations
        FinishPage finishPage = new FinishPage(DriverManager.getDriver().driver);
        Assert.assertTrue(finishPage.titleIsDisplayed());
    }
}
