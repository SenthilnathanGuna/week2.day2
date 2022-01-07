package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) 
	{
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//	driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("abcde");
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("g");
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("8768977871");
		driver.findElement(By.xpath("//input[@name ='reg_passwd__']")).sendKeys("8768977871");
		
		
				
		WebElement dd1 = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		WebElement dd2 = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		WebElement dd3 = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Select dropdown1 = new Select(dd1);
		Select dropdown2 = new Select(dd2);
		Select dropdown3 = new Select(dd3);
		
		dropdown1.selectByVisibleText("9");
		dropdown2.selectByVisibleText("Mar");
		dropdown3.selectByVisibleText("2005");
		
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
	}

}
