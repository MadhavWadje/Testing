package Com.hrms.testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General;
import Com.hrms.utility.Log;

public class TC001 {
//public static void main(String[] args)throws Exception  {
	@Test
	public void tcoo1() throws Exception {
	//DOMConfigurator.configure("log4j.xml");
General obj=new General();	
	obj.openapplication();
	
	obj.Login();
	//obj.EditEmp();
	//obj.Delete();
	obj.Logout();
	obj.Closeapplication();
}
}

