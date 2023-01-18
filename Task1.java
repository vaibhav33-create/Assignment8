package assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String expStr = "Facebook helps you connect and share with the people in your life";
		
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	
		String ss = ele.getText();
		System.out.println(ss);
		if(ss.equals(expStr)) {
			System.out.println("Match result");
		}else {
			System.out.println("not match");
		}
	
	}

}
