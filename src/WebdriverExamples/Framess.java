package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Framess {
	public static void main(String[] args)throws Exception {
	WebDriver driver=new FirefoxDriver();	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
	Thread.sleep(6000);
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Aman");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Fullstack Java");
	driver.findElement(By.name("txtEmpMiddleName")).sendKeys("nareshit");
	driver.findElement(By.id("btnEdit")).click();
	Thread.sleep(10000);
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	
	}
}
