package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_Frame {
	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("rightmenu");
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Madhav");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("selenium");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
