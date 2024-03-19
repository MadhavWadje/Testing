package Practicee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;                                                                
import java.util.ArrayList;

public class WindowHandler {
public static void main(String[] args) throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/dell/Downloads/multiplewindows.html");
	driver.findElement(By.id("btn2")).click();
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList <String> windowinfo=new ArrayList <> (driver.getWindowHandles());
	driver.switchTo().window(windowinfo.get(0));
	driver.close();
}
}
