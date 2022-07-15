package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");	
    WebDriver driver=new ChromeDriver();
    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    
    driver.switchTo().frame("frame1");
    //driver.findElement(By.tagName("input")).sendKeys("Selenium");
    Thread.sleep(1000);
    WebElement textBox = driver.findElement(By.tagName("input"));
    JavascriptExecutor jse = ((JavascriptExecutor)driver);
    (jse).executeScript("arguments[0]. value='selenium';",textBox);
	Thread.sleep(1000);
    
    driver.switchTo().frame("frame3");
    driver.findElement(By.id("a")).click();
    Thread.sleep(1000);
    
    driver.switchTo().defaultContent();
    driver.switchTo().frame("frame2");
    driver.findElement(By.xpath("//option[text()='Big Baby Cat']")).click();
    
	
	
	}

}
