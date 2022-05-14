package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.swing.text.Position;

public class C12_Odev_4 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.amazon.com");
        System.out.println("Sayfanin konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari: " + driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(15, 15));
        driver.manage().window().setSize(new Dimension(1020, 800));
        System.out.println("Sayfanin yeni konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin yeni boyutlari: " + driver.manage().window().getSize());

        Point newPosition = driver.manage().window().getPosition();
        Dimension newSize = driver.manage().window().getSize();
        Thread.sleep(4000);
        if (newPosition.equals(driver.manage().window().getPosition())&& newSize.equals(driver.manage().window().getSize())){
            System.out.println("New position and new size Test PASSED");
        }else {
            System.out.println("New position and new size Test FAILED");
        }
        driver.close();
    }
}
