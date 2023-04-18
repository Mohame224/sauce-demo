package logintestcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Action;
import base.SetupDriver;
import pageobjects.ProductsPage;
import pageobjects.SignInPage;

public class Functional extends SetupDriver {

	@Test(dataProvider = "validData", description = "valid login")
	public void validLogin(String name, String password) {
		Action ac = new Action(driver);
		SignInPage sign = new SignInPage();
		ProductsPage productspage = new ProductsPage();

		sign.navigate();
		ac.implicitWait(5200);
		sign.typeUserName(name);
		sign.typePassword(password);
		sign.clickLogin();
		Assert.assertTrue(driver.findElement(productspage.products).isDisplayed());
	}

	@DataProvider
	public Object[][] validData() {
		return new Object[][] { { "standard_user", "secret_sauce" } };
	}

	// error in the third data provider string
	@Test(dataProvider = "invalidData", description = "invalid credentials")
	public void invalidLogin(String name, String password, String msg) {
		Action ac = new Action(driver);
		SignInPage sign = new SignInPage();

		sign.navigate();
		ac.implicitWait(500);
		sign.typeUserName(name);
		sign.typePassword(password);
		sign.clickLogin();

		Assert.assertEquals(msg, driver.findElement(sign.errormsg).getText());

	}

	@DataProvider
	public Object[][] invalidData() {
		return new Object[][] {
				{ "helo", "yessir", "Epic sadface: Username and password do not match any user in this service" },
				{ "standard_user", "", "Epic sadface: Password is required" },
				{ "", "secret_sauce", "Epic sadface: Username is required" },
				{ "", "", "Epic sadface: Username is required" },
				{ "locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out." } };
	}

	@Test(dataProvider = "validData", description = "check session after pressing back after signing in")
	public void checkSessionWhenPressBack(String name, String password) {
		Action ac = new Action(driver);
		SignInPage sign = new SignInPage();

		sign.navigate();
		sign.typeUserName(name);
		sign.typePassword(password);
		sign.clickLogin();
		ac.backNavigate();
		Assert.assertTrue(driver.findElement(sign.usernam).isDisplayed());
	}
}
