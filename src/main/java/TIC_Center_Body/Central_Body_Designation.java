package TIC_Center_Body;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Central_Body_Designation {
	
	private WebDriver driver;

	public Central_Body_Designation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	
//	========================== Add Designation ===================================
	
	
	@FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[5]/a/span[2]")
	WebElement Designation_Link;
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	WebElement ADD_Designation_BTN;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement  Enter_Designation_Name;
	
//	@FindBy(xpath = "//select[@class='form-select form-select-solid mb-3 mb-lg-0 is-invalid']\\")
	@FindBy(xpath = "//select[@class='form-select form-select-solid mb-3 mb-lg-0']")
	WebElement Department_Dropdown;
	
	@FindBy(xpath = "//*[@id=\"kt_modal_add_designation_form\"]/div[2]/select/option[5]")
	WebElement Select_Department;
	
	@FindBy(xpath = "//div[@class='Toastify']")
	WebElement Capture_Validation_Message;
	
	
	public void ADD_Designation()
	{
		Designation_Link.click();
		ADD_Designation_BTN.click();
		Enter_Designation_Name.sendKeys("Demo2 Designation");
		Department_Dropdown.click();
		Select_Department.click();
		Submit_BTN.click();
		System.out.println(Capture_Validation_Message.getText());
		Alert_BOX.click();
	}
	
	
//	================================ Edit Designation ================================
	
	@FindBy(xpath = "//*[@id=\"kt_table_designation\"]/tbody/tr[1]/td[5]/a")
	WebElement Action_DropDown;
	
	@FindBy(xpath = "//*[@id=\"kt_table_designation\"]/tbody/tr[1]/td[5]/div/div[1]/a")
	WebElement Select_Edit_Option;
	
	@FindBy(xpath = "//button[@data-kt-designations-modal-action='submit']")
	WebElement Submit_BTN;
	
	
	
	public void Edit_Designation()
	{
		Action_DropDown.click();
		Select_Edit_Option.click();
		Enter_Designation_Name.sendKeys(" Test2");
		Submit_BTN.click();
		System.out.println(Capture_Validation_Message.getText());
		Alert_BOX.click();
	}
	
	
//	================================ Delete Designation ==============================
	
	
	
	@FindBy(xpath = "//*[@id=\"kt_table_designation\"]/tbody/tr[1]/td[5]/div/div[2]/a")
	WebElement Select_Delete_option;
	
	@FindBy(xpath = "//*[@id=\"kt_app_body\"]/div[4]/div/div[6]/button[1]")
	WebElement Yes_Delete_BTN;
	
	@FindBy(xpath = "//*[@id=\"kt_app_body\"]/div[4]/div/div[6]/button[1]")
	WebElement Delete_Ok_BTN;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement Alert_BOX;
	
	public void Delete_Designation()
	{
		Action_DropDown.click();
		Select_Delete_option.click();
		Yes_Delete_BTN.click();
		Delete_Ok_BTN.click();
		
	}
	
	
//	============================ 
}
