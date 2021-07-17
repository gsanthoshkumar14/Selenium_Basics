package TesPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int count=0;
		for(int i=0;i<values.size();i++) {
			count = count+ Integer.parseInt(values.get(i).getText());
		}
		System.out.println(count);
		
		String total = driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();
		int totalCount = Integer.parseInt(total);
		if(count==totalCount) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		Assert.assertEquals(count, totalCount);
			

	}

}
