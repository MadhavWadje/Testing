package WebdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Keys1 {
public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	//driver.findElement(By.name("q")).sendKeys(Keys.
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.close();
}
	
}
