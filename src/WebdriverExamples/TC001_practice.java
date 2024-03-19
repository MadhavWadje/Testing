package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC001_practice {
	public static void main(String args[]) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("title not Matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("email")).sendKeys("8379053896");
		driver.findElement(By.name("pass")).sendKeys("8975459088");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		System.out.println("login application");
		
	if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title Matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
		driver.findElement(By.linkText("Logout"));
		Thread.sleep(3000);
		System.out.println("logout application");
		driver.close();
		
	}
	
	
}
