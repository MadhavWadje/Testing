package Com.hrms.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Genral2 extends Global2 {

public void openappln() {
	driver=new FirefoxDriver();
driver.navigate().to(url);
	System.out.println("open application");
}
public void Enterframe() {
	driver.switchTo().frame("rightMenu");
}


public void login() throws Exception {
	driver.findElement(By.name(untbx)).sendKeys(un);
	driver.findElement(By.name(pwtbx)).sendKeys(pw);
	Thread.sleep(1000);
	driver.findElement(By.name(loginbtn)).click();
	Thread.sleep(1000);
}
public void Add() throws Exception{
	//driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath(addbtn1)).click();
	Thread.sleep(1000);
	driver.findElement(By.name(lntbx)).sendKeys(ln);
	driver.findElement(By.name(fntbx)).sendKeys(fn);
	Thread.sleep(1000);
	driver.findElement(By.id(savebtn)).click();	
	//driver.switchTo().defaultContent();
	}
public void Edit() throws Exception{
	//driver.switchTo().frame("rightMenu");
	driver.findElement(By.name(Editbtn)).click();
	driver.findElement(By.name(Efntbx)).clear();
	Thread.sleep(1000);
	driver.findElement(By.name(Efntbx)).sendKeys(Efn);
	driver.findElement(By.name(Elntbx)).clear();
	Thread.sleep(1000);
	driver.findElement(By.name(Elntbx)).sendKeys(Eln);
	//driver.findElement(By.id(savebtn)).click();	
	Thread.sleep(1000);
	driver.findElement(By.id("btnEditPers")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath(Backbtn)).click();	
	//driver.switchTo().defaultContent();
}
public void Delete() {
	//driver.switchTo().frame("rightMenu");
	Select st=new Select(driver.findElement(By.name(searchdropdown)));
	st.selectByVisibleText(empid);
	driver.findElement(By.name(checkbx)).click();
	driver.findElement(By.name(searchbx)).sendKeys(empidno);
	
	driver.findElement(By.xpath(searchbtn)).click();
	driver.findElement(By.name(checkbx)).click();
	driver.findElement(By.xpath(deletebtn)).click();
	//driver.switchTo().defaultContent();
}
public void outframe() {
	driver.switchTo().defaultContent();
}
public void logout() {
	driver.findElement(By.linkText(logoutbtn)).click();
}

public void closeappln() {
	driver.close();
}

}
