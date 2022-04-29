package tests;

import org.testng.annotations.Test;

import Base.BaseClass;
import Page.MainPage;

public class SmokeTest extends BaseClass{
	@Test
	public void firstMethod() throws InterruptedException {
		MainPage mainpage = new MainPage(driver);
		mainpage.goToTheme();
		Thread.sleep(3000);
		
	}
	
}
