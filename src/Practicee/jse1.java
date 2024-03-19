package Practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();	
	driver.get("http://183.82.103.245/nareshit/index.php");
	   driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	   driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	 
	   //using javascriptExecuter to click on login btn
    WebElement element = driver.findElement(By.name("Submit"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	Thread.sleep(3000);
	System.out.println("Login completed");
	
	       // using javascriptExecuter to click on logout
	WebElement logout = driver.findElement(By.linkText("Logout"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", logout);
	System.out.println("Logout completed");

	driver.close();
	}
}
