package org.hrms.lib1;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General1 extends Global1 {
	
public void openappln() {
		driver=new FirefoxDriver();
		driver.navigate().to(url);
}
	
public void Login()throws Exception {
	driver.findElement(By.name(Txt_un)).sendKeys(UN);
	driver.findElement(By.name(Txt_pw)).sendKeys(PW);
	Thread.sleep(2000);
	driver.findElement(By.name(loginbtn)).click();
	Thread.sleep(2000);
}

public void AddEMP()throws Exception {
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath(Addbtn)).click();
	Thread.sleep(2000);
	driver.findElement(By.name(Txtln)).sendKeys(Ln);
	driver.findElement(By.name(Txtfn)).sendKeys(Fn);
	Thread.sleep(2000);
	driver.findElement(By.id(savebtn)).click();
	Thread.sleep(2000);
//driver.switchTo().defaultContent();

}
public void Edit()throws Exception {
	driver.findElement(By.name(editbtn)).click();
driver.findElement(By.name("Madhav")).clear();
Thread.sleep(2000);
driver.findElement(By.name(txtLn1)).sendKeys("Manual");
Thread.sleep(2000);
driver.findElement(By.name("Testing")).clear();
driver.findElement(By.name(txtFn1)).sendKeys("Automation");
Thread.sleep(2000);
driver.findElement(By.name(editbtn)).click();

}
	
public void Logout()throws Exception{	
	driver.findElement(By.linkText(logoutbtn)).click();
	Thread.sleep(2000);
driver.close();
}
}
