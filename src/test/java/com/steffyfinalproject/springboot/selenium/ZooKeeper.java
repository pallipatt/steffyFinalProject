/*package com.steffyfinalproject.springboot.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZooKeeper {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "/Users/jmath9/steffyFinalProject/src/test/java/com/steffyfinalproject/springboot/selenium/chromedriver");
		driver = new ChromeDriver();
    baseUrl = "http://localhost:8080/#/schedule";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.linkText("Food Details")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.name("food-name")).clear();
  /*  driver.findElement(By.name("food-name")).sendKeys("sadsa");
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Fish");
    new Select(driver.findElement(By.name("vendor"))).selectByVisibleText("Lafeber Company");
    driver.findElement(By.cssSelector("lable > button[type=\"button\"]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//div[@id='container1']/div/table/tbody/tr[4]/td[2]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    new Select(driver.findElement(By.id("inputvendorName"))).selectByVisibleText("Bravo Packing, Inc.");
    new Select(driver.findElement(By.id("inputcategoryName"))).selectByVisibleText("Meat");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.linkText("Animal Details")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.name("animal-Cname")).clear();
    driver.findElement(By.name("animal-Cname")).sendKeys("ddd");
    driver.findElement(By.name("animal-Sname")).clear();
    driver.findElement(By.name("animal-Sname")).sendKeys("ddd");
    new Select(driver.findElement(By.name("favfood"))).selectByVisibleText("Premium Daily Diet");
    driver.findElement(By.name("animal-link")).clear();
    driver.findElement(By.name("animal-link")).sendKeys("http://www.ggg.com");
    driver.findElement(By.cssSelector("button.btn-md")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//div[@id='container1']/div/table/tbody/tr/td[3]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.id("inputScientificName")).clear();
    driver.findElement(By.id("inputScientificName")).sendKeys("Cercopithecidaefff");
    new Select(driver.findElement(By.id("inputfavFood"))).selectByVisibleText("Premium Daily Diet");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.linkText("Enclosure Details")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//td[2]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    new Select(driver.findElement(By.name("animal"))).selectByVisibleText("Giraffe");
    new Select(driver.findElement(By.name("condition"))).selectByVisibleText("Criminal");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//td[2]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
*/