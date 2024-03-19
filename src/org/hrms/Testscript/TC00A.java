package org.hrms.Testscript;
import org.hrms.lib1.General1;

import Com.hrms.lib.General;

public class TC00A {
public static void main(String[] args)throws Exception {
General1 obj=new General1();	
    obj.openappln();	
    obj.Login();
    obj.AddEMP();
    obj.Edit();
	obj.Logout();
	
	
	
}

}
