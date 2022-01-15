package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;

public class login extends Base_page
{
	@FindBy(id="username")
	private WebElement user;
	@FindBy(name="pwd")
	private WebElement pass;
	@FindBy(xpath="//div[.='Login']")
	private WebElement lgn_btn;
	
	public  login(WebDriver driver)
	{
		super(driver);
	}
	public void username()
	{
		user.sendKeys("admin");
	}
	public void password()
	{
		pass.sendKeys("manager");
	}
	public void loginbtn()
	{
		lgn_btn.click();
	
	}
}
