package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class TC001_login {
	public static void main (String args[]) throws Exception{
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("open Application");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit"); 
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Thread.sleep(1000);
		driver.close();
		
	}
	

}
