package Practicee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Keyboard {
	public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    Thread.sleep(3000);
	Robot r=new Robot();
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(3000);

    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    driver.findElement(By.linkText("Logout")).click();
    driver.close();
    
}
}