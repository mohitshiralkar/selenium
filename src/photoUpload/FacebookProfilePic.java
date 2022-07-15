package photoUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookProfilePic {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(500);
	    driver.findElement(By.id("email")).sendKeys("mohitshiralkar@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("10002000");
	    driver.findElement(By.name("login")).click();
	   // driver.findElement(By.xpath("//div[text()='Update Profile Picture']")).click();

	}

}
