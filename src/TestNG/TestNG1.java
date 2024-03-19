package TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class TestNG1 {
	WebDriver driver;
@BeforeClass
public void login() {
	driver=new FirefoxDriver();
		System.out.println("login completed");
		Reporter.log("login completed");
	}
@Test
public void TC001()throws Exception {
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Reporter.log("login completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("logout completed");
}
                                                                                       
@AfterClass
	public void logout() {
	driver.quit();
	System.out.println("logout completd");
	}
}
