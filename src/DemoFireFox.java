import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFox {
	
	public static void main(String [] args)
	{
		String key="webdriver.gecko.driver";
		String value="./driver/geckodriver.exe";
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		//driver1.get("https://github.com/mozilla/geckodriver/releases");
		driver1.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver1.close();
	}

}
