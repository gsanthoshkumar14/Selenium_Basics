package TesPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Int1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		String str = driver.findElement(By.cssSelector("h3.LC20lb.DKV0Md")).getText();
		boolean flag = false;
		if(str.contains("Selenium")) {
			flag=true;
		}
		System.out.println(flag);
		Assert.assertTrue(flag, str);
		driver.close();
			
		

	}

}
