package carttestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageobjects.CartPage;

public class UI extends SetupDriver {
	@Test(description = "test cart UI CheckoutBtn")
	public void checkCartUICheckoutBtn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.checkout_btn).isDisplayed());
	}

	@Test(description = "test cart UI ContinuseBtn")
	public void checkCartUIContinuseBtn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.continue_shopping_btn).isDisplayed());
	}

	@Test(description = "test cart UI LinkedinBtn")
	public void checkCartUILinkedinBtn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.linkein_btn).isDisplayed());
	}

	@Test(description = "test cart UI TwitterBtn")
	public void checkCartUITwitterBtn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.twitter_btn).isDisplayed());
	}

	@Test(description = "test cart UI MenuBtn")
	public void checkCartUIMenuBtn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.menu_btn).isDisplayed());
	}

	@Test(description = "test cart UI RemoveBtn")
	public void checkCartUIRemoveBtn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.remove_btn).isDisplayed());
	}
	
	@Test(description = "test cart UI RemoveBtn without items")
	public void checkCartUIRemoveBtnWithoutItems() throws InterruptedException {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithoutItemds();
		boolean exists=driver.findElements(cartPage.remove_btn).size() != 0;
		Assert.assertFalse(exists);

	}

	@Test(description = "test cart UI CartQuantity")
	public void checkCartUICartQuantity() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.cart_quantity_btn).isDisplayed());
	}
	
	@Test(description = "test cart UI CartQuantity without items")
	public void checkCartUICartQuantityWithoutItems() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithoutItemds();
		boolean exists=driver.findElements(cartPage.cart_quantity_btn).size() != 0;
		Assert.assertFalse(exists);
	}

	@Test(description = "test cart UI PriceTags")
	public void checkCartUIPriceTags() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.price).isDisplayed());
	}
	
	@Test(description = "test cart UI PriceTags without items")
	public void checkCartUIPriceTagsWithoutItems() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithoutItemds();
		boolean exists=driver.findElements(cartPage.price).size() != 0;
		Assert.assertFalse(exists);
	}


	@Test(description = "test cart UI FacebookBtn")
	public void checkCartUIFacebookBtn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.facebook_btn).isDisplayed());
	}

	@Test(description = "test cart UI Products")
	public void checkCartUIProducts() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
		Assert.assertTrue(driver.findElement(cartPage.items).isDisplayed());
	}
	
	
	@Test(description = "test cart UI Products without items")
	public void checkCartUIProductsWithoutItems() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithoutItemds();
		boolean exists=driver.findElements(cartPage.items).size() != 0;
		Assert.assertFalse(exists);
	}

}
