package pagecontent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_001 {
	WebDriver driver = null;
	
	public PO_001 (WebDriver driver) {
		this.driver=driver;
	}
	
	By registrationButton = By.xpath("//a[contains(text(),'Register')]");
	By gender = By.id("gender-male");
	By first_name = By.id("FirstName");
	By last_name = By.id("LastName");
	By email_number = By.name("Email");
	By company_name = By.name("Company");
	By password_number = By.id("Password");
	By confirm_password = By.name("ConfirmPassword");
	By submit_button = By.xpath("//button[@id='register-button']");
	By message = By.xpath("//div[contains(text(),'Your registration completed')]");
	
	
	
	public void clickregistrationButton()
	{
		driver.findElement(registrationButton).click();
	}
	
	public void clickgenderButton()
	{
		driver.findElement(gender).click();
	}
	
	public void clickfirst_nameButton()
	{
		driver.findElement(first_name).sendKeys("Md Sadikur");
	}
	
	public void clicklast_nameButton()
	{
		driver.findElement(last_name).sendKeys("Rahman");
	}
	
	public void clickemail_numberButton()
	{
		driver.findElement(email_number).sendKeys("mdsadik@gmail.com");
	}
	
	public void clickcompany_nameButton()
	{
		driver.findElement(company_name).sendKeys("Brainstation-23");
	}
	
	public void clickpassword_numberButton()
	{
		driver.findElement(password_number).sendKeys("123456789");
	}
	
	public void clickconfirm_passwordButton()
	{
		driver.findElement(confirm_password).sendKeys("123456789");
	}
	
	public void clicksubmit_buttonButton()
	{
		driver.findElement(submit_button).click();
	}
	
	public void clickmessageButton()
	{
		String text = driver.findElement(message).getText();
		System.out.println(text);
	}
	
	

}
