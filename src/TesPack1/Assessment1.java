package TesPack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//img[@class='banner-image']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1300)");
		driver.findElement(By.xpath("//input[@name='your-name']")).sendKeys("Sandy");
		driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys("sandy@abc.com");
		driver.findElement(By.xpath("//input[@name='your-mobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='your-country']")).sendKeys("INDIA");
		driver.findElement(By.xpath("//input[@name='your-city']")).sendKeys("CHN");
		//js.executeScript("window.scrollBy(0,300)");
		//driver.findElement(By.xpath("//input[@name='your-message']")).sendKeys("Selenium course is good");
		//driver.findElement(By.xpath("//input[@name='captcha-170']")).sendKeys("9PEG");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='wpb_wrapper']/div[2]/form/p[8]/input"))).sendKeys(Keys.ENTER).build().perform();
		//.click().build().perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("wpcf7-response-output")).getText());
		
		//driver.findElement(By.cssSelector("input.wpcf7-form-control.wpcf7-submit")).click();
		//driver.findElement(By.xpath("//div[@class='wpb_wrapper']/div[2]/form/p[8]/input")).click();
	}

}
