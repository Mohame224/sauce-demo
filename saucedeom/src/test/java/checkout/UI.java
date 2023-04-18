package checkout;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageobjects.CheckOutPage;

public class UI extends SetupDriver {
	@Test(description = "check checkout UI cancel btn")
	public void checkUICancelBtn() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.cancel_btn).isDisplayed());
	}

	@Test(description = "check checkout UI continue btn")
	public void checkUIContinueBtn() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.continue_btn).isDisplayed());
	}

	@Test(description = "check checkout UI facebook_btn")
	public void checkUIFaceBookBtn() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.facebook_btn).isDisplayed());
	}

	@Test(description = "check checkout UI menu")
	public void checkUIMenuBtn() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.menu_btn).isDisplayed());
	}

	@Test(description = "check checkout UI cart")
	public void checkUICartContainer() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.shoppingcartcontainer).isDisplayed());
	}

	@Test(description = "check checkout UI logo")
	public void checkUILogo() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.logo).isDisplayed());
	}

	@Test(description = "check checkout UI postal code")
	public void checkUIPostalCode() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.postal_code).isDisplayed());
	}

	@Test(description = "check checkout UI linkedin btn")
	public void checkUILinkedInBtn() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.linkein_btn).isDisplayed());
	}

	@Test(description = "check checkout UI Twitter btn")
	public void checkUITwitterBtn() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.twitter_btn).isDisplayed());
	}

	@Test(description = "check checkout UI lastname")
	public void checkUILastName() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.last_name).isDisplayed());
	}

	@Test(description = "check checkout UI firstname")
	public void checkUIFirstNameField() {

		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.navigate();
		Assert.assertTrue(driver.findElement(checkoutpage.first_name).isDisplayed());
	}

}
