package WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Dropdown {
	public static void main(String[] args)throws Exception {
		WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		Thread.sleep(3000);
		driver.findElement(By.name("loc_name")).sendKeys("3484");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@Value='Delete'])")).click();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
}
}
