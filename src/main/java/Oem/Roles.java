package Oem;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstract.abstractClass;

public class Roles {

	private WebDriver driver;
	
	public Roles(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
//	=================== OEM Login ====================================
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Email\"]")
	WebElement Enter_Email;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Password\"]")
	WebElement Enter_Password;
	
	@FindBy(xpath = "//button[@id=\"kt_sign_in_submit\"]")
	WebElement Submit_BTN;
	
	@FindBy(xpath = "//h1[normalize-space()=\"Dashboard\"]")
	WebElement Verify_Dashboad;
	
	public void Login() throws InterruptedException
	{
		Enter_Email.sendKeys("oem@gmail.com");
		Enter_Password.sendKeys("Oem@123");
		Submit_BTN.click();
		Thread.sleep(2000);
		System.out.println("Verify that page redirects to " + Verify_Dashboad.getText());
		Thread.sleep(5000);
	}
	
	
	
//	============================ Oem Changing Theam  ==============================
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/a")
	WebElement Theam_BTN;
	
	@FindBy(xpath = "//span[normalize-space()=\"Dark\"]")
	WebElement Select_Theam;
	
	public void Change_Theam() throws InterruptedException
	{
		Theam_BTN.click();
		Thread.sleep(1000);
		Select_Theam.click();
		Thread.sleep(4000);
	}
	
//	============================ Oem Roles ===================================
	
//	========= Add Roles ==============
	
	@FindBy(xpath = "//span[normalize-space()=\"Roles\"]")
	WebElement MenuTitle_Roles;
	
	@FindBy(xpath = "//h1[normalize-space()=\"Roles list\"]")
	WebElement Verify_RolePage;
	
	@FindBy(xpath = "//i[@class=\"ki-duotone ki-plus fs-2\"]")
	WebElement AddRole_BTN;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Name\"]")
	WebElement Enter_Employee;
	
	@FindBy(xpath = "//input[@id=\"module-oem_users\"]")
	WebElement OemUser_CheckBox;
	
	@FindBy(xpath = "//button[@data-kt-state-modal-action=\"submit\"]")
	WebElement Role_Submit;
	
	@FindBy(xpath = "//div[@class=\"Toastify\"]")
	WebElement Verify_ValidationM_essage;
	
	public void Oem_ADD_Roles() throws InterruptedException
	{
		MenuTitle_Roles.click();
		Thread.sleep(1300);
		System.out.println(Verify_RolePage.getText());
		AddRole_BTN.click();
		Thread.sleep(1200);
		Enter_Employee.sendKeys("Demo Employee7");
		OemUser_CheckBox.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-350)", "");
		Role_Submit.click();
		Thread.sleep(400);
		System.out.println(Verify_ValidationM_essage.getText());
		Thread.sleep(5000);
	}
	
//	================== Delete Role =======================
	
	@FindBy(xpath = "//*[@id=\"kt_table_roles\"]/tbody/tr[1]/td[3]/a")
	WebElement Action_DropDown;
	
	@FindBy(xpath = "(//a[@class='menu-link px-3'][normalize-space()='Delete'])[1]")
	WebElement Select_Delete_Option;
	
	@FindBy(xpath = "//button[normalize-space()=\"Yes, delete it!\"]")
	WebElement Select_Final_Delete;
	
	@FindBy(xpath = "//button[normalize-space()=\"OK\"]")
	WebElement Select_Ok_BTN;
	
	@FindBy(xpath = "(//div[@id='swal2-html-container'])[1]")
	WebElement Error_Message;
	
	public void Delete_Role() throws InterruptedException
	{
		Action_DropDown.click();
		Thread.sleep(800);
		Select_Delete_Option.click();
		Thread.sleep(800);
		Select_Final_Delete.click();
		Thread.sleep(800);
		System.out.println(Error_Message.getText());
		Select_Ok_BTN.click();
	}
	
	
//	================ Edit Role ==================
	
	
	@FindBy(xpath = "//*[@id=\"kt_table_roles\"]/tbody/tr[1]/td[3]/div/div[1]/a")
	WebElement Select_Edit_Option;
	
	
	public void Edit_Role() throws InterruptedException
	{
		Action_DropDown.click();
		Thread.sleep(800);
		Select_Edit_Option.click();
		Thread.sleep(1200);
		Enter_Employee.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.BACK_SPACE);
		Thread.sleep(800);
		Enter_Employee.sendKeys("Demo13");
		Role_Submit.click();
		Thread.sleep(400);
		System.out.println(Verify_ValidationM_essage.getText());
		Thread.sleep(1000);
	}
	
//	============================ Oem Status ===============================
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/label[1]/input[1]")
	WebElement Status_BTN;
	
	
	public void Change_Status() throws InterruptedException
	{
		Status_BTN.click();
		Thread.sleep(900);
		System.out.println(Status_BTN.getTagName());
		System.out.println(Verify_ValidationM_essage.getText());
		Thread.sleep(3000);
	}
	
	
//	============================ Oem Logout ==================================
	
	@FindBy(xpath = "//div[@class=\"cursor-pointer symbol symbol-35px\"]//img")
	WebElement Login_Icon;
	
	@FindBy(xpath = "//a[normalize-space()=\"Sign Out\"]")
	WebElement SignOut_BTN;
	
	@FindBy(xpath = "//h1[normalize-space()=\"Sign In\"]")
	WebElement Verify_SignPage;
	public void Oem_Logout() throws InterruptedException
	{
		Thread.sleep(2500);
		Login_Icon.click();
		Thread.sleep(1000);
		SignOut_BTN.click();
		Thread.sleep(3000);
		System.out.println(Verify_SignPage.getText());
	}
}
