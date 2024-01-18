import java.util.ArrayList;
import java.util.Set;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowBC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to The Automation World");

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	 
		// 1. navigate to the url
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.manage().window().maximize();
		
		//2. Get the current window's handle and write to the console window. It must be first window handle.
		System.out.println("The Current Window Handle Address : "+ driver.getWindowHandle()+ "\n");
		
		
		// switch to iframe result as the All Elements are located in this frame.
		driver.switchTo().frame("iframeResult");
		
		//3. Locate the Link and find it and click it.
		WebElement visitLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
		visitLink.click();
		
		//4. Get all the Window Handles and get them in a list
		Set<String> whs = driver.getWindowHandles();
		//int size_whs=whs.size();
		//System.out.println("the count of the whs is : "+ size_whs);
		
		ArrayList whs_List = new ArrayList<>(whs);
		
		//5) Write to total window handle number to the console.
		System.out.println("Total window number is : "+whs_List.size());
		//System.out.println(whs_List);
		
		
		//6. switch to the second window 
		driver.switchTo().window((String) whs_List.get(1));
		
		 //7) Get the current window's handle and write to the console window. It must be second window handle
		System.out.println("The Current Window Handle is : "+driver.getWindowHandle());
		System.out.println("The title Of the  Window Handle is : "+driver.getTitle());
		 
		//8) Check the upper left side logo
       // WebElement logo = driver.findElement(By.cssSelector(".fa.fa-logo"));
        //Assertions.assertTrue(logo.isDisplayed());

		//9) Go Back (Switch) to the first window.
		driver.switchTo().window((String) whs_List.get(0));
		
		//10. Get the current window handles and write to the console window. It must be the First Window Handle.
		System.out.println("The Current Window Handle is : "+ driver.getWindowHandle());
		System.out.println("The Title of the Window Handle is : "+driver.getTitle());
		
		//11) Check the Run Button Text
        //WebElement seeResultButton = driver.findElement(By.cssSelector("button[onclick*='submitTryit(1)'"));
        //Assertions.assertTrue(seeResultButton.getText().contains("Run ❯"));
		
		Thread.sleep(5000);
		
		driver.quit();
		
		 
		
	}

}
