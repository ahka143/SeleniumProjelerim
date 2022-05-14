package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C11_Odev_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.amazon.com");
        System.out.println("Sayfanin konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari: " + driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("Sayfanin maximize durumunda konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin maximize durumunda boyutlari: " + driver.manage().window().getSize());
        driver.manage().window().fullscreen();
        System.out.println("Sayfanin fullscreen durumunda konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin fullscreen durumunda boyutlari: " + driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.close();
    }
}
