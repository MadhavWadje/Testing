package Com.hrms.lib3;
import org.openqa.selenium.WebDriver;

public class Global3 {
WebDriver driver;
	
//**** TEST DATA ****
//login
public String url="http://183.82.103.245/nareshit/login.php";	
public String un="nareshit";
public String pw="nareshit";

//Add
public String fn="jay Maharastra";
public String ln="jay shriram";
public String midlnm= "Manual";
public String nn="Automation";

public String editln="Madhav";
public String editfn="Selenium";
//**** Object ****
//login
public String untbx="txtUserName";
public String pwtbx="txtPassword";
public String loginbtn="Submit";
public String logoutbtn="Logout";
//Add
public String addbtn="//input[@value='Add']";
public String fntbx="txtEmpFirstName";
public String lntbx="txtEmpLastName";
public String midlnmtbx="txtEmpMiddleName";
public String nntbx="txtEmpNickName";
public String savebtn="btnEdit";    //id

public String editlnbx="txtEmpLastName";
public String editfnbx="txtEmpFirstName";
public String editbtn="EditMain";
public String backbtn="//input[@type='button'][@value='Back']";
}
