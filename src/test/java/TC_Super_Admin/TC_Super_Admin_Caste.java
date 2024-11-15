package TC_Super_Admin;

import org.testng.annotations.Test;

import Resource.Base;

public class TC_Super_Admin_Caste extends Base {

	
	@Test
	public void TC_LMD_1000_Caste_Curd() throws InterruptedException
	{
		
		driver.get("http://192.168.11.55/khushbu/nirbhar_qa/super-admin/auth");
		
		PO_Superadmin.Login("super_admin", "superadmin@123");
		System.out.println("======================== Super Admin Login Successfully ===========================");
		Thread.sleep(2000);
		PO_SP_Caste.Add_Caste();
		System.out.println("======================== Super Admin Add Caste Successfully ===========================");
		Thread.sleep(2000);
		PO_SP_Caste.Edit_Caste();
		System.out.println("======================== Super Admin Edit Caste Successfully ===========================");
		Thread.sleep(2000);
		PO_SP_Caste.Delete_Caste();
		System.out.println("======================== Super Admin Delete Caste Successfully ===========================");
		Thread.sleep(5000);
		PO_SP_Caste.Super_Admin_Logout();
		System.out.println("======================== Super Admin Logout Successfully ===========================");
		
	}
}
