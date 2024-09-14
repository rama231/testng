package Kamera;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Transfer_fund {
	WebDriver driver;
  @Test
  public void f() {
	 
	  
  }
@BeforeMethod
public void testw()
{
	 driver = new ChromeDriver();
	  driver.get("https://parabank.parasoft.com/parabank/register.htm");
	  driver.findElement(By.name("username")).sendKeys("rama@0143");
	  driver.findElement(By.name("password")).sendKeys("140603");
	  //driver.findElement(By.xpath("//*[@id="loginPanel"]/form/div[3]/input)").click();
	  driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
	  driver.manage().window().maximize();
	  String url = driver.getCurrentUrl();
	  System.out.println("URL: "+url);
	
}
}
