package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("firstname")).sendKeys("Test1");
	driver.findElement(By.name("lastname")).sendKeys("sur");
	driver.findElement(By.name("reg_email__")).sendKeys("sugitha88@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("SdF123@");
	

	WebElement drp1 = driver.findElement(By.id("day"));
	Select dayvalue = new Select(drp1);
	dayvalue.selectByVisibleText("18");
	
	
	WebElement drp2= driver.findElement(By.id("month"));
	Select monthvalue = new Select(drp2);
	monthvalue.selectByVisibleText("Jun");
	

	WebElement drp3= driver.findElement(By.id("year"));
	Select yearvalue = new Select(drp3);
	yearvalue.selectByVisibleText("1988");
	
	driver.findElement(By.cssSelector("input[value='1']")).click();
	
	//driver.close();
}
}
