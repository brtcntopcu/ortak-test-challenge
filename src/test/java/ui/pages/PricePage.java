package ui.pages;

import ui.base.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricePage extends WebDriverHelper {

    By REJECT_COOKIE_BUTTON = By.id("onetrust-reject-all-handler");
    By TIME_FRAME_BUTTONS = By.xpath("//div[@class='css-1tassqi']//button");
    By SELECTED_CURRENCY_CLASS_NAME = By.className("bn-sdd-input");
    By PRICE_STRING_CLASS_NAME = By.className("css-1bwgsh3");
    By MONEY_CURRENCY_SEARCH = By.className("css-vrydq2");

    public PricePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void rejectCookies() {
        click(REJECT_COOKIE_BUTTON);
    }

    public void clickEachTimeFrameButton() {
        int elementSize  = findElementGroup(TIME_FRAME_BUTTONS).size();
        for(int i = 0; i < elementSize; i++){
            if(findElementGroup(TIME_FRAME_BUTTONS).get(i).isEnabled() & findElementGroup(TIME_FRAME_BUTTONS).get(i).isDisplayed()){
                findElementGroup(TIME_FRAME_BUTTONS).get(i).click();
            }
        }
    }

    public String getSelectedCurrencyValue() {
        return
                getElement(SELECTED_CURRENCY_CLASS_NAME).getAttribute("value");
    }

    public String getPriceString() {
        return
                getText(PRICE_STRING_CLASS_NAME);
    }

    public void clickSelectedMoneyCurrency() {
        click(SELECTED_CURRENCY_CLASS_NAME);
    }

    public void searchMoneyCurrency(String text) {
        sendKeys(MONEY_CURRENCY_SEARCH, text);
    }

    public void chooseMoneyCurrency(String moneyCurrencyID) {
        click(By.id(moneyCurrencyID));
    }
}
