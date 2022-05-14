package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C13_Odev_5 {
    /*
    1.
Yeni bir class olusturalim (Homework)
2.
ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.
Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
4.
https://www.walmart.com/ sayfasina gidin.
5.
Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6.
Tekrar “facebook” sayfasina donun
7.
Sayfayi yenileyin
8.
Sayfayi tam sayfa (maximize) yapin
9.
Browser’i kapatin
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        String ecpectedTitle = "facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(ecpectedTitle)) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test is FAILED. Actual Title is : " + actualTitle);
        }

        String ecpectedUrl = "facebook";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(ecpectedUrl)) {
            System.out.println("Url test PASSED");
        } else {
            System.out.println("Url test is FAILED. Actual Url is : " + actualUrl);
        }

        Thread.sleep(2000);


        driver.get("https://www.walmart.com/");
        String ecpectedTitle1 = "Walmart.com";
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.contains(ecpectedTitle1)) {
            System.out.println("Title1 test PASSED");
        } else {
            System.out.println("Title1 test is FAILED. Actual Title1 is : " + actualTitle1);
        }
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
}
