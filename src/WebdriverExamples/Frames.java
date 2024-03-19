package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Frames {
public static void main(String[] args) throws Exception {
WebDriver driver=new FirefoxDriver();	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
	
driver.switchTo().frame("rightmenu");
driver.findElement(By.xpath("//input[@valve='Add'][@Type='button']"));
Thread.sleep(3000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("Shubham");
driver.findElement(By.name("txtEmpLastName")).sendKeys("Bhardwaj");
driver.findElement(By.id("btnEdit")).click();
System.out.println("New Employee Added");
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();
}	
}
