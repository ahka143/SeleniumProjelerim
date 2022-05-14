package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C09_Odev_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Sayfa basligi: " + driver.getTitle());
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title test is PASSED");
        } else {
            System.out.println("Title test is FAILED");
        }

        System.out.println("Sayfa url'i: " + driver.getCurrentUrl());
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Url test is PASSED");
        } else {
            System.out.println("Url test is FAILED");
        }

        System.out.println("Sayfa handle degeri: " + driver.getWindowHandle());

        String expectedWord = "alisveris";
        String actualHtmlCodes = driver.getPageSource();

        if (actualHtmlCodes.contains(expectedWord)) {
            System.out.println("Html codes " + expectedWord + " test is PASSED");
        } else {
            System.out.println("Html codes " + expectedWord + " test is FAILED");
        }
        driver.close();
    }
}
