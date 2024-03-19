package Practicee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();	
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame("rightMenu");
	  Select st=new Select(driver.findElement(By.name("loc_code")));
      st.selectByVisibleText("Emp.ID");
        driver.findElement(By.name("chkLocID[]")).sendKeys("7331");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
	    driver.findElement(By.name("chkLocID[]")).click();
	    driver.findElement(By.xpath("//input[@value='Delete']")).click();
	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.linkText("Logout")).click();
	    driver.close();
	    
}
}