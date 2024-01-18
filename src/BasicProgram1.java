import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgram1 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to The Automation World");

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.onlinesbi.sbi/");
		
		//driver.get("https://www.facebook.com/");
		String title1 = driver.getTitle();
		System.out.println("The Title name is :"+ title1);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the Current  Url Is : "+currentUrl);
		System.out.println("========== ");
		//String psrc = driver.getPageSource();
		//System.out.println("The Page Source is : "+ psrc);
		
	/*	// to closse the window
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.onlinesbi.sbi/");
		System.out.println("The page title is : "+driver.getTitle());
		
		System.out.println("Now the screen will be Navigated Back to the initial screen--");
		driver.navigate().back();
		
		System.out.println("The Title of the Page is 2::  "+driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		System.out.println("The Title of the Page is 4::  "+driver.getTitle());
		
		driver.navigate().refresh();
		//driver.close();  */
	}

}
