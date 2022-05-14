package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C10_Odev_2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
    }
}
