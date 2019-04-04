package Animations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homepage 
{

	public static void main(String[] args) throws InterruptedException, IOException
	
	{
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Homepage home = new Homepage();
        home.homeanimations(driver); 


	}

	public void homeanimations(WebDriver driver) throws InterruptedException, IOException
	{
		
		driver.get("https://andsons-v3.myshopify.com/");
		driver.manage().window().maximize();
		System.out.println("Homepage URL:" +  driver.getCurrentUrl());
		System.out.println("Homepage Title:" + driver.getTitle());
		System.out.println("\n");
		
		Actions a = new Actions(driver);
		
		// main title page the page
		System.out.println("Title of the page:" + driver.findElement(By.xpath("//h1[@class='title']")).getText());
		System.out.println("\n");
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		// Description of the About US
		System.out.println("Description of the About us:" + driver.findElement(By.xpath("//div[@class='container text-center about-section']")).getText());
		System.out.println("\n");
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		// Description of the shop our product 
		System.out.println("Description of the Shop our product:" + driver.findElement(By.cssSelector("div:nth-child(3) section.sc-chPdSV.jnPqls section.sc-kpOJdX.knGXHw div.container.text-center > p.sc-htpNat.hytByw:nth-child(2)")).getText());
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		
		// Animation effect for the first chocolates
		a.moveToElement(driver.findElement(By.xpath("//a[@href='/collections/chocolate-box']//img[@class='inner-box']"))).build().perform();
		Thread.sleep(1000);
		 
		// Taking the screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\cholatesBox Screenshot.png"));
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		// Animation effect for the Second chocolates
		a.moveToElement(driver.findElement(By.xpath("//a[@href='/collections/gift-collection']//img[@class='inner-box']"))).build().perform();
		Thread.sleep(1000);
		 
		// Taking the screenshot
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("F:\\giftCollection Screenshot.png"));
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		// Animation effect for the third chocolates
		a.moveToElement(driver.findElement(By.xpath("//a[@href='/collections/party-favors']//img[@class='inner-box']"))).build().perform();
		Thread.sleep(1000);
			 
		// Taking the screenshot
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("F:\\Party Favour Screenshot.png"));
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		// Our process section
		System.out.println("\n"); 
		System.out.println("Our process text: " + driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-12 ourprocess-content']//div[@class='text-center']")).getText());
		
			
		
	}
	
}
