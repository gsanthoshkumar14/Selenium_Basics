package TesPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://touch.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xpath");
		driver.findElement(By.cssSelector("#m_login_password")).sendKeys("css");
		driver.findElement(By.xpath("//*[@id=\'forgot-password-link\']")).click();
		
		//validate in browser console using $x("xpath") for xpath
		
		//validate in browser console using $("css") for css
		
		
		//xpath syntax - //tagname[@attribute='value']
		//css syntax - tagname[attribute='value'] or tagname#id or tagname.classname
		
		
	}

}
