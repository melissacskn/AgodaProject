package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.List;

public class HomePage {
    WebDriver driver;
    By placeName = By.cssSelector("input[placeholder=\"Yer veya tesis adı yazın\"]");
    By modal = By.cssSelector("body > div.ab-iam-root.v3.ab-animate-in.ab-animate-out.ab-effect-modal.ab-show > div.ab-in-app-message.ab-background.ab-modal-interactions.ab-modal.ab-centered > div.ab-message-buttons > button:nth-child(2)");
    By istanbul = By.cssSelector("li[data-text=\"İstanbul\"]");
    String month = "Ekim 2022";


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement elementFinder(By locator) {
        return driver.findElement(locator);

    }

    public void selectPlace() {


        elementFinder(placeName).sendKeys("İstanbul");
        elementFinder(placeName).sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                modal));
        elementFinder(modal).click();
        elementFinder(istanbul).click();


    }

    public void selectGoingDate() {
        WebElement goingDayButton = driver.findElement(By.cssSelector("i[class=\"ficon IconBox__icon ficon-20 ficon-check-in\"]"));
        goingDayButton.click();
        goingDayButton.click();
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class=\"DayPicker-Caption DayPicker-Caption-Wide\"]"));
        System.out.println(elements.size());
        System.out.println(elements.get(0).getText());
        String text = elements.get(0).getText();

        while (true) {
            if (text.equals(month)) {
                break;
            } else {
                driver.findElement(By.cssSelector("span[aria-label=\"Next Month\"]")).click();
            }

        }
        driver.findElement(By.cssSelector("div[aria-label=\"Fri Oct 28 2022\"]")).click();
        driver.findElement(By.cssSelector("div[aria-label=\"Thu Nov 10 2022\"]")).click();
    }


    public void personPicking() {
        driver.findElement(By.cssSelector("i[class=\"ficon IconBox__icon ficon-20 ficon-travelers\"]")).click();
       // driver.findElement(By.cssSelector("i[class=\"ficon IconBox__icon ficon-20 ficon-travelers\"]")).click();

        /*List<WebElement> elements=driver.findElements(By.cssSelector("div[data-selenium=\"plus\"]"));
        elements.get(1).click();

         */
        //driver.findElement(By.cssSelector("div[data-element-name=\"traveler-couples\"]")).click();
        //driver.findElement(By.cssSelector("div[class=\"IconBox IconBox--occupancy IconBox--focused\"]")).click();


        driver.findElement(By.cssSelector("button[data-selenium=\"searchButton\"]")).click();

    }




}

