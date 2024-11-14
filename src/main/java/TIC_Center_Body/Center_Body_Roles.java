package TIC_Center_Body;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Center_Body_Roles {
	
	private WebDriver driver;

	public Center_Body_Roles(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	

}
