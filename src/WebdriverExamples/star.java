package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class star {
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	static String title1 = "OrangrHRM-New level of HR Management";
	static String title2 = "OrangeHRM";
	
public static void main(String args[]) throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("launch browser-enter url");
	
	if(driver.getTitle().equals(title1)) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("login complete");
	Thread.sleep(3000);
	
	if(driver.getTitle().equals(title2)) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("Mouseover completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("clicked on submenu");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout");
	Thread.sleep(3000);
	driver.close();
	
}
}
