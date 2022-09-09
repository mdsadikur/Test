package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.DriverSetup;
import pagecontent.PO_001;

public class TC_001 extends DriverSetup{
	@Test
	public void registration() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		PO_001 cbox = new PO_001(driver);
		cbox.clickregistrationButton();
		Thread.sleep(2000);
		
		//gender
		cbox.clickgenderButton();
		Thread.sleep(2000);
		
		//firstName
		cbox.clickfirst_nameButton();
		Thread.sleep(2000);
		
		//lastName
		cbox.clicklast_nameButton();
		Thread.sleep(2000);
		
		//scroll
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		
		//date
		WebElement date = driver.findElement(By.name("DateOfBirthDay"));
		Select d = new Select(date);
		
		d.selectByValue("20");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
		Select m = new Select(month);
		
		m.selectByVisibleText("May");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.name("DateOfBirthYear"));
		Select y = new Select(year);
		
		y.selectByVisibleText("1995");
		Thread.sleep(2000);
		
		//email_number
		cbox.clickemail_numberButton();
		Thread.sleep(2000);
		
		//scroll
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		
		//company
		cbox.clickcompany_nameButton();
		Thread.sleep(2000);
		
		//password
		cbox.clickpassword_numberButton();
		Thread.sleep(2000);
		
		//confirm_password
		cbox.clickconfirm_passwordButton();
		Thread.sleep(2000);
		
		//submit
		cbox.clicksubmit_buttonButton();
		Thread.sleep(2000);
		
		//message_show
		cbox.clickmessageButton();
		Thread.sleep(2000);
		
	
	}

}
