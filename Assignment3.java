package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
				
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		//button[@class='btn btn-primary']
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		System.out.println("The title of page is : "+driver.getTitle());
		
		//a[text()='Log Out']
		
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		driver.close();
		
	}

}
