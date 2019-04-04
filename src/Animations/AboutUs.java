package Animations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutUs {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AboutUs abb = new AboutUs();
        abb.about(driver);
        

	}

   public void about(WebDriver driver) throws InterruptedException
   {
	   driver.get("https://andsons-v3.myshopify.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
	   
	   // Clicking on the About us
	    driver.findElement(By.xpath("//div[@class='right-header']//a[contains(text(),'About Us')]")).click();
	    System.out.println("\n");
	    System.out.println("About us page URL:" + driver.getCurrentUrl());
	    System.out.println("Ttile of the page:" + driver.getTitle());
	    System.out.println("\n");
	    Thread.sleep(2000);
	   
	    // About us section
	    System.out.println("Main description of the about us:" + driver.findElement(By.xpath("//p[contains(text(),'andSons is a second-generation chocolatier formed ')]")).getText());
	    System.out.println("\n");
	    System.out.println("Sub description of the about us:" + driver.findElement(By.xpath("//p[contains(text(),'Building upon a Beverly Hills institution founded ')]")).getText());

	   
	   
	   
   }
}
