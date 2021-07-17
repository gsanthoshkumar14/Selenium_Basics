package TesPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://touch.facebook.com/");
		driver.findElement(By.id("m_login_email")).sendKeys("emailID");
		driver.findElement(By.id("m_login_password")).sendKeys("passwd");
		driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.name("login")).click();
		System.out.println("clicked");
	}

}
