package Practicee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
	driver.navigate().to("file:///C:/Users/dell/Downloads/WebTable%20(1).html");
	
	int row = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
	int coloum = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
	int row_coloum = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
	
	//int row = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[7]/td[4]")).size();
	System.out.println("row count="+row);
	System.out.println("coloum count="+ coloum);
	System.out.println("row_colum="+row_coloum);
	
	//data cell 
	String celldata=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[4]")).getText();
	System.out.println(celldata);
	
	//data:wholeTable
	//for(int i=1; i<=row; i++){
		for(int i=1; i<=coloum; i++) {
			//String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/td["+i+"]")).getText();
	System.out.println(data);
	}
	//driver.quit();
	}	
}


