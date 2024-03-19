package Practicee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Fileupload {
   public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();	
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
		Thread.sleep(6000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Selenium");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Selenium");
		
		//File upload
	WebElement fileinput=driver.findElement(By.xpath("//input[@Type='file'][@name='Photofile']"));
		fileinput.sendKeys("C:\\Users\\dell\\Desktop\\SQL.pdf");
	    Thread.sleep(3000);
System.out.println("File uploaded successfully");
		
		driver.findElement(By.id("btnEdit")).click();
		driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();
   }
}
