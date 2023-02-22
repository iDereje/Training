package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.linkText("REGISTER")).click();
        WebElement userName = driver.findElement(By.id("email"));
        userName.click();
        userName.sendKeys("Expiriment1@gmail");
        WebElement password = driver.findElement(By.name("password"));
        userName.click();
        userName.sendKeys("Dave");
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));

  }
}
