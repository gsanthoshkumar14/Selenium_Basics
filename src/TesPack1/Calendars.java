package TesPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		//div[class='datepicker-days'][class='datepicker-switch']
		String monthTxt = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		String month = "August 2021";
		while (!month.equalsIgnoreCase(monthTxt)) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
			monthTxt = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		}
		List<WebElement> date = driver.findElements(By.className("day"));
		int count = date.size();
		for(int i=0;i<count;i++) {
			String dateTxt = date.get(i).getText();
			if(dateTxt.equalsIgnoreCase("23")) {
				date.get(i).click();
				break;
			}
		}

	}

}
