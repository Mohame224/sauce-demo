package carttestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageobjects.CartPage;
import pageobjects.CheckOutPage;

public class Functional extends SetupDriver {

	@Test(description = "test continue shopping btn")
	public void testContinueShoppingBtn() throws InterruptedException {

		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		String currentUrl = prop.getProperty("inventory_url");
		driver.findElement(cartPage.continue_shopping_btn).click();
		Assert.assertEquals(currentUrl, driver.getCurrentUrl());
	}

	@Test(description = "test the checkout btn")
	public void testChecOutBbtn() {

		CartPage cartPage = new CartPage();
		CheckOutPage checkputpage = new CheckOutPage();
		cartPage.cartNavigationWithItemds();

		driver.findElement(cartPage.checkout_btn).click();
		Assert.assertTrue(driver.findElement(checkputpage.postal_code).isDisplayed());
	}

	@Test(description = "test remove function")
	public void testRemoveBtn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		int c = driver.findElements(cartPage.remove_btn).size();
		for (int i = 0; i < c; i++) {
			driver.findElement(cartPage.remove_btn).click();
			driver.navigate().refresh();

		}
		boolean exists = driver.findElements(cartPage.remove_btn).size() == 0;
		Assert.assertTrue(exists);

	}
}
