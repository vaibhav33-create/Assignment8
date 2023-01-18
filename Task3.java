package assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vaibhav");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bansude");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9756776543");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Selenium234");
		
		
		Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		day.selectByVisibleText("24");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByVisibleText("Jun");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		year.selectByVisibleText("1992");
		
		driver.findElement(By.xpath("//label[text()='Male']//..//input")).click();
		
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
