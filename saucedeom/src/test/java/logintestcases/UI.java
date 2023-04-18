package logintestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Action;
import base.SetupDriver;
import pageobjects.SignInPage;

public class UI extends SetupDriver {

	@Test(description = "check sign_in UI")
	public void checkUIContent() {
		Action ac = new Action(driver);
		SignInPage sign = new SignInPage();
		sign.navigate();
		Assert.assertTrue(ac.isDisplayed(driver.findElement(sign.logo)));
	}

	@Test(description = "check sign_in UI login")
	public void checkUIContentLoginBtn() {
		Action ac = new Action(driver);
		SignInPage sign = new SignInPage();
		sign.navigate();
		Assert.assertTrue(ac.isDisplayed(driver.findElement(sign.login_btn)));
	}

	@Test(description = "check sign_in UI username")
	public void checkUIContentUserName() {
		Action ac = new Action(driver);
		SignInPage sign = new SignInPage();
		sign.navigate();
		Assert.assertTrue(ac.isDisplayed(driver.findElement(sign.usernam)));
	}

	@Test(description = "check sign_in UI password")
	public void checkUIContentPass() {
		Action ac = new Action(driver);
		SignInPage sign = new SignInPage();
		sign.navigate();
		Assert.assertTrue(ac.isDisplayed(driver.findElement(sign.pass)));
	}

}
