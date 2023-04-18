package completeCheckout;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageobjects.CompleteCheckOutPreview;

public class UI extends SetupDriver {
	@Test(description = "test completed checkout UI back btn")
	public void checkUI() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.back_btn).isDisplayed());

	}

	@Test(description = "test completed checkout UI cart")
	public void checkUICart() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.shoppingcartcontainer).isDisplayed());

	}

	@Test(description = "test completed checkout UI twitter")
	public void checkUITwitterBtn() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.twitter_btn).isDisplayed());

	}

	@Test(description = "test completed checkout UI Menu")
	public void checkUIMenuBtn() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.menu_btn).isDisplayed());

	}

	@Test(description = "test completed checkout UI logo")
	public void checkUILogo() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.logo).isDisplayed());

	}

	@Test(description = "test completed checkout UI linkedin btn")
	public void checkUILinkedInBtn() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.linkein_btn).isDisplayed());

	}

	@Test(description = "test completed checkout UI facebook btn")
	public void checkUIFaceBookBtn() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.facebook_btn).isDisplayed());

	}

	@Test(description = "test completed checkout UI completion text")
	public void checkUICompletionText() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.complete_text).isDisplayed());

	}

	@Test(description = "test completed checkout UI completion img")
	public void checkUICompletionImg() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.complete_img).isDisplayed());

	}

	@Test(description = "test completed checkout UI complete container")
	public void checkUICompleteContainer() {
		CompleteCheckOutPreview checkoutpreview = new CompleteCheckOutPreview();
		checkoutpreview.navigate();
		Assert.assertTrue(driver.findElement(checkoutpreview.complete_container).isDisplayed());

	}

}
