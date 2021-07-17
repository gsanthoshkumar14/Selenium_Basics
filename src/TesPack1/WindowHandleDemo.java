package TesPack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String para = driver.findElement(By.cssSelector("p.im-para.red")).getText();
		System.out.println(para);
		String id = para.split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(id);
		
		
		

	}

}
