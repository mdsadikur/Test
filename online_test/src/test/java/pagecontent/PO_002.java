package pagecontent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_002 {
	WebDriver driver = null;
	
	public PO_002(WebDriver driver) {
		this.driver=driver;
	}
	
	//buying_process
	By electronicsButton = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
	By cellphoneButton = By.xpath("//a[text()=' Cell phones ']");
	By nokialumiaButton = By.xpath("//a[text()='Nokia Lumia 1020']");
	By quantityButton = By.id("product_enteredQuantity_20");
	By addcardButton = By.xpath("//button[@id='add-to-cart-button-20']");
	By shoppingcardButton = By.xpath("//span[contains(text(),'Shopping cart')]");
	By checkmarkButton = By.xpath("//input[@id='termsofservice']");
	By checkoutButton = By.id("checkout");
	By checkoutGuestButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");
	
	
	//personal_information
	By firstnameButton = By.xpath("//input[@id='BillingNewAddress_FirstName']");
	By lastnameButton = By.xpath("//input[@id='BillingNewAddress_LastName']");
	By emailButton = By.xpath("//input[@id='BillingNewAddress_Email']");
	By companynameButton = By.xpath("//input[@id='BillingNewAddress_Company']");
	By citynameButton = By.name("BillingNewAddress.City");
	By addressButton1 = By.name("BillingNewAddress.Address1");
	By addressButton2 = By.name("BillingNewAddress.Address2");
	By zipcodeButton = By.id("BillingNewAddress_ZipPostalCode");
	By phonenumberButton = By.id("BillingNewAddress_PhoneNumber");
	By faxnumberButton = By.name("BillingNewAddress.FaxNumber");
	By continueButton = By.name("save");
	
	
	//shipping_method
	By nextdayButton = By.id("shippingoption_1");
	By paymentcontinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
	
	//payment_method
	By creditcardButton = By.id("paymentmethod_1");
	By paymentButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
	
	//card_info
	By cardholdernameButton = By.name("CardholderName");
	By cardnumberButton = By.name("CardNumber");
	By cardcodeButton = By.name("CardCode");
	By cardcontinueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
	
	//confirm
	By orderconfirmButton = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
	
	//message
	By confirmMessageButton = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
	
	
	
	//buying
	public void clickelectronicsButton() {
		driver.findElement(electronicsButton).click();
	}
	
	public void clickcellphoneButton () {
		driver.findElement(cellphoneButton ).click();
	}
	
	public void clicknokialumiaButton() {
		driver.findElement(nokialumiaButton).click();
	}
	
	public void clickquantityButton() {
		driver.findElement(quantityButton).clear();
		driver.findElement(quantityButton).sendKeys("2");
	}
	
	public void clickaddcardButton() {
		driver.findElement(addcardButton).click();
	}
	
	public void clickshoppingcardButton() {
		driver.findElement(shoppingcardButton).click();
	}
	
	public void clickcheckmarkButton() {
		driver.findElement(checkmarkButton).click();
	}
	
	public void clickcheckoutButton() {
		driver.findElement(checkoutButton).click();
	}
	
	public void clickcheckoutGuestButton() {
		driver.findElement(checkoutGuestButton).click();
	}
	
	
	//personal_information
	public void clickfirstnameButton () {
		driver.findElement(firstnameButton ).sendKeys("Sadikur");
	}
	
	public void clicklastnameButton () {
		driver.findElement(lastnameButton).sendKeys("Rahman");
	}
	
	public void clickemailButton () {
		driver.findElement(emailButton ).sendKeys("sadik@gmail.com");
	}
	
	public void clickcompanynameButton() {
		driver.findElement(companynameButton).sendKeys("Brain Station - 23");
	}
	
	public void clickcitynameButton () {
		driver.findElement(citynameButton ).sendKeys("Pago");
	}
	
	public void clickaddressButton1() {
		driver.findElement(addressButton1).sendKeys("PO BOX 9");
	}
	
	public void clickaddressButton2() {
		driver.findElement(addressButton2).sendKeys("PAGO PAGO, AS");
	}
	
	public void clickzipcodeButton(){
		driver.findElement(zipcodeButton).sendKeys("1207");
	}
	
	public void clickphonenumberButton(){
		driver.findElement(phonenumberButton).sendKeys("123456789");
	}
	
	public void clickfaxnumberButton(){
		driver.findElement(faxnumberButton).sendKeys("987654321");
	}
	
	public void clickcontinueButton(){
		driver.findElement(continueButton).click();
	}
	
	
	//shipping
	public void clicknextdayButton(){
		driver.findElement(nextdayButton).click();
	}
	
	public void clickpaymentcontinueButton(){
		driver.findElement(paymentcontinueButton).click();
	}
	
	
	//Payment
	public void clickcreditcardButton(){
		driver.findElement(creditcardButton).click();
	}
	
	public void clickpaymentButton(){
		driver.findElement(paymentButton).click();
	}
	
	
	//card_info
	public void clickcardholdernameButton(){
		driver.findElement(cardholdernameButton).sendKeys("Md Sadikur Rahman");
	}
	
	public void clickcardnumberButton(){
		driver.findElement(cardnumberButton).sendKeys("4111111111111111");
	}
	
	public void clickcardcodeButton (){
		driver.findElement(cardcodeButton ).sendKeys("1234");
	}
	
	public void clickcardcontinueButton(){
		driver.findElement(cardcontinueButton).click();
	}
	
	//orderConfirm
	public void clickorderconfirmButton(){
		driver.findElement(orderconfirmButton).click();
	}
	
	//confirmMessage
	public void confirmMessageButton(){
		String text = driver.findElement(confirmMessageButton).getText();
		System.out.println(text);
	}
	
	
}
