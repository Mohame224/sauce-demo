package checkoutpreview;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageobjects.CheckOutPreviewPage;
import pageobjects.CompleteCheckOutPreview;
import pageobjects.ProductsPage;

public class Functional extends SetupDriver {
	@Test(description = "test the checkout cancelling")
	public void cancelling() {
		CheckOutPreviewPage page = new CheckOutPreviewPage();
		ProductsPage productspage=new ProductsPage();
		page.navigation();

		page.pressCancel();

		Assert.assertTrue(driver.findElement(productspage.products).isDisplayed());

	}

	@Test(description = "test the checkout completion step")
	public void ordering() throws InterruptedException {
		CheckOutPreviewPage page = new CheckOutPreviewPage();
		CompleteCheckOutPreview completecheckoutpreview=new CompleteCheckOutPreview();
		page.navigation();
		page.pressFinish();

		Assert.assertTrue(driver.findElement(completecheckoutpreview.complete_container).isDisplayed());
	}

}
