package Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.MyConstants;
import utils.PropertyReader;

public class BaseClass{

	public AndroidDriver<MobileElement> driver;
	
	@BeforeSuite
	public void SetUpDriver() throws MalformedURLException, InterruptedException {
		PropertyReader pReader = new PropertyReader();
		DesiredCapabilities cap = new DesiredCapabilities();
		URL appuimURL = new URL("http://127.0.0.1:4723/wd/hub/");
		
		  cap.setCapability(MyConstants.platform_name, pReader.getPropertyValue(MyConstants.platform_name));
		  cap.setCapability(MyConstants.app_Activity, pReader.getPropertyValue(MyConstants.app_Activity));
		  cap.setCapability(MyConstants.app_Package, pReader.getPropertyValue(MyConstants.app_Package));
		  cap.setCapability(MyConstants.device_Name, pReader.getPropertyValue(MyConstants.device_Name));
		  cap.setCapability(MyConstants.platform_Version, pReader.getPropertyValue(MyConstants.platform_Version));
		  
		  driver = new AndroidDriver<MobileElement>(appuimURL, cap);
	}
	
	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
}
