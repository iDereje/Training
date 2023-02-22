package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YoutubeTest {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();

//    System.setProperty("webdriver.chrome.drive" , "chromDriver/chromedriver.exe");
    WebDriver driver = new ChromeDriver() ;
    driver.manage().window().maximize();
    driver.get("http://youtube.com");
driver.findElement(By.name("search_query")).click();
    driver.findElement(By.name("search_query")).sendKeys("Rihanna  what now ", Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.linkText("Rihanna - What Now (Official)")).click();
driver.findElement(By.xpath("//*[@id='segmented-like-button']/ytd-toggle-button-renderer/yt-button-shape/button")).click();
driver.findElement(By.linkText("Sign in")).click();
WebElement search = driver.findElement(By.name("identifier"));
search.click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

search.sendKeys("derejeisack",Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);




  }
}
