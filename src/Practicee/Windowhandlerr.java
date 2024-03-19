package Practicee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.util.ArrayList;

public class Windowhandlerr {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/dell/Downloads/multiplewindows.html");
	driver.findElement(By.id("btn1")).click();
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
	driver.findElement(By.id("btn3")).click();

ArrayList <String> windoinfo = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windoinfo.get(1));
	driver.close();
	
}
}
