package checkoutpreview;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageobjects.CheckOutPreviewPage;

public class UI extends SetupDriver {
	@Test(description = "test UI of checkout preview")
	public void checkUI() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.cancel_btn).isDisplayed());
	}

	@Test(description = "test UI of checkout preview twitter btn")
	public void checkUITwitterBtn() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.twitter_btn).isDisplayed());

	}

	@Test(description = "test UI of checkout preview cart")
	public void checkUICartContainer() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.shoppingcartcontainer).isDisplayed());

	}

	@Test(description = "test UI of checkout preview tax")
	public void checkUITax() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.tax).isDisplayed());
	}

	@Test(description = "test UI of checkout preview price before tax")
	public void checkUIPriceBeforeTax() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.priceBeforeTax).isDisplayed());
	}

	@Test(description = "test UI of checkout preview price after tax")
	public void checkUIPriceAfterTax() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.priceAfterTax).isDisplayed());
	}

	@Test(description = "test UI of checkout preview menu")
	public void checkUIMenu() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.menu_btn).isDisplayed());
	}

	@Test(description = "test UI of checkout preview logo")
	public void checkUILogo() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.logo).isDisplayed());
	}

	@Test(description = "test UI of checkout preview linkedin btn")
	public void checkUILinkenInBtn() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.linkein_btn).isDisplayed());
	}

	@Test(description = "test UI of checkout preview finish btn")
	public void checkUIFinishBtn() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.finish_btn).isDisplayed());
	}

	@Test(description = "test UI of checkout preview facebookbtn")
	public void checkUIFacebookBtn() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		checkoutpreviewpage.navigation();
		Assert.assertTrue(driver.findElement(checkoutpreviewpage.facebook_btn).isDisplayed());
	}

}
