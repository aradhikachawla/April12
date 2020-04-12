package TryBrowser.TryBrowser;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestsMaven {

WebDriver driver;

 @BeforeClass
 public void setUp() {
 // String browserName = getParameter("browser");
  
  driver = new ChromeDriver();
 }

 @AfterClass
 public void tearDown() {
 // driver.quit();
 }

 private String getParameter(String name) {
  String value = System.getProperty(name);
  if (value == null)
     throw new RuntimeException(name + " is not a parameter!");

  if (value.isEmpty())
    throw new RuntimeException(name + " is empty!");

  return value;
 }

 @Test
 public void test1() {
  driver.get("http://www.vpl.ca");
 }

}

