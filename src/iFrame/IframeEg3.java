package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");	
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
	    
	    driver.switchTo().parentFrame();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();

	}
	

}
