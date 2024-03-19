package Com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import Com.hrms.utility.Log;

public class General extends Global {
	
public void openapplication() {
	driver=new FirefoxDriver();
driver.navigate().to(url);
	System.out.println("open application");
	
}
	
	public void Login() throws Exception {
	driver.findElement(By.name(Txt_un)).sendKeys(un);
	driver.findElement(By.name(Txt_pw)).sendKeys(pw);
	driver.findElement(By.name(login_btn)).click();
	System.out.println("login completed");
	
//Add
//	driver.switchTo().frame("rightMenu");
//	driver.findElement(By.xpath(Add_btn)).click();
//	Thread.sleep(3000);
//	driver.findElement(By.name(Txt_ln)).sendKeys(Ln);
//	driver.findElement(By.name(Txt_fn)).sendKeys(Fn);
//	Thread.sleep(3000);
//	driver.findElement(By.id(save_btn)).click();
//	Thread.sleep(1000);
//driver.switchTo().defaultContent();
	}
//Edit EMP
	public void EditEmp() throws Exception{
driver.findElement(By.name(Edit_btn)).click();
driver.findElement(By.name(Edit_fn1)).clear();
Thread.sleep(2000);
driver.findElement(By.name(Edit_fn1)).sendKeys("MSW");

Thread.sleep(2000);

driver.findElement(By.name(Edit_ln1)).clear();
Thread.sleep(2000);
driver.findElement(By.name(Edit_ln1)).sendKeys("MS");
Thread.sleep(2000);
driver.findElement(By.name(Edit_savebtn)).click();
//driver.findElement(By.xpath(Backbtn)).click();
//driver.findElement(By.name("")).click();
//driver.switchTo().defaultContent();
	}
	
	//Delete
	public void Delete() throws Exception {
		driver.switchTo().frame("rightMenu");
	Select st=new Select(driver.findElement(By.name(delete_dropdown)));
	
	st.selectByVisibleText("Emp. ID");
	driver.findElement(By.name(delete_search)).sendKeys(delete_EmpId1);
	driver.findElement(By.xpath(delete_searchbtn)).click();
	
	driver.findElement(By.id(delete_checkbx)).click();
	driver.findElement(By.xpath(delete_deletebtn)).click();
	WebElement delete=driver.findElement(By.xpath(delete_deletebtn));
	delete.getText();
	System.out.println(delete);
driver.switchTo().defaultContent();
	
	
	}
	

	
	
	public void Logout() {
		driver.findElement(By.linkText(logout_btn)).click();
		System.out.println("logout completed");
	}
public void Closeapplication() {
	driver.close();
	System.out.println("application is closed");

}
	
}
