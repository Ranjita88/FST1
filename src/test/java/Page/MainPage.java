package Page;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import methods.MethodClass;

public class MainPage extends BaseClass{

	public MainPage(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
	}

	@AndroidFindBy(accessibility = "Views")
	private AndroidElement viewLink;
	@AndroidFindBy(accessibility = "Controls")
	private AndroidElement contoldButton;
	@AndroidFindBy(accessibility = "1. Light Theme")
	private AndroidElement lightThemeButton;
	@AndroidFindBy(accessibility = "1. Light Theme")
	private AndroidElement checkBox1;

	
	MethodClass methods = new MethodClass();
	public void goToTheme() {
		methods.clickOnElement(viewLink);
		methods.clickOnElement(contoldButton);
		methods.clickOnElement(lightThemeButton);
		methods.clickOnElement(checkBox1);
	}

}
