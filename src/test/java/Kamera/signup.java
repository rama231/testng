package Kamera;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class signup{
	WebDriver driver;
	
	
	@Test(priority = 0,enabled= false)  // This test will not run
	  public void Signup1() {
		  //driver.findElement(By.class("//*[@id='cookie-modal']/div/div/div/button")).click();

		 
		  driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		  driver.findElement(By.id("customer.firstName")).sendKeys("Rama");
		  driver.findElement(By.id("customer.lastName")).sendKeys("Bhargava");
		  driver.findElement(By.id("customer.address.street")).sendKeys("Mohali");
		  driver.findElement(By.name("customer.address.city")).sendKeys("Chandigarh");
		  driver.findElement(By.name("customer.address.state")).sendKeys("Punjab");
		 // driver.findElement(By.id("Codecustomer.address.zipCode")).sendKeys("1401603");
		  driver.findElement(By.id("customer.address.zipCode")).sendKeys("1401603");
		  driver.findElement(By.id("customer.phoneNumber")).sendKeys("8978987878");
		  driver.findElement(By.name("customer.ssn")).sendKeys("140603");
		  driver.findElement(By.name("customer.username")).sendKeys("rama@0143");
		  driver.findElement(By.name("customer.password")).sendKeys("140603");
		  driver.findElement(By.name("repeatedPassword")).sendKeys("140603");
		 //driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
		 
	}

		 @Test(priority=1)
		 void open_acount()
		 {
		//Open acount
		driver.findElement(By.xpath("//a[normalize-space()='Open New Account']")).click();
		//driver.findElement(By.xpath("//*[@id=\"type\"]")).sendKeys("value=2");
		driver.findElement(By.xpath("//select[@id='type']")).click();
		//Select dropdown = new Select(driver.findElement(By.id("type")));
        //dropdown.selectByValue("vlaue=1");
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='type']")));
        dropdown.selectByValue("1");
        driver.findElement(By.className("button")).click();
		 }
		 @Test(priority=2)
		 void over_view_acount() {
			 driver.findElement(By.xpath("//a[normalize-space()='Accounts Overview']")).click();
		 }
		 @Test(priority=3,enabled=true)
		 public void tranfer_fund() {
			 driver.findElement(By.xpath("//a[normalize-space()='Transfer Funds']//a[normalize-space()='Transfer Funds']")).click();
			 driver.findElement(By.id("amount")).sendKeys("10");	
			 
			 
			 
		 }
	
	
	@BeforeMethod
	public void beforeMethod(ITestResult result) throws Throwable {
       // String testName = result.getMethod().getMethodName();
      //  if (!testName.equals("Signup1")) {
		  driver = new ChromeDriver();
		  driver.get("https://parabank.parasoft.com/parabank/register.htm");
		  driver.findElement(By.name("username")).sendKeys("rama@0143");
		  driver.findElement(By.name("password")).sendKeys("140603");
		  //driver.findElement(By.xpath("//*[@id="loginPanel"]/form/div[3]/input)").click();
		  driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
		  driver.manage().window().maximize();
		  String url = driver.getCurrentUrl();
		  System.out.println("URL: "+url);
		  Thread.sleep(2000);
		//To delete cookies
		driver.manage().deleteAllCookies();
        }
		  
	//  }
	  @AfterMethod
	  public void afterMethod() {
	  }
	}
