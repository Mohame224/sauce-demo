package completeCheckout;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Action;
import base.SetupDriver;
import pageobjects.CompleteCheckOutPreview;
import pageobjects.ProductsPage;

public class Functional extends SetupDriver{
	@Test(description="test the back btn in completed checkout")
	public void pressBackBtn() {
		Action ac=new Action(driver);
		ProductsPage productspage = new ProductsPage();
		CompleteCheckOutPreview page=new CompleteCheckOutPreview();
		page.navigate();
		page.pressBack();

		ac.explicitWaitTillElementVisibility(driver.findElement(productspage.products), 2);
		boolean exists = driver.findElements(productspage.cartNumber).size() == 0;

		Assert.assertTrue(exists);

	}
}
