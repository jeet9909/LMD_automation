package AIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Super_Admin_Caste {

	
	private WebDriver driver;

	public Super_Admin_Caste(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
//	================================== Add Caste ===============================
	
	@FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[10]/a/span[2]")
	WebElement Caste_Link;
	
	@FindBy(xpath = "//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/div/button")
	WebElement Add_Caste_BTN;
	
	@FindBy(xpath = "//*[@id=\"kt_modal_add_caste_scroll\"]/div[1]/input")
	WebElement Caste_Name_Field;
	
	@FindBy(xpath = "//*[@id=\"kt_modal_add_caste_scroll\"]/div[2]/textarea")
	WebElement Add_Description;
	
	@FindBy(xpath = "//*[@id=\"kt_modal_add_caste_form\"]/div[2]/button[2]")
	WebElement Submit_Button;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[6]")
	WebElement Validation_Message;
	
	public void Add_Caste()
	{
		Caste_Link.click();
		Add_Caste_BTN.click();
		Caste_Name_Field.sendKeys("Demo Caste");
		Add_Description.sendKeys("Test Demo Description");
		Submit_Button.click();
		System.out.println(Validation_Message.getText());
	}
	
//	=============================== Edit Caste ===================
	
	
	@FindBy(xpath = "//*[@id=\"kt_table_caste\"]/tbody/tr[1]/td[4]/a")
	WebElement Action_DropDown;
	
	@FindBy(xpath = "//*[@id=\"kt_table_caste\"]/tbody/tr[1]/td[4]/div/div[1]/a")
	WebElement Edit_Option;
	
	
	
	public void Edit_Caste()
	{
		Action_DropDown.click();
		Edit_Option.click();
		Caste_Name_Field.sendKeys("Test Caste Edit");
		Submit_Button.click();
		System.out.println(Validation_Message.getText());
	}
	
	
	
//	================================ Delete Caste =============================
	
	@FindBy(xpath = "//*[@id=\"kt_table_caste\"]/tbody/tr[1]/td[4]/div/div[2]/a")
	WebElement Delete_Option;
	
	@FindBy(xpath = "//*[@id=\"kt_app_body\"]/div[4]/div/div[6]/button[1]")
	WebElement Delete_Confirm_Btn;
	
	@FindBy(xpath = "//*[@id=\"kt_app_body\"]/div[4]/div/div[6]/button[1]")
	WebElement Delete_OK_BTN;
	
	
	public void Delete_Caste() throws InterruptedException
	{
		Action_DropDown.click();
		Delete_Option.click();
		Thread.sleep(1000);
		Delete_Confirm_Btn.click();
		Thread.sleep(1000);
		Delete_OK_BTN.click();
		System.out.println(Validation_Message.getText());
	}
	
//	================================== Super Admin Logout ====================================
	
	@FindBy(xpath = "//*[@id=\"kt_app_header_wrapper\"]/div[2]/div[2]/div[1]/img")
	WebElement Logout_Icon;
	
	@FindBy(xpath = "//*[@id=\"kt_app_header_wrapper\"]/div[2]/div[2]/div[2]/div[3]/a")
	WebElement Signout_BTN;
	
	public void Super_Admin_Logout()
	{
		Logout_Icon.click();
		Signout_BTN.click();
	}
}
