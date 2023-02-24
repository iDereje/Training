package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    userName.sendKeys(Keys.TAB);

    driver.findElement(By.name("password")).sendKeys("Dave123", Keys.TAB);

    driver.findElement(By.name("confirmPassword")).sendKeys("Dave123", Keys.TAB, Keys.ENTER);

    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")).click();

    WebElement userName1 = driver.findElement(By.name("userName"));

    userName1.click();

    userName1.sendKeys("Expiriment1@gmail", Keys.TAB);

    WebElement password1 = driver.findElement(By.name("password"));

    password1.sendKeys("Dave123", Keys.TAB, Keys.ENTER);


//        driver.findElement(B)

  }
}
