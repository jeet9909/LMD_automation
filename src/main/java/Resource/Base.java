package Resource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import AIO.SuperAdmin;
import AIO.SuperAdmin_State;
import AIO.Super_Admin_Caste;
import Abstract.abstractClass;
import Oem.Roles;
import TIC_Center_Body.Center_Body_Roles;
import TIC_Center_Body.Central_Body_Designation;

public class Base {

	public WebDriver driver;
	public Roles po;
	public abstractClass PO_abstract;
	public SuperAdmin PO_Superadmin;
	public SuperAdmin_State PO_SP_State;
	public Center_Body_Roles PO_Central_Body;
	public Super_Admin_Caste PO_SP_Caste;
	public Central_Body_Designation PO_TIC_Deg;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void Invoke()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void pageobject()
	{
		po = new Roles(driver);
		PO_abstract = new abstractClass();
		PO_Superadmin = new SuperAdmin(driver);
		PO_SP_State = new SuperAdmin_State(driver);
		PO_Central_Body = new Center_Body_Roles(driver);
		PO_SP_Caste = new Super_Admin_Caste(driver);
		PO_TIC_Deg = new Central_Body_Designation(driver);
	}
	
	@AfterSuite
	public void Close()
	{
		driver.quit();
	}
}
