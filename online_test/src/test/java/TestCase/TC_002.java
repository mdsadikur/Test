package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.DriverSetup;
import pagecontent.PO_002;

public class TC_002 extends DriverSetup{
	
	@Test
	public void placeorder() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		PO_002 cbox = new PO_002(driver);
		
		//electronics
		cbox.clickelectronicsButton();
		Thread.sleep(2000);
		
		//cellPhone
		cbox.clickcellphoneButton();
		Thread.sleep(2000);
		
		//scroll
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		
		//nokiaLomia
		cbox.clicknokialumiaButton();
		Thread.sleep(2000);
		
		//scroll
		js.executeScript("window.scroll(500,600)");
		Thread.sleep(2000);
		
		//quantity
		cbox.clickquantityButton();
		Thread.sleep(2000);
		
		//add_card
		cbox.clickaddcardButton();
		Thread.sleep(8000);
		
		//scroll
		js.executeScript("window.scroll(500,0)");
		Thread.sleep(2000);
		
		//shoppingCard
		cbox.clickshoppingcardButton();
		Thread.sleep(2000);
		
		//scroll
		js.executeScript("window.scroll(0,700)");
		Thread.sleep(2000);
		
		//checkMark
		cbox.clickcheckmarkButton();
		Thread.sleep(2000);
		
		//checkOut
		cbox.clickcheckoutButton();
		Thread.sleep(2000);
		
		//scroll
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(2000);
		
		//checkoutGuest
		cbox.clickcheckoutGuestButton();
		Thread.sleep(2000);
		
		//firstName
		cbox.clickfirstnameButton();
		Thread.sleep(2000);
		
		//lastName
		cbox.clicklastnameButton();
		Thread.sleep(2000);
		
		//emailNumber
		cbox.clickemailButton();
		Thread.sleep(2000);
		
		//companyName
		cbox.clickcompanynameButton();
		Thread.sleep(2000);
		
		//country_name
		WebElement country = driver.findElement(By.name("BillingNewAddress.CountryId"));
		Select c = new Select(country);
		
		c.selectByValue("210");
		Thread.sleep(2000);
		
		//city_name
		cbox.clickcitynameButton();
		Thread.sleep(2000);
		
		//address1
		cbox.clickaddressButton1();
		Thread.sleep(2000);
		
		//address2
		cbox.clickaddressButton2();
		Thread.sleep(2000);
		
		//zipCode
		cbox.clickzipcodeButton();
		Thread.sleep(2000);
		
		//phoneNumber
		cbox.clickphonenumberButton();
		Thread.sleep(2000);
		
		//faxNumber
		cbox.clickfaxnumberButton();
		Thread.sleep(2000);
		
		//continue
		cbox.clickcontinueButton();
		Thread.sleep(2000);
		
		//shippingRadio
		cbox.clicknextdayButton();
		Thread.sleep(2000);
		
		//shippingContinue
		cbox.clickpaymentcontinueButton();
		Thread.sleep(2000);
		
		//paymentCreditCard
		cbox.clickcreditcardButton();
		Thread.sleep(2000);
		
		//paymentContinue
		cbox.clickpaymentButton();
		Thread.sleep(2000);
		
		//cardholderName
		cbox.clickcardholdernameButton();
		Thread.sleep(2000);
		
		//cardholderNumber
		cbox.clickcardnumberButton();
		Thread.sleep(2000);
		
		//expireMonth
		WebElement ExMonth = driver.findElement(By.name("ExpireMonth"));
		Select e = new Select(ExMonth);
		
		e.selectByValue("12");
		Thread.sleep(2000);
		
		WebElement ExYear = driver.findElement(By.name("ExpireYear"));
		Select y = new Select(ExYear);
		
		y.selectByValue("2026");
		Thread.sleep(2000);
		
		//cardCode
		cbox.clickcardcodeButton();
		Thread.sleep(2000);
		
		//cardContinue
		cbox.clickcardcontinueButton();
		Thread.sleep(2000);
		
		//scroll
		js.executeScript("window.scroll(0,800)");
		Thread.sleep(2000);
		
		//order_Confirm
		cbox.clickorderconfirmButton();
		Thread.sleep(2000);
		
		//confirmMessage
		cbox.confirmMessageButton();
		Thread.sleep(2000);
		
	}

}
