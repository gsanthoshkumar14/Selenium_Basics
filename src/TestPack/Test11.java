package TestPack;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		String[] veg = {"Brocolli","Cucumber"};
		List al = Arrays.asList(veg);
		for (int i=0; i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");
			String vegname = name[0].trim();
			System.out.println(vegname);
			
			if (al.contains(vegname))
			{
				driver.findElements(By.id("increment")).get(i).click();
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}

	}

}
