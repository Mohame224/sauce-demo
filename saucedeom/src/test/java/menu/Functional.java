package menu;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Action;
import base.SetupDriver;

import pageobjects.MenuPage;
import pageobjects.ProductsPage;
import pageobjects.SignInPage;

public class Functional extends SetupDriver {

	@Test(description = "press logout from sidebar")
	public void pressLogOut() {
		SignInPage signinpage = new SignInPage();
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		ac.click(driver.findElement(menupage.menu_btn));
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarlogout), 2);
		ac.click(driver.findElement(menupage.sidebarlogout));
		Assert.assertTrue(driver.findElement(signinpage.usernam).isDisplayed());

	}

	@Test(description = "press about from sidebar")
	public void pressAbout() {

		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		ac.click(driver.findElement(menupage.menu_btn));
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebaraboutlink), 2);
		ac.click(driver.findElement(menupage.sidebaraboutlink));
		ac.explicitWaitTillElementVisibility(driver.findElement(By.className("css-zgf6by")), 2);
		Assert.assertTrue(driver.findElement(By.className("css-zgf6by")).isDisplayed());

	}

	@Test(description = "press all items from sidebar")
	public void pressAllItems() {
		ProductsPage productspage = new ProductsPage();
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		ac.click(driver.findElement(menupage.menu_btn));
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarallitemslink), 2);
		ac.click(driver.findElement(menupage.sidebarallitemslink));
		ac.explicitWaitTillElementVisibility(driver.findElement(productspage.products), 2);
		Assert.assertTrue(driver.findElement(productspage.products).isDisplayed());

	}

	@Test(description = "press reset app state from sidebar")
	public void pressResetAppState() {
		ProductsPage productspage = new ProductsPage();
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		productspage.allItemsAddToCartFronInProduct();
		ac.click(driver.findElement(menupage.menu_btn));
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarresetappstatelink), 2);
		ac.click(driver.findElement(menupage.sidebarresetappstatelink));
		ac.explicitWaitTillElementVisibility(driver.findElement(productspage.products), 2);
		boolean exists = driver.findElements(productspage.cartNumber).size() == 0;

		Assert.assertTrue(exists);

	}
}
