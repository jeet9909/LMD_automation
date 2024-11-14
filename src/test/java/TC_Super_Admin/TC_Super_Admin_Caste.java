package TC_Super_Admin;

import org.testng.annotations.Test;

import Resource.Base;

public class TC_Super_Admin_Caste extends Base {

	
	@Test
	public void TC_LMD_1000_Caste_Curd() throws InterruptedException
	{
		
		driver.get("http://192.168.11.55/khushbu/nirbhar_qa/super-admin/auth");
		
		PO_Superadmin.Login("super_admin", "superadmin@123");
		Thread.sleep(2000);
		PO_SP_Caste.Add_Caste();
		Thread.sleep(2000);
		PO_SP_Caste.Edit_Caste();
		Thread.sleep(2000);
		PO_SP_Caste.Delete_Caste();
		
	}
}
