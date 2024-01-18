import java.util.ArrayList;
import java.util.Set;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowMultiple_Close_SpecificTab_6 {

	public static void main(String[] args) throws InterruptedException {
		 
		// A Program to close the Specific tab.
		
		 

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
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
		
		//  program to close the specific tab.
		for(String w:whs)
		{
			driver.switchTo().window(w);
			
			String str1 = driver.getTitle();
			System.out.println("The title is : "+str1);
			
			if(str1.contains("Online Web"))
			{
				System.out.println("The online web window is got closed");
				driver.close();
			}
		
			System.out.println("---------------------------------------------");
			
			
		}
		
		 
		
	}

}
