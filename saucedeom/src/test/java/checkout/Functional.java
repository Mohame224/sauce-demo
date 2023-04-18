package checkout;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageobjects.CartPage;
import pageobjects.CheckOutPage;
import pageobjects.CheckOutPreviewPage;

public class Functional extends SetupDriver {

	@Test(description = "test the checkout cancel button")
	public void press_cancelButton() {

		CartPage cartpage = new CartPage();
		cartpage.cartNavigationWithItemds();
		cartpage.pressCheckBtn();

		// page.navigate();
		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.pressCancel();
		Assert.assertTrue(driver.findElement(cartpage.continue_shopping_btn).isDisplayed());
	}

	@Test(description = "test the checkout continue button")
	public void press_continue() {
		CheckOutPage checkoutpage = new CheckOutPage();
		CheckOutPreviewPage checkoutpreview = new CheckOutPreviewPage();
		checkoutpage.navigate();
		checkoutpage.typeFirstName("fdx");

		checkoutpage.typeLastName("sdggr");

		checkoutpage.typePostal("2133244");

		checkoutpage.pressContinue();

		Assert.assertTrue(driver.findElement(checkoutpreview.priceAfterTax).isDisplayed());
	}

}
