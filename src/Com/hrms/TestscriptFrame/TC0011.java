package Com.hrms.TestscriptFrame;


import Com.hrms.frame.Genral2;


public class TC0011 {
	public static void main(String[] args) throws Exception {
Genral2 obj=new Genral2();
  obj.openappln();
 obj.login();
 obj.Enterframe();
 obj.Add();
 obj.Edit();
 obj.Delete();
 obj.outframe();
 Thread.sleep(2000);
obj.logout();
obj.closeappln();

}
}