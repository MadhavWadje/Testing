package Practicee;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandle  {
public static void main(String[] args)throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/dell/Downloads/multiplewindows.html");
	Thread.sleep(3000);
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String> windoinfo = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windoinfo.get(1 ));
	Thread.sleep(3000);

	driver.quit();
	
}
}
