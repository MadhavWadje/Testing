package Com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Global{
	WebDriver driver;
//Test data*******
	//login
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	//Add Emp
	public String Ln="Selenium";
	public String Fn="Madhav";
	//Edit Emp
	public String Edit_fn="MSW";
	public String Edit_ln="MS";
	//Delete
	public String delete_EmpId1="3879";
	public String delete_Empidbtn="loc_code";

	
	
//object************
	//Login
	public String Txt_un="txtUserName";
	public String Txt_pw="txtPassword";
	public String login_btn="Submit";

//AddEmp
	public String Add_btn="//input[@value='Add']";
public String Txt_ln="txtEmpLastName";
public String Txt_fn="txtEmpFirstName";
public String save_btn="btnEdit";
//Edit Emp
public String Edit_btn="EditMain";
public String Edit_fn1="txtEmpFirstName";
public String Edit_ln1="txtEmpLastName";
public String Edit_savebtn="EditMain";
//public String Backbtn="//input[@type='button'][@value='back']";

//Delete
public String delete_dropdown="loc_code";
public String delete_search="loc_name";
public String delete_checkbx="allCheck";
public String delete_searchbtn="//input[@type='button']";
public String delete_deletebtn="//input[@value='Delete']";

//logout
	public String logout_btn="Logout";
	
	
	
}