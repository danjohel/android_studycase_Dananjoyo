package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class FavoritePage {
    public boolean isOnFavoritePage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement mokaLogo = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("toolbar_bar_favourite")));
        return mokaLogo.isDisplayed();
    }

    public void addItem(String itemName, int quantity){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'grid_favourite_name') and @text = '"+itemName+"']";
        AndroidElement item = androidDriver.findElement(By.xpath(xpath));

        for(int i=0; i < quantity; i++){
            item.click();
        }
    }

    public boolean isItemExist(String itemName){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'name_text_view') and @text = '"+itemName+"']";
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement itemList = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return itemList.isDisplayed();
    }

    public void clickOnChargeFavorite(){
        WebElement chargeButton = AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton"));
        chargeButton.click();
    }
}
