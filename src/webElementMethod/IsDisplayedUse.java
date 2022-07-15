package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
    WebDriver driver=new ChromeDriver();
	
    driver.get("https://vctcpune.com/selenium/practice.html");
    Thread.sleep(1000);
	
    WebElement showButton = driver.findElement(By.id("show-textbox"));
	WebElement hideButton = driver.findElement(By.id("hide-textbox"));
	WebElement textBox = driver.findElement(By.name("show-hide"));
	
	hideButton.click();
	
	if(textBox.isDisplayed())
	{
		System.out.println("Thank you text box is display");
	}
	else
	{
		System.out.println("Text box is not display");
	}
	}

}
