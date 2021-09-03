import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestLesson11 {


  @Test
  public void testEmail(){
    System.setProperty("webdriver.chrome.driver",
            "src/main/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    driver.get("https://crm.geekbrains.space/user/login");

    driver.findElement(By.name("_username")).sendKeys("DDKiRl2@yandex.ru");
    Assert.assertEquals(driver.findElement(By.id("prependedInput")).
                      getAttribute("value"), "DDKiRl2@yandex.ru");

    driver.quit();
  }
}
