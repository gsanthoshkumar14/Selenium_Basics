package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "F:\\DriverExeFile\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
