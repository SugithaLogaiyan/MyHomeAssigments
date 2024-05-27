package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.id("accountName")).sendKeys("Seleniumclass3");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement drp1 = driver.findElement(By.name("industryEnumId"));
		Select industryvalue = new Select(drp1);
		industryvalue.selectByValue("IND_SOFTWARE");
		
		WebElement drp2 = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipvalue = new Select(drp2);
		ownershipvalue.selectByVisibleText("S-Corporation");
		
		WebElement drp3 = driver.findElement(By.id("dataSourceId"));
		Select sourcevalue = new Select(drp3);
		sourcevalue.selectByValue("LEAD_EMPLOYEE");
		
		WebElement drp4 = driver.findElement(By.id("marketingCampaignId"));
		Select marketingcampvalue = new Select(drp4);
		marketingcampvalue.selectByIndex(5);

		WebElement drp5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select statevalue = new Select(drp5);
		statevalue.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String str = driver.findElement(By.className("tabletext")).getText();
		
		if(str != "Seleniumclass3")
		{System.out.println("Account name is not displayed correctly");
		}
		
		driver.close();
		}
		
	}


