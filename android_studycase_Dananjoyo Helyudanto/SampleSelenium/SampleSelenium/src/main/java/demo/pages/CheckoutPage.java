package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    public void clickOnLowestCash(){
        WebElement lowestButton = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_lowest"));
        lowestButton.click();
    }

    public void clickOnChargeButton(){
        WebElement chargeButton = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        chargeButton.click();
    }
}
