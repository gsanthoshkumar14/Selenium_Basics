package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//customized xpath
		//syntax for xpath = //tagname[@attribute='value']
		//regular xpath syntax = //tagname[contains(@attribute,'value')]
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}

}
