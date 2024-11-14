package LMD_AIO_TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Resource.Base;

public class LMD_TC_Login_Super_Admin extends Base{
	
	@BeforeClass
	public void Start()
	{
		
		
		driver.navigate().to("http://192.168.11.55/khushbu/nirbhar_qa/super-admin/auth");
	}
	
	@Test(priority = 2)
	public void LMD_TC_17_Valid_Login() throws InterruptedException
	{
		PO_Superadmin.Login("super_admin", "superadmin@123");
		System.out.println("=============================== Login Succefully ================================");
		PO_Superadmin.Logout_SuperAdmin();
		System.out.println("=============================== logout Succefully ===============================");
	}
	
	@Test(priority = 3)
	public void LMD_TC_18_Invalid_UserName_Login()
	{
		PO_Superadmin.Login("Test_Super", "superadmin@123");
		PO_Superadmin.Error_message();
		System.out.println("=========================== Test Case passed with Invalid Username Login =========================");
	}
	
	@Test(priority = 4)
	public void LMD_TC_19_Invalid_Password()
	{
		PO_Superadmin.Login("super_admin", "Admin@123");
		PO_Superadmin.Error_message();
		System.out.println("========================== Test Case Passed with Invalid Passoed Login ============================");
	}
	
	@Test(priority = 5)
	public void LMD_TC_20_Empty_Username()
	{ 
//		PO_Superadmin.Login(" ", "superadmin@123");
		PO_Superadmin.Empty_Username();
		System.out.println("======================== Test Case Passed Of Empty Username Login Page ==============================");
	}
	
	@Test(priority = 6)
	public void LMD_TC_21_Empty_Password()
	{
//		PO_Superadmin.Login("super_admin", " ");
		PO_Superadmin.Empty_Password();
		System.out.println("======================= Test Case Passed of Empty Password Login Page ==============================");
		
	}
	
	@Test(priority = 7)
	public void LMD_TC_72_Edit_state_Valid_Data() throws InterruptedException
	{
		PO_Superadmin.Login("super_admin", "superadmin@123");
		System.out.println("=============================== Login Succefully ================================");
		PO_SP_State.Edit_States();
		Thread.sleep(1000);
		System.out.println("=============================== Edit State Succefully ===========================");
	}
	
	@Test(priority = 8)
	public void LMD_TC_72_Edite_state_Unchanged() throws InterruptedException
	{
		PO_SP_State.Edit_state();
		Thread.sleep(5000);
		PO_Superadmin.Logout_SuperAdmin();
		System.out.println("=============================== logout Succefully ===============================");
	}
	
	@Test(priority = 9)
	public void LMD_TC_76_Display_All_States() throws InterruptedException
	{
		PO_Superadmin.Login("super_admin", "superadmin@123");
		System.out.println("=============================== Login Succefully ================================");
		PO_SP_State.Display_States();
		System.out.println("=============================== Checked Pagination and State are dislayed ===============");
		PO_Superadmin.Logout_SuperAdmin();
		System.out.println("=============================== logout Succefully ===============================");
	}
	
	
	
	
	
	
	
	
}
