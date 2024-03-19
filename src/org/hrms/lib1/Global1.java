package org.hrms.lib1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Global1 {
WebDriver driver;

//Test data******
//Login
public String url="http://183.82.103.245/nareshit/login.php";
public String UN="nareshit";
public String PW="nareshit";


//Add
public String Ln="Madhav";
public String Fn="Testing";

//Edit
public String Ln1="Manual";
public String Fn1="Automation";


//object**************************
public String Txt_un="txtUserName";
public String Txt_pw="txtPassword";
public String loginbtn="Submit";
public String logoutbtn="Logout";

//Add
public String Addbtn="//input[@value='Add']";  //xpath
public String Txtln="txtEmpLastName";
public String Txtfn="txtEmpFirstName";
public String savebtn="btnEdit";  //id


//Edit
public String editbtn="EditMain";
public String txtFn1="txtEmpFirstName";
public String txtLn1="txtEmpLastName";
}

