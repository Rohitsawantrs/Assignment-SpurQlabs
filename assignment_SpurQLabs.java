import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assignment_SpurQLabs {

	WebDriver driver;
	WebElement Result;
	@BeforeClass
	void Browser_Launch() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");	
	}
	@Test (priority=1)
	void Multiplication() {
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='×']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Result =driver.findElement(By.id("sciOutPut"));
		Assert.assertEquals(Result.getText(), " 222075");
	}
	
	@Test(priority=2)
	void Division() {
	driver.findElement(By.xpath("//span[text()='AC']")).click();
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[text()='0']")).click();
	driver.findElement(By.xpath("//span[text()='0']")).click();
	driver.findElement(By.xpath("//span[text()='0']")).click();
	driver.findElement(By.xpath("//span[text()='/']")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='0']")).click();
	driver.findElement(By.xpath("//span[text()='0']")).click();
		Assert.assertEquals(Result.getText(), " 20");
	}
	@Test(priority=4)
	void Subtraction() {
	
	driver.findElement(By.xpath("//span[text()='AC']")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[text()='8']")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='–']")).click();	
	driver.findElement(By.xpath("//span[text()='–']")).click();	
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='0']")).click();
	driver.findElement(By.xpath("//span[text()='9']")).click();
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[text()='8']")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	Assert.assertEquals(Result.getText(), " 23329646");
	}


	@Test(priority=3)
	void  Addition() {
	driver.findElement(By.xpath("//span[text()='AC']")).click();
	driver.findElement(By.xpath("//span[text()='–']")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[text()='+']")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[text()='5']")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[text()='5']")).click();
	Assert.assertEquals(Result.getText(), " 111111");
	}
	
	
	
}
