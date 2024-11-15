package TC_TIC_Center_Body;

import org.testng.annotations.Test;

import Resource.Base;

public class TC_Center_Body_Roles extends Base{

	
	@Test
	public void TC_Roles_Curd() throws InterruptedException
	{
		driver.get("http://192.168.11.55/khushbu/nirbhar_qa/tic-central-body/auth");
		
		
		PO_Central_Body.Login();
		System.out.println("============================ TIC Central BOdy Login successfully ========================");
		Thread.sleep(2000);
		PO_Central_Body.ADD_Role();
		System.out.println("============================ TIC Central BOdy Add Role successfully ========================");
		Thread.sleep(2000);
		PO_Central_Body.Edit_Role();
		System.out.println("============================ TIC Central BOdy Edit Role successfully ========================");
		Thread.sleep(2000);
		PO_Central_Body.Delete_ROle();
		System.out.println("============================ TIC Central BOdy Delete Role successfully ========================");
		Thread.sleep(5000);
		PO_Central_Body.TCI_Central_Body_Logout();
		System.out.println("============================ TIC Central Body Logout Successfully =========================");
		
	}
}
