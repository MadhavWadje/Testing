package Practicee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.systeminfo.SystemInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class TC001 {
public static void main(String[] args)throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
//Alert	
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	Alert a= driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	
	//mouseover
	//Actions ac=new Actions(driver);
	//ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	//Thread.sleep(3000);	
	//driver.findElement(By.linkText("Add Employee")).click();
	
	//frames
//	driver.switchTo().frame("rightMenu");
//	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
//	driver.findElement(By.name("txtEmpLastName")).sendKeys("nareshit");
//	driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
//	driver.findElement(By.id("btnEdit")).click();
//	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
	
	
}
}
