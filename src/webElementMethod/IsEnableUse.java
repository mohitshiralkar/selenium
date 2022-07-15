package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.discoveryplus.in/");
	    Thread.sleep(5000);
	    WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
	    signInButton.click();
	    Thread.sleep(1000);
	    
	    WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
        boolean result = getOTP.isEnabled();
	    System.out.println(result);
         
	
	    WebElement mobileNo = driver.findElement(By.name("mobileNumber"));
	    mobileNo.sendKeys("9999999999");
       
	    boolean result1 = getOTP.isEnabled();
	    System.out.println(result1);
	    mobileNo.click();
	   
        
	
	   
	}

}
