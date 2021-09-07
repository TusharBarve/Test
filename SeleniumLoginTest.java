package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Velocity\\Setup File\\ChromeDriver93_SeleniumFile\\chromedriver_win32\\chromedriver.exe" );
		SeleniumLoginTest ob1 =new SeleniumLoginTest();
		ob1.successfulTest();  // Here is the calling of valid input method.
		
		// I have commented out other invalid inputs method so to called them just remove //.
		
		// ob1.unsuccessfulTest1();
		// ob1.unsuccessfulTest2();
		// ob1.unsuccessfulTest3();
		// ob1.unsuccessfulTest4();
	}
	// The first method is for valid inputs.
	public void successfulTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://platformrc.wyscout.com/app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("login_username")).sendKeys("tushar1630@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login_password")).sendKeys("pw_IndiaTest!");
		Thread.sleep(3000);
		driver.findElement(By.id("login_button")).click();
		
	}
	// This is second method with Valid Username and Innvalid Password
	public void unsuccessfulTest1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://platformrc.wyscout.com/app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("login_username")).sendKeys("tushar16300@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login_password")).sendKeys("pw_IndiaTest#");
		Thread.sleep(3000);
		driver.findElement(By.id("login_button")).click();
	}
	// This is third method with InValid UserName and Valid Password
	public void unsuccessfulTest2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://platformrc.wyscout.com/app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("login_username")).sendKeys("tushar163@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login_password")).sendKeys("pw_IndiaTest!");
		Thread.sleep(3000);
		driver.findElement(By.id("login_button")).click();

	}
	// This is fourth method with InValid Username and Innvalid Password
	public void unsuccessfulTest3() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://platformrc.wyscout.com/app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("login_username")).sendKeys("tushar1630@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login_password")).sendKeys("pw_IndiaTest#@");
		Thread.sleep(3000);
		driver.findElement(By.id("login_button")).click();
	}
	// This is fifth method with Blank Username and Blank Password
	public void unsuccessfulTest4() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://platformrc.wyscout.com/app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("login_username")).sendKeys(" ");
		Thread.sleep(2000);
		driver.findElement(By.id("login_password")).sendKeys(" ");
		Thread.sleep(3000);
		driver.findElement(By.id("login_button")).click();
	}
	
}
