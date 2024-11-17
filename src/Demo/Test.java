package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Add code in git");
		//Invoking browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Srinivas");
		driver.findElement(By.name("inputPassword")).sendKeys("Srinivas@123");
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Srinivas forgot password");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Srinivas@gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		driver.close();
		
		// Css Selector-
		//Class name -> tagname.classname
		// id -> tagname#id
		// tagname[attribute='value']
		//without plugin using $('Enter the css selector')
		
		// Xpath-
		//tagname[@attribute='value']

		// <input type="text" placeholder="Name">
		//input[@placeholder='Name']
		
		
		
		
		


	}

}
