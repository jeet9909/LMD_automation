package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import AIO.SuperAdmin;
import AIO.SuperAdmin_State;
import Abstract.abstractClass;
import Oem.Roles;

public class Base {

	public WebDriver driver;
	public Roles po;
	public abstractClass PO_abstract;
	public SuperAdmin PO_Superadmin;
	public SuperAdmin_State PO_SP_State;
	
	
	@BeforeSuite
	public void Invoke()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@BeforeClass
	public void pageobject()
	{
		po = new Roles(driver);
		PO_abstract = new abstractClass();
		PO_Superadmin = new SuperAdmin(driver);
		PO_SP_State = new SuperAdmin_State(driver);
	}
	
	@AfterSuite
	public void Close()
	{
		driver.quit();
	}
}
