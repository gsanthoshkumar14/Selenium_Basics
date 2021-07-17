package TesPack1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamFilter {

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
		driver.findElement(By.id("search-field")).sendKeys("rice");
		List<WebElement> le = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> org = le.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertTrue(le.size()==org.size());
		System.out.println(le.size()+"   "+org.size());
	}

}
