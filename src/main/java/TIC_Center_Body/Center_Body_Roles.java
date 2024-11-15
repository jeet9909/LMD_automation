package TIC_Center_Body;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Center_Body_Roles {
	
	private WebDriver driver;

	public Center_Body_Roles(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
//	============================================== Centerl Body Login ===================================
	
	@FindBy(xpath = "//*[@id=\"kt_login_signin_form\"]/div[2]/input")
	WebElement Email_Field_CB;
	
	@FindBy(xpath = "//*[@id=\"kt_login_signin_form\"]/div[3]/input")
	WebElement Password_Field_CB;
	
	@FindBy(xpath = "//*[@id=\"kt_sign_in_submit\"]")
	WebElement Submit_BTN_CB;

	
	public void Login()
	{
		Email_Field_CB.sendKeys("jitendrayadavnetsolitsolutions@gmail.com");
		Password_Field_CB.sendKeys("Oem@123");
		Submit_BTN_CB.click();
	}
	
//	=============================== Add Role Central Body =================================
	
	@FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/a")
	WebElement Role_Link;
	
	@FindBy(xpath = "//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/div/button")
	WebElement Add_Role_Btn;
	
	@FindBy(xpath = "//*[@id=\"kt_modal_add_roles_form\"]/div/div[1]/input")
	WebElement Enter_Role_Name;
	
	@FindBy(xpath = "//*[@id=\"select-all\"]")
	WebElement Select_ALL_Permissions;
	
	@FindBy(xpath = "//*[@id=\"kt_modal_add_roles_form\"]/div/div[3]/button[2]")
	WebElement Submit_BTN;
	
	public void ADD_Role() throws InterruptedException {
		
		Role_Link.click();
		Add_Role_Btn.click();
		Enter_Role_Name.sendKeys("Demo Role 1");
		Select_ALL_Permissions.click();
		Thread.sleep(1000);
		Submit_BTN.click();
		System.out.println(Validation_Message.getText());
	}
	
	
//	================================== Edit Role ============================
	
	@FindBy(xpath = "//*[@id=\"kt_table_roles\"]/tbody/tr[1]/td[3]/a")
	WebElement Action_DropDown;
	
	@FindBy(xpath = "//*[@id=\"kt_table_roles\"]/tbody/tr[1]/td[3]/div/div[1]/a")
	WebElement Edit_Role_Option;
	
	@FindBy(xpath = "//*[@id=\"module-central_body_departments\"]")
	WebElement Edit_ROLE_Permission;
	
	
	public void Edit_Role() {
		Action_DropDown.click();
		Edit_Role_Option.click();
		Enter_Role_Name.sendKeys("Demo 1 Role");
		Edit_ROLE_Permission.click();
		Submit_BTN.click();
		System.out.println(Validation_Message.getText());
	}
	
	
	
//	========================== Delete Role ======================
	
	@FindBy(xpath = "//*[@id=\"kt_table_roles\"]/tbody/tr[1]/td[3]/div/div[2]/a")
	WebElement Delete_ROLE_Option;
	
	@FindBy(xpath = "//*[@id=\"kt_app_body\"]/div[4]/div/div[6]/button[1]")
	WebElement  YES_Delete_IT_BTN;
	
	@FindBy(xpath = "//*[@id=\"kt_app_body\"]/div[4]/div/div[6]/button[1]")
	WebElement OK_BTN;
	
	@FindBy(xpath = "//*[@class=\"Toastify\"]")
	WebElement Validation_Message;
	
	public void Delete_ROle() throws InterruptedException
	{
		Action_DropDown.click();
		Delete_ROLE_Option.click();
		Thread.sleep(1000);
		YES_Delete_IT_BTN.click();
		Thread.sleep(1000);
		OK_BTN.click();
		System.out.println(Validation_Message.getText());
	}
	
	
//	========================== TCI Central BOdy Logout ========================
	
	@FindBy(xpath = "//*[@id=\"kt_app_header_wrapper\"]/div[2]/div[2]/div[1]/img")
	WebElement Logout_Icon;
	
	@FindBy(xpath = "//*[@id=\"kt_app_header_wrapper\"]/div[2]/div[2]/div[2]/div[4]/a") 
	WebElement SignOut_BTN;
	
	public void TCI_Central_Body_Logout() throws InterruptedException
	{
		Thread.sleep(5000);
		Logout_Icon.click();
		SignOut_BTN.click();
	}
	
	
}
