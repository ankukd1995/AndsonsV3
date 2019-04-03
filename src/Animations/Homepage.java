package Animations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage 
{

	public static void main(String[] args)
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Homepage home = new Homepage();
        home.homeanimations(driver); 


	}

	public void homeanimations(WebDriver driver)
	{
		
		driver.get("https://andsons-v3.myshopify.com/");
		driver.manage().window().maximize();
		System.out.println("Homepage URL:" +  driver.getCurrentUrl());
		System.out.println("Homepage Title:" + driver.getTitle());
		
		
	}
	
}
