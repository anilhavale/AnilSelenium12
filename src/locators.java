import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("anil");
		driver.findElement(By.name("inputPassword")).sendKeys("1234anil");
		driver.findElement(By.className("signInBtn")).click();
		String errMsg = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("The Error Message is : "+errMsg);
		
	//	driver.findElement(By.xpath("//p[@class='error']")).getText();
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Anil1234");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("anilhavale.4@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9591177932");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).clear();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9591177932");
		
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		Thread.sleep(2000);
		//System.out.println("The Erro message is : "+ driver.findElement(By.cssSelector(".infoMsg")).getText());
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Anil");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//driver.findElement(By.className("submit signInBtn")).click();
		
		System.out.println(" Page title=="+ driver.getTitle());
		
		Thread.sleep(8000);
		driver.close();
		

	}

}
