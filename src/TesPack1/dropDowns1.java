package TesPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropDowns1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\DriverExeFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement adult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		WebElement child = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		WebElement infant = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));

		Select ad = new Select(adult);
		ad.selectByIndex(4);
		Thread.sleep(2000);
		Select ac = new Select(child);
		ac.selectByIndex(3);
		Thread.sleep(2000);
		Select ai = new Select(infant);
		ai.selectByIndex(2);
		driver.findElement(By.id("flightSearchContainer")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// div[@id =
		// 'glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']
		driver.findElement(
				By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(count);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select curr = new Select(currency);
		curr.selectByIndex(5);

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
