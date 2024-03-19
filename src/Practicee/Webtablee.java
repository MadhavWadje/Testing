package Practicee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtablee {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/dell/Downloads/WebTable%20(1).html");
	
	int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[7]/td[2]")).size();
	System.out.println(row);
	int col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[7]/td[4]")).size();
	System.out.println(col);
	int row_col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[4]/td[3]")).size();
	System.out.println(row_col);
	
//	String celldata= driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[5]/td[2]")).getSize();
	//System.out.println(celldata);
	driver.close();
}
}
