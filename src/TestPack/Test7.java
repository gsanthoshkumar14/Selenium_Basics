package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//customized css
		//syntax for css = tagname[attribute='value']
		//regular expression for css = tagname[attribute*='value']
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.close();

	}

}
