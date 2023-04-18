package menu;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Action;
import base.SetupDriver;
import pageobjects.MenuPage;

public class UI extends SetupDriver {

	@Test(description = "check menu click UI from products page ")
	public void checkmenusidebar() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		driver.findElement(menupage.menu_btn).click();
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebar), 2);

		Assert.assertTrue(driver.findElement(menupage.sidebar).isDisplayed());
	}

	@Test(description = "check menu click UI ")
	public void checkMenuSidebarAllItemsLink() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		driver.findElement(menupage.menu_btn).click();
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarallitemslink), 2);

		Assert.assertTrue(driver.findElement(menupage.sidebarallitemslink).isDisplayed());
	}

	@Test(description = "check about link in menu from products page ")
	public void checkMenuSidebarAboutLink() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		driver.findElement(menupage.menu_btn).click();
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebaraboutlink), 2);

		Assert.assertTrue(driver.findElement(menupage.sidebaraboutlink).isDisplayed());
	}

	@Test(description = "check logout in menu from products page ")
	public void checkLogOut() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		driver.findElement(menupage.menu_btn).click();
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarlogout), 2);

		Assert.assertTrue(driver.findElement(menupage.sidebarlogout).isDisplayed());
	}

	@Test(description = "check reset state app in menu from products page ")
	public void checkStateResetLink() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		menupage.navigate();
		driver.findElement(menupage.menu_btn).click();
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarresetappstatelink), 2);
		Assert.assertTrue(driver.findElement(menupage.sidebarresetappstatelink).isDisplayed());
	}

}
