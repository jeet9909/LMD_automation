package TC_TIC_Center_Body;

import org.testng.annotations.Test;

import Resource.Base;

public class TC_Central_Body_Designation extends Base{

	
	
	@Test
	public void LMD_845_Designation() throws InterruptedException
	{
		
		driver.get("http://192.168.11.55/khushbu/nirbhar_qa/tic-central-body/auth"); 
		
		PO_Central_Body.Login();
		System.out.println("=======================  TIC Central Body Login successfully ========================");
		PO_TIC_Deg.ADD_Designation();
		System.out.println("=======================  TIC Central Body Add Designation successfully ========================");
		PO_TIC_Deg.Edit_Designation();
		System.out.println("=======================  TIC Central Body Edit Designation successfully ========================");
		PO_TIC_Deg.Delete_Designation();
		System.out.println("=======================  TIC Central Body Delete Designation successfully ========================");
		PO_Central_Body.TCI_Central_Body_Logout();
		System.out.println("=======================  TIC Central Body Logout Successfully ========================");
	}
}
