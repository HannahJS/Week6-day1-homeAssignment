package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CucumberHomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 1. Login to https://login.salesforce.com
 2. Click on toggle menu button from the left corner
 3. Click view All and click Sales from App Launcher
 4. Click on Accounts tab
 5. Click on New button
 6. Enter 'your name' as account name
 7. Select Ownership as Public
 8. Click save and verify Account name 
 * 
 * 
 */
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*****************CREDENTIALS TO USE***************************
		 * Load Url :https://login.salesforce.com/?locale=in
           Enter username:dilip@testleaf.com
           Enter password:testleaf@2024

		 **************1. Login to https://login.salesforce.com*************************************/
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testleaf@2024");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		/**************2. Click on toggle menu button from the left corner*************************************/
		driver.findElement(By.xpath("//button[contains (@class,'slds-button slds-context-bar__button slds-icon-waffle_container slds-show')]")).click();
		
		
		
		/**************3. Click view All and click Sales from App Launcher*************************************/
		driver.findElement(By.xpath("//button[contains(@aria-label,'View All Applications')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Manage your sales process with accounts, leads, opportunities, and more')]")).click();
		
		
		
		/************** 4. Click on Accounts tab*************************************/
		driver.findElement(By.xpath("(//span[contains(text(),'Accounts')])/parent::a[@title='Accounts']")).click();
		
	}
	
	

}
