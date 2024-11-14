package TestCasesOEM;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Resource.Base;

public class TC_Roles extends Base 
{

	@Test(priority = 1)
	public void TC_Login() throws InterruptedException
	{
		driver.get("http://192.168.11.55/khushbu/nirbhar_qa/oem/auth/");
		
		po.Login();
		System.out.println("==================== Oem Login Successfully ================");
		
		po.Change_Theam();
		System.out.println("=================== Them is changed =======================");
		
		po.Oem_ADD_Roles();
		System.out.println("================== Add Role In Oem ========================");
		
		po.Edit_Role();
		System.out.println("================= Succefully Edit Role ===================");
		
		po.Delete_Role();
		System.out.println("================= Succefully Delete Role =================");
		
		po.Change_Status();
		
		po.Oem_Logout();
		System.out.println("===================  Logout Succefully ====================");
		
	}
}
