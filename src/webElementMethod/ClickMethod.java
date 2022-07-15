package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    Thread.sleep(1000);
	
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
    
    WebElement element = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	System.out.println(element.getText());
	
	WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
	System.out.println(text.getText());
	}

}
