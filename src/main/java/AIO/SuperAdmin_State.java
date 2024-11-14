package AIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdmin_State {

	private WebDriver driver;
	
	public SuperAdmin_State(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
//	=================================== State Edit  State =======================
	
	@FindBy(xpath = "//a[@href=\"/khushbu/nirbhar_qa/super-admin/apps/states\"]")
	WebElement States_link;
	
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	WebElement Search_States;
	
	@FindBy(xpath = "//a[normalize-space()=\"Actions\"]")
	WebElement Action_DropDown;
	
	@FindBy(xpath = "//a[normalize-space()=\"Edit\"]")
	WebElement Eidt_Option;
	
	@FindBy(xpath = "//input[@placeholder=\"Name\"]")
	WebElement Name_Edit;
	
	@FindBy(xpath = "//span[@class=\"indicator-label\"]")
	WebElement Submit_Btn_Of_Edit_State;
	
	@FindBy(xpath = "//div[@class=\"Toastify\"]")
	WebElement Capture_Validation_Message;
	
	
	public void Edit_States() throws InterruptedException
	{
		Thread.sleep(1000);
		States_link.click();
		Thread.sleep(1000);
		Search_States.sendKeys("demo");
		Thread.sleep(800);
		Action_DropDown.click();
		Thread.sleep(800);
		Eidt_Option.click();
		Thread.sleep(900);
		System.out.println("State name before Edit " + Name_Edit.getText());
		Name_Edit.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.BACK_SPACE);
		Name_Edit.sendKeys("demo Edit State");
		System.out.println("State name after Edit " + Name_Edit.getText());
		Submit_Btn_Of_Edit_State.click();
		Thread.sleep(800);
		System.out.println(Capture_Validation_Message.getText());
	}
	
	public void Edit_state() throws InterruptedException
	{
		Action_DropDown.click();
		Thread.sleep(800);
		Eidt_Option.click();
		Thread.sleep(900);
		Submit_Btn_Of_Edit_State.click();
		Thread.sleep(800);
		System.out.println(Capture_Validation_Message.getText());
	}
	
//	============================ Check All State Displays with pagination ==================================
	
	@FindBy(xpath = "//*[@id=\"kt_table_state\"]/tbody/tr[1]/td[1]")
	WebElement First_State_Name;
	
	@FindBy(xpath = "//a[normalize-space()=\"2\"]")
	WebElement Page_2;
	
	@FindBy(xpath = "//a[normalize-space()=\"3\"]")
	WebElement Page_3;
	
	@FindBy(xpath = "//*[@id=\"kt_table_state\"]/tbody/tr[10]/td[1]")
	WebElement Last_Name;
	
	public void Display_States() throws InterruptedException
	{
		Thread.sleep(1000);
		States_link.click();
		Thread.sleep(1000);
		System.out.println(First_State_Name.getText());
		Page_2.click();
		Thread.sleep(900);
		System.out.println(Last_Name.getText());
		Page_3.click();
		Thread.sleep(900);
		System.out.println(First_State_Name.getText());
		Thread.sleep(800);
		
	}
}
