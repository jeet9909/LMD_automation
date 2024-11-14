package TC_TIC_Center_Body;

import org.testng.annotations.Test;

import Resource.Base;

public class TC_Center_Body_Roles extends Base{

	
	@Test
	public void TC_Roles_Curd() throws InterruptedException
	{
		driver.get("http://192.168.11.55/khushbu/nirbhar_qa/tic-central-body/auth");
		
		
		PO_Central_Body.Login();
		Thread.sleep(2000);
		PO_Central_Body.ADD_Role();
		Thread.sleep(2000);
		PO_Central_Body.Edit_Role();
		Thread.sleep(2000);
		PO_Central_Body.Delete_ROle();
	}
}
