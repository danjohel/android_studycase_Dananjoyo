package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class ReceiptPage {

    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement noChangeLabel = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("change_text_view")));
        return noChangeLabel.isDisplayed();
    }
}
