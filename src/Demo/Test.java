package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Add code in git");
		//Invoking browser
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		
		Thread.sleep(2000);
	//	driver.close();
	//	driver.quit();
		System.out.println("it's working fine");
		System.out.println("All Setup done");

	}

}
