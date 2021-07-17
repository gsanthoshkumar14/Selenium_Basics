package TesPack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col1 = footer.findElement(By.xpath("table/tbody/tr/td[1]/ul"));
		int colCount = col1.findElements(By.tagName("a")).size();
		System.out.println(colCount);
		for (int i=1;i<colCount;i++) {
			String clickLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			col1.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
		}
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		

	}

}
