package TesPack1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement dde = driver.findElement(By.id("dropdown-class-example"));
		Select dd = new Select(dde);
		dd.selectByIndex(1);
		String txt1 = dd.getFirstSelectedOption().getText();
		dd.selectByValue("option3");
		String txt2 = dd.getFirstSelectedOption().getText();
		System.out.println(txt1);
		System.out.println(txt2);

		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("INDIA")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Sandy");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		String alertTxt = alert.getText();
		System.out.println(alertTxt);
		alert.accept();

		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Santhosh");
		driver.findElement(By.id("confirmbtn")).click();
		Alert alert1 = driver.switchTo().alert();
		String alertTxt1 = alert.getText();
		System.out.println(alertTxt1);
		alert1.dismiss();

	}

}
