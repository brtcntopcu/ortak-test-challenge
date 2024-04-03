package ui.tests;

import ui.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pages.PricePage;

public class PricePageTest extends TestBase {

    @Test
    public void clickEachTimeFrameButtonTest()  {
        PricePage pricePage = new PricePage(webDriver);
        pricePage.rejectCookies(); //close cookie bottom bar
        pricePage.clickEachTimeFrameButton(); //click each time frames button if it is clickable
    }

    @Test
    public void checkTickerCurrencySymbol() {
        PricePage pricePage = new PricePage(webDriver);
        pricePage.rejectCookies();

        String selectedCurrency = pricePage.getSelectedCurrencyValue();//get selected currency USD - $, EUR - € etc.
        String[] sc = selectedCurrency.split(" ");//selected currency value into array to get that currency symbol

        String wordTwo = pricePage.getPriceString(); //$ 65,889.65
        String[] ps = wordTwo.split(" ");//current price string into array to get that price symbol

        Assert.assertEquals(sc[2], ps[0]);
    }

    @Test
    public void searchMoneyCurrency()  {
        PricePage pricePage = new PricePage(webDriver);
        String urlWithTRYFilter = "https://www.binance.com/tr/price/bitcoin/TRY";
        pricePage.rejectCookies();
        pricePage.clickSelectedMoneyCurrency();//open dropdown menu
        pricePage.searchMoneyCurrency("TRY");//search currency in menu
        pricePage.chooseMoneyCurrency("TRY_USD");//choose currency
        pricePage.waitUntilURLChange(urlWithTRYFilter);//wait until url is changed, url is end with selected currency but usd, when usd is selected url end with bitcoin
        String currentURL = webDriver.getCurrentUrl();//get current url
        String[] cu = currentURL.split("/");
        Assert.assertEquals("TRY", cu[cu.length - 1]);//verify money currency changes is applied
    }
}
