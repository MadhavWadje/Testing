package Com.hrms.lib3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.hrms.utility.Log;

import org.openqa.selenium.By;

public class General3 extends Global3 {
	
public void openappln() {
	 driver = new FirefoxDriver();
	driver.navigate().to(url);
}

public void closeappln() throws Exception {
	driver.close();
	Thread.sleep(2000);
	//driver.quit();
}	

public void login() throws Exception {
	driver.findElement(By.name(untbx)).sendKeys(un);
	driver.findElement(By.name(pwtbx)).sendKeys(pw);
	Thread.sleep(2000);
	driver.findElement(By.name(loginbtn)).click();
	System.out.println("login completed");
    Thread.sleep(2000);
}

public void logout() {
	driver.findElement(By.linkText(logoutbtn)).click();
	System.out.println("logout completed");
}

public void Add() throws Exception{
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath(addbtn)).click();
	driver.findElement(By.name(fntbx)).sendKeys(fn);
	driver.findElement(By.name(lntbx)).sendKeys(ln);
	driver.findElement(By.name(midlnmtbx)).sendKeys(midlnm);
	driver.findElement(By.name(nntbx)).sendKeys(nn);
    Thread.sleep(3000);
	driver.findElement(By.id(savebtn)).click();
	System.out.println("save completed");
	Log.info("save completed");
	driver.findElement(By.name(editbtn)).click();
	driver.findElement(By.name(editfnbx)).clear();
    Thread.sleep(3000);
	driver.findElement(By.name(editfnbx)).sendKeys(editfn);
	driver.findElement(By.name(editlnbx)).clear();
    Thread.sleep(3000);
	driver.findElement(By.name(editlnbx)).sendKeys(editln);
    Thread.sleep(3000);
    driver.findElement(By.name(editbtn)).click();
    driver.findElement(By.xpath(backbtn)).click();
    Thread.sleep(3000);

	driver.switchTo().defaultContent();
	
	
}


}
