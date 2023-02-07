package moolya1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
WebDriver driver;
	
	@BeforeTest
	public void btest()
	{WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	}
	@Test
	public void test() throws InterruptedException
	{//Thread.sleep(3000);
	//WebElement w=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button"));
	//w.click();
	WebElement wait=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button")));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",wait);
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("Srija");
	//Thread.sleep(2000);
	alert.accept();
	System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/span[2]")).getText());
	
	WebElement w1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/button"));
	w1.click();
	Thread.sleep(7000);
	Alert alert1=driver.switchTo().alert();
	Thread.sleep(2000);
	alert1.accept();
	
	//WebElement w2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button"));
	//w2.click();
	WebElement wait1=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button")));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",wait1);
	Alert alert2=driver.switchTo().alert();
	Thread.sleep(2000);
	alert2.dismiss();
	Thread.sleep(2000);
	
	}
	@AfterTest
	public void at() {
		driver.close();
	}
	}


