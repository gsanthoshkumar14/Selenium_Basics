package TesPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("div[@class='RNNXgb']/div/div[2]/input")).click();
		//driver.findElement(By.xpath("div[@class='RNNXgb']/div/div[2]/input")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.RETURN);
		String txt =driver.findElement(By.xpath("//div[@class='IsZvec']/span/span/em")).getText();
		System.out.println(txt);
		
		//div[@class='RNNXgb']/div/div[2]/input
	}

}
