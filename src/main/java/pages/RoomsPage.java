package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class RoomsPage {
    WebDriver driver;
    public RoomsPage(WebDriver driver){
        this.driver=driver;
    }
    public void rooms() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Scroll down till the bottom of the page  Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(1000,2000)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(2000,3000)");
        Thread.sleep(3000);
         js.executeScript("window.scrollBy(3000,4000)");


        List<WebElement> hotels = driver.findElements(By.cssSelector("div[class='Box-sc-kv6pi1-0 bWGdbw PropertyCardPrice PropertyCardPrice--Display']"));
        for (WebElement hotel: hotels) {

            String texts = hotel.getText();
            System.out.println(texts);
        }
    }

}

        /*
        List<WebElement> elements2 = driver.findElements(By.cssSelector("li[data-hotelid] div[data-element-name=\"final-price\"]"));
        System.out.println(elements2.size());
        

        System.out.println(elements.size());
        String hotel1= elements.get(0).getText();
        System.out.println(hotel1.split("\n")[14]);
        System.out.println(hotel1);

/*
        List<String> list1=new ArrayList<String>();
        int i;
        for(i=0;i<elements.size();i++){
            list1.add(elements.get(i).getText().split("\n")[1]);
        }
        System.out.println(list1.get(0));


        for (String a:list1){
            System.out.println(a);
        }
*/



