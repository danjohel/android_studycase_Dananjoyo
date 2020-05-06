package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class LoginPage {

    public boolean isOnLoginPage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement mokaLogo = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("icon_moka_image_view")));
        return mokaLogo.isDisplayed();
    }

    public void inputUsername(String username){
        WebElement inputUsername = AndroidDriverInstance.androidDriver.findElement(By.id("emailOrPhoneEditText"));
        inputUsername.sendKeys(username);
    }

    public void inputPassword(String password){
        WebElement inputPassword = AndroidDriverInstance.androidDriver.findElement(By.id("passwordEditText"));
        inputPassword.sendKeys(password);
    }

    public void clickSignIn(){
        WebElement signInButton = AndroidDriverInstance.androidDriver.findElement(By.id("signInButton"));
        signInButton.click();
    }
}
