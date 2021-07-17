package TesPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingCert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities co = DesiredCapabilities.chrome();
		co.acceptInsecureCerts(); //to accept insecure certificates
		co.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); //for ssl certificates
		ChromeOptions c = new ChromeOptions();
		c.merge(co);
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize(); // for maximizing window
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().deleteAllCookies(); // for deleting cookies
	}

}
