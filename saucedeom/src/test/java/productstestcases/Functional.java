package productstestcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Ordering;

import base.Action;
import base.SetupDriver;
import pageobjects.InProductPage;
import pageobjects.ProductsPage;

public class Functional extends SetupDriver {
	@Test(description = "test the A to Z name filter")
	public void filternames_AZ() {

		ProductsPage page = new ProductsPage();
		page.navigation();
		Select select = new Select(driver.findElement(page.select_filter_btn));
		List<String> sorted = new ArrayList<String>();
		select.selectByValue("az");

		for (WebElement option : driver.findElements(page.products)) {

			sorted.add(option.getText());
		}
		boolean sortedCheck = Ordering.natural().isOrdered(sorted);

		Assert.assertTrue(sortedCheck);

	}

	@Test(description = "test the Z to A  name filter")
	public void filternames_ZA() {

		ProductsPage page = new ProductsPage();
		page.navigation();
		Select select = new Select(driver.findElement(page.select_filter_btn));
		List<String> sorted = new ArrayList<String>();

		select.selectByValue("za");
		for (WebElement option : driver.findElements(page.products)) {

			sorted.add(option.getText());
		}
		boolean sortedCheck = Ordering.natural().reverse().isOrdered(sorted);
		Assert.assertTrue(sortedCheck);

	}

	@Test(description = "test the low to high price filter")
	public void filterPriceLowToHigh() {

		ProductsPage page = new ProductsPage();
		page.navigation();
		Select select = new Select(driver.findElement(page.select_filter_btn));
		List<Float> sorted = new ArrayList<Float>();
		select.selectByValue("lohi");
		for (WebElement option : driver.findElements(page.item_price)) {

			sorted.add(Float.parseFloat(option.getText().replace("$", "")));

		}
		boolean sortedCheck = Ordering.natural().isOrdered(sorted);

		Assert.assertTrue(sortedCheck);

	}

	@Test(description = "test the high to low price filter")
	public void filterPriceHighToLow() {

		ProductsPage page = new ProductsPage();
		page.navigation();
		Select select = new Select(driver.findElement(page.select_filter_btn));
		List<Float> sorted = new ArrayList<Float>();
		select.selectByValue("hilo");
		for (WebElement option : driver.findElements(page.item_price)) {

			sorted.add(Float.parseFloat(option.getText().replace("$", "")));
		}
		boolean sortedCheck = Ordering.natural().reverse().isOrdered(sorted);

		Assert.assertTrue(sortedCheck);

	}

	@Test(description = "test the product name click buttons")
	public void productClick() {
		ProductsPage page = new ProductsPage();
		Action ac = new Action(driver);
		String curenturl = prop.getProperty("incentory_url");
		page.navigation();

		for (int i = 0; i < driver.findElements(page.products).size(); i++) {
			driver.findElements(page.products).get(i).click();
			Assert.assertNotEquals(ac.getCurrentURL(), curenturl);
			ac.backNavigate();

		}

	}

	@Test(description = "test the add to cart and remove buttons in products ")
	public void productAddToCart() throws InterruptedException {
		ProductsPage page = new ProductsPage();
		Action ac = new Action(driver);
		ac.implicitWait(2000);

		page.navigation();
		for (WebElement option : driver.findElements(page.add_to_cart_btn)) {
			option.click();
		}

		Assert.assertEquals(Integer.toString(driver.findElements(page.products).size()),
				driver.findElement(page.cartNumber).getText());
		for (WebElement option : driver.findElements(page.remove_btn)) {
			option.click();
		}


	}
	//dont know why it fails in the testng
	@Test(description = "test the inproducts cart buttons")
	public void checkaddtocart() throws InterruptedException {
		ProductsPage page = new ProductsPage();
		Action ac =new Action(driver);
		InProductPage page2 = new InProductPage();
ac.implicitWait(2000);
		page.navigation();

		for (int i = 0; i < driver.findElements(page.products).size(); i++) {
			driver.findElements(page.products).get(i).click();
			ac.implicitWait(2000);
			page2.pressaddtoCartButton();
			ac.implicitWait(2000);
			page2.pressBackButton();

		}
		Assert.assertEquals(Integer.toString(driver.findElements(page.products).size()),
				driver.findElement(page2.cartNumber).getText());
	}
}
