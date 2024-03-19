package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC_Alerts {
public static void main(String args[]) throws Exception{
	WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");	
   
if(driver.getTitle().equals("HRMS")) {
System.out.println("title matched");
}
else {
	System.out.println("title not matched");
	System.out.println(driver.getTitle());
}

    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	
	if(driver.getTitle().equals("orangeHRM")) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("Clicked on Submenu");
	Thread.sleep(3000);
	
	
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
}
}
