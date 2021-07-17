package TesPack1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VegCart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		String proList[] = { "Cucumber", "Beetroot", "Brocolli", "Tomato" };
		addItems(driver, proList);

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']")).click();
		driver.findElement(By.xpath("//div[@class='promoWrapper']/input")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		String txt = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(txt);

	}

	public static void addItems(WebDriver driver, String[] proList) throws Exception {
		List<WebElement> proName = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < proName.size(); i++) {

			String name = proName.get(i).getText();

			String formatName[] = name.split("-");
			String veg = formatName[0].trim();
			System.out.println(veg);
			List vegList = Arrays.asList(proList);

			if (vegList.contains(veg)) {
				j++;
					
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == proList.length) {
					break;
				}
			}
		}

	}

}
