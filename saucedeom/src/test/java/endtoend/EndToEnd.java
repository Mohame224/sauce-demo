package endtoend;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Action;
import base.SetupDriver;
import pageobjects.CartPage;
import pageobjects.CheckOutPage;
import pageobjects.CheckOutPreviewPage;
import pageobjects.CompleteCheckOutPreview;
import pageobjects.InProductPage;
import pageobjects.ProductsPage;
import pageobjects.SignInPage;

public class EndToEnd extends SetupDriver {
	@Test(description = "Full test")
	public void EndToEndtest() throws InterruptedException {
		Action ac = new Action(driver);
		ac.implicitWait(2000);
		SignInPage signinpage = new SignInPage();
		ProductsPage productspage = new ProductsPage();
		InProductPage inproductpage = new InProductPage();
		CartPage cartpage = new CartPage();
		CheckOutPage checkoutpage = new CheckOutPage();
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		CompleteCheckOutPreview completecheckoutpreviewpage = new CompleteCheckOutPreview();
		signinpage.navigate();
		signinpage.typeUserName("standard_user");
		signinpage.typePassword("secret_sauce");
		signinpage.clickLogin();

		driver.findElement(productspage.products).click();
		inproductpage.pressaddtoCartButton();
		inproductpage.pressCartButton();
		cartpage.pressCheckBtn();
		checkoutpage.typeFirstName("mo");
		checkoutpage.typeLastName("ha");
		checkoutpage.typePostal("123");
		checkoutpage.pressContinue();
		checkoutpreviewpage.pressFinish();
		Assert.assertTrue(driver.findElement(completecheckoutpreviewpage.complete_container).isDisplayed());

	}

}
