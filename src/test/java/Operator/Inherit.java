package Operator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/*public class Inherit{
	public static WebDriver driver;
	
	@Before
	public void lauchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean result = driver.findElement(By.xpath("//input[@value='m']")).isSelected();
		if (result)
		{
			System.out.println("element is selected");
		}
		else if (!result)
		{
				
				driver.findElement(By.xpath("//input[@value='m']")).click();
		}
	}
	@After

	public void closeBrowser() {
		driver.quit();
	}
	public static void Name() {
		System.out.println("-----------");
	}

}
*/