package productstestcases;



import org.testng.Assert;
import org.testng.annotations.Test;


import base.SetupDriver;
import pageobjects.InProductPage;
import pageobjects.ProductsPage;

public class UI extends SetupDriver {
	@Test(description = "check inventoty UI logo")
	public void checkUIContent() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.logo).isDisplayed());
	}

	@Test(description = "check inventoty UI linkedin btn")
	public void checkUIContentLinkedInBtn() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.linkein_btn).isDisplayed());
	}

	@Test(description = "check inventoty UI facebook")
	public void checkUIContentFaceBookBtn() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.facebook_btn).isDisplayed());
	}

	@Test(description = "check inventoty UI twitter")
	public void checkUIContentTwitterBtn() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.twitter_btn).isDisplayed());
	}

	@Test(description = "check inventoty UI price tag")
	public void checkUIContentPriceTag() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.item_price).isDisplayed());
	}

	@Test(description = "check inventoty UI products ")
	public void checkUIContentProducts() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.products).isDisplayed());
	}

	@Test(description = "check inventoty UI filter")
	public void checkUIContentFilter() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.select_filter_btn).isDisplayed());
	}

	@Test(description = "check inventoty UI menu ")
	public void checkUIContentMenu() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.menu_btn).isDisplayed());
	}

	@Test(description = "check inventoty UI cart")
	public void checkUIContentCart() {
		ProductsPage productspage = new ProductsPage();
		productspage.navigation();
		Assert.assertTrue(driver.findElement(productspage.shoppingcartcontainer).isDisplayed());
	}

	

	@Test(description = "check inProduct page UI")
	public void checkProductItemsUI() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.logo).isDisplayed());
	}

	@Test(description = "check inProduct page UI img ")
	public void checkProductItemsUIImg() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.img).isDisplayed());
	}

	@Test(description = "check inProduct page UI price tag")
	public void checkProductItemsUIPriceTag() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.price).isDisplayed());
	}

	@Test(description = "check inProduct page UI linkenin")
	public void checkProductItemsUILinkedInBtn() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.linkein_btn).isDisplayed());
	}

	@Test(description = "check inProduct page UI facebook")
	public void checkProductItemsUIFaceBookBtn() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.facebook_btn).isDisplayed());
	}

	@Test(description = "check inProduct page UI twitter")
	public void checkProductItemsUITwitter() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.twitter_btn).isDisplayed());
	}

	@Test(description = "check inProduct page UI back btn")
	public void checkProductItemsUIBackBtn() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.back_btn).isDisplayed());
	}

	@Test(description = "check inProduct page UI menu")
	public void checkProductItemsUIMenu() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.menu_btn).isDisplayed());
	}

	@Test(description = "check inProduct page UI cart")
	public void checkProductItemsUICart() {
		InProductPage inproductpage = new InProductPage();
		inproductpage.navigation();
		Assert.assertTrue(driver.findElement(inproductpage.shoppingcartcontainer).isDisplayed());
	}

	
	
}
