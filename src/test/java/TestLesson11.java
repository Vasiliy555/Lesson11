import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;


public class TestLesson11 extends WebDriverSettings {


  @Test
  public void testEmail(){

    driver.get("https://crm.geekbrains.space/user/login");

    driver.findElement(By.name("_username")).sendKeys("DDKiRl2@yandex.ru");
    Assert.assertEquals(driver.findElement(By.id("prependedInput")).
                      getAttribute("value"), "DDKiRl2@yandex.ru");
  }
}
