package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC002 {
	WebDriver driver;
@BeforeClass
	public void login() {
		System.out.println("login completed");
	}
@Test(priority=2)
	public void add() {
		System.out.println("add");
	}
@Test(priority=1)

public void TC001()throws Exception {
	driver=new FirefoxDriver();
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
		System.out.println("logout complete");
	}
	
	
	

}
