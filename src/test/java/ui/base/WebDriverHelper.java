package ui.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebDriverHelper {
    WebDriver webDriver;
    Duration timeOut = Duration.ofSeconds(30);
    public WebDriverHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void click(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).click();
    }

    public WebElement getElement(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        return wait.until(ExpectedConditions.elementToBeClickable(byElement));
    }

    public void sendKeys(By byElement, String text) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).sendKeys(text);
    }
    public String getText(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)).getText();
    }

    public void waitUntilURLChange(String newURL) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        wait.until(ExpectedConditions.urlToBe(newURL));
    }

    public List<WebElement> findElementGroup(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)).getText();
        return webDriver.findElements(byElement);
    }
}