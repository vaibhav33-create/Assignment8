package assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		List<WebElement>ele = driver.findElements(By.xpath("//a[text()='Sign Up']//../..//li//a"));
		Thread.sleep(2000);
		
		
		for(WebElement el :ele) {
			//String ss = el.getText();
			//System.out.println(ss);
			if(el.getText().contains("Create Page")) {
				
				el.click();
			}
		}
	}

}
