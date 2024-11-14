package AIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdmin {

	private WebDriver driver;
	
	public SuperAdmin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
//	================================= Login Super Admin ==================
	
	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	WebElement SA_Username;
	
	@FindBy(xpath = "//span[normalize-space()=\"Username is required\"]")
	WebElement Error_Message_OF_Username;
	
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	WebElement SA_Password;
	
	@FindBy(xpath = "//span[normalize-space()=\"Password is required\"]")
	WebElement Error_Message_OF_Password;
	
	@FindBy(xpath = "//button[@id=\"kt_sign_in_submit\"]")
	WebElement SA_Submit_BTN;
	
	
	public void Login(String UserName, String Password)
	{
		driver.navigate().refresh();
		SA_Username.sendKeys(UserName);
		SA_Password.sendKeys(Password);
		SA_Submit_BTN.click();
	}
	
//	================== Capture Validation message =================
	
	@FindBy(xpath = "//div[@class=\"Toastify\"]")
	WebElement Capture_Validation_Message;
	
	public void Error_message()
	{
		System.out.println(Capture_Validation_Message.getText());
	}
	
	public void Empty_Password()
	{
		driver.navigate().refresh();
		SA_Username.sendKeys("super_admin");
	}
	
	public void Empty_Username()
	{
		driver.navigate().refresh();
		SA_Password.sendKeys("superadmin@123");
	}
	
	
//	=============================== Super Admin Logout ===============
	
	@FindBy(xpath = "//div[@class=\"cursor-pointer symbol symbol-35px\"]//img")
	WebElement Logout_Icon;
	
	@FindBy(xpath = "//a[normalize-space()=\"Sign Out\"]")
	WebElement Logout_Btn;
	
	public void Logout_SuperAdmin() throws InterruptedException
	{
		Thread.sleep(1000);
		Logout_Icon.click();
		Thread.sleep(800);
		Logout_Btn.click();
		Thread.sleep(1000);
	}
	
	
	
}
