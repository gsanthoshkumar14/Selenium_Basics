package TesPack1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#/offers']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//check whether the list is in sorted order or not
		driver.findElement(By.xpath("//div[@class='container']/table/thead/tr/th[1]")).click();
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> vegList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = vegList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(vegList.equals(sortedList));
		List<String> price;
		
		//get price of a veggie
		do {
			List<WebElement> elements1 = driver.findElements(By.xpath("//tr/td[1]"));
		 price = elements1.stream().filter(s->s.getText().contains("Rice"))
				.map(s->getPrice(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		if(price.size()<1) {
			driver.findElement(By.xpath("//div[@class='col-xs-8']/ul/li[7]")).click();
		}
		} while (price.size()<1);
		
		
		

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
