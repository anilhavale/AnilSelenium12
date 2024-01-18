import java.util.ArrayList;
import java.util.Set;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowMultiple_CloseParentWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// program to close the Parent Window and get title only for the second window.
		
		System.out.println("Welcome to The Automation World");

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	 
		// 1. navigate to the url
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.manage().window().maximize();
		String pwh = driver.getWindowHandle();
		
		//2. Get the current window's handle and write to the console window. It must be first window handle.
		System.out.println("The Current Window Handle Address : "+ driver.getWindowHandle()+ "\n");
		
		
		// switch to iframe result as the All Elements are located in this frame.
		driver.switchTo().frame("iframeResult");
		
		//3. Locate the Link and find it and click it.
		WebElement visitLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
		visitLink.click();
		
		//4. Get all the Window Handles and get them in a list
		Set<String> whs = driver.getWindowHandles();
		 
		ArrayList whs_List = new ArrayList<>(whs);
		
		//5) Write to total window handle number to the console.
		System.out.println("Total window number is : "+whs_List.size());
		//System.out.println(whs_List);
		
		
		System.out.println("==================================================================================");
		
		// Designed to close the Parent window handle and get only the second window title
		for(String w:whs)
		{
			driver.switchTo().window(w);
			
			if(pwh.equals(w))
			{
				driver.close();
				
			}
			
			else
			{
				String title=driver.getTitle();
				System.out.println("The title of the second page : "+ title);
			}
			 
		
			System.out.println("---------------------------------------------");
			
			
		}
		
		 
		
	}

}
