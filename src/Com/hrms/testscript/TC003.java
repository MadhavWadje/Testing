package Com.hrms.testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib3.General3;

public class TC003 {
//public static void main(String[] args) throws Exception{
	@Test
	public void tc003() throws Exception {
	General3 obj=new General3();
	DOMConfigurator.configure("log4j.xml");

	obj.openappln();
    obj.login();
    obj.Add();
    obj.logout();
	obj.closeappln();
	
	
	
}
}
