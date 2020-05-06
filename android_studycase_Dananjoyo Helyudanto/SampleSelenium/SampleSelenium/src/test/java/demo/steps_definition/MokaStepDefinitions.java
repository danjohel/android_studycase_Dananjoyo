package demo.steps_definition;

import demo.pages.*;
import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MokaStepDefinitions {

  private LoginPage loginPage = new LoginPage();
  StartPage startPage = new StartPage();
  private FavoritePage favoritePage = new FavoritePage();
  private CheckoutPage checkoutPage = new CheckoutPage();
  private ReceiptPage receiptPage = new ReceiptPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @Then("User see moka logo")
  public void userSeeMokaLogo() {
    loginPage.isOnLoginPage();
    boolean logPage = loginPage.isOnLoginPage();
    Assert.assertTrue(logPage);
  }

  @When("User input username {string}")
  public void userInputUsername(String username) {
    loginPage.inputUsername(username);
  }

  @And("User input password {string}")
  public void userInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @And("click on Sign In button")
  public void clickOnSignInButton() {
    loginPage.clickSignIn();
  }

  @Then("User is on favorite tab")
  public void userSeeFavoriteTab() {
    favoritePage.isOnFavoritePage();
    boolean favPage = favoritePage.isOnFavoritePage();
    Assert.assertTrue(favPage);
  }


  @When("User click {string} with quantity {int}")
  public void userClick(String itemName, int quantity) {
    favoritePage.addItem(itemName, quantity);
  }

  @Then("User see {string} in shopping cart")
  public void userSeeMenuInShoppingCart(String itemName) {
    favoritePage.isItemExist(itemName);
    boolean isExist = favoritePage.isItemExist(itemName);
    Assert.assertTrue(isExist);
  }

  @When("User click on Charge button")
  public void userClickOnChargeButton() {
    favoritePage.clickOnChargeFavorite();
  }

  @And("User click on cash suggestion1")
  public void userClickOnCashSuggestion() {
    checkoutPage.clickOnLowestCash();
  }

  @And("User click on Charge button in Checkout Pop Up Page")
  public void userClickOnChargeButtonInCheckoutPopUpPage() {
    checkoutPage.clickOnChargeButton();
  }

  @Then("User see {string} label")
  public void userSeeLabel(String word) {
    receiptPage.isOnPage();
    String label = AndroidDriverInstance.androidDriver.findElement(By.id("change_text_view")).getText();
    Assert.assertEquals(word, label);
  }
}
