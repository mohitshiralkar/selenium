package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodUse1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://vctcpune.com/selenium/practice.html");
    driver.manage().window().maximize();
    Thread.sleep(500);
    //driver.manage().window().minimize();
    driver.navigate().to("https://www.facebook.com/");
    Thread.sleep(500);
    driver.navigate().back();
    Thread.sleep(500);
    driver.navigate().forward();
    Thread.sleep(500);
    driver.navigate().refresh();
    
    System.out.println(driver.getTitle());
    String Title = driver.getTitle();
    System.out.println("Title of webpage is "+Title);
    
    System.out.println(driver.getCurrentUrl());
     String url = driver.getCurrentUrl();
     System.out.println("URL IS "+url);
    
	}

}
