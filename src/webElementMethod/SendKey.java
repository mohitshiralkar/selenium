package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey {

	public static void main(String[] args) throws InterruptedException  {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("mohitshiralkar@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("pass")).sendKeys("10002000");
	Thread.sleep(1000);
	driver.findElement(By.name("login")).click();
	
	
	
	}

}
