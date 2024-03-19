package Com.hrms.frame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class Global2 {
WebDriver driver;
	
    //****TEST DATA****
//LOGIN
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
//Add
	public String ln="Maharastra";
	public String fn="Nanded";
//Edit
	public String Eln="Selenium";
	public String Efn="Testing";
//Delete
	public String empidno="3921";
	
	
//object
	//login
	public String untbx = "txtUserName";
	public String pwtbx ="txtPassword";
	public String loginbtn="Submit";
	public String logoutbtn ="Logout";
  //Add
    public String addbtn1="//input[@value='Add']";
    public String lntbx="txtEmpLastName";
    public String fntbx="txtEmpFirstName";
    public String savebtn="btnEdit"; //id
 //Edit
    public String Elntbx="txtEmpLastName";
    public String Efntbx="txtEmpFirstName";
    public String Editbtn="EditMain";
    public String Backbtn="//input[@value='Back']";
 //Delete
    public String searchdropdown="loc_code";
    public String empid="Emp. ID";
    public String checkbx="chkLocID[]";
    public String searchbx="loc_name";
    public String searchbtn="//input[@value='Search']";
    public String deletebtn="//input[@value='Delete']";
    
    
}
