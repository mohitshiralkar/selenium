package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(1000);
	
	WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
	boolean result = checkbox1.isSelected();
	System.out.println(result);
	
	Thread.sleep(1000);
	checkbox1.click();
	
	boolean result1 = checkbox1.isSelected();
	System.out.println(result1);
	
	if(result)
	{
		System.out.println("Checkbox Option 1 is selected");
	}
	else
	{
		System.out.println("Plz select check box option 1");
	}
	
	
	
	
	
	
	
	
	
	}

}
