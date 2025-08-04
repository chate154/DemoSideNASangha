package AllMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ObjectRepository.ObjectRepository;
import Operator.Operator;
public class AllMethod extends Operator{
	public AllMethod() {	
		
		PageFactory.initElements(driver, ObjectRepository.class);
	}
	
	public void fieldMenu(List<String> data) throws InterruptedException   {
		Thread.sleep(9000);
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(data.get(0));
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(data.get(1));
		/*JavascriptExecutor jexe = (JavascriptExecutor) driver;
	    jexe.executeScript("arguments[0].value='Admin'", ObjectRepository.TEXTUSERNAME);*/
		//enterText(ObjectRepository.TEXTUSERNAME, data.get(0));
		//enterText(ObjectRepository.TEXTPASSWORD, data.get(1));
		//System.out.println(ObjectRepository.TEXTUSERNAME);
		//enterText(ObjectRepository.TEXTUSERNAME, data.get(0));
		Operator.Jenter(ObjectRepository.TEXTUSERNAME,data.get(0));
		enterText(ObjectRepository.TEXTPASSWORD, data.get(1));
		Operator.Jenter(ObjectRepository.TEXTPASSWORD, data.get(1));
		 
		
		

			
		}
	public void btnClick(String v) throws InterruptedException
	{
		String x = "//input[@value='"+v+"']";
		//clickEle(driver.findElement(By.xpath(x)));
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath(x));
		js.executeScript("arguments[0].click();", ele);*/
		Operator.jCLick(driver.findElement(By.xpath(x)));
	}
	public void openMenu(String mnu) throws InterruptedException
	{
		String[] m = mnu.split("->");
		String xpath = null;
		for (int x=0;x<m.length;x++)
		{
			switch(x)
			{
			case 0:
				xpath = "//ul[@id='mainMenuFirstLevelUnorderedList']//child::a[contains(@id,'"+m[0]+"')]";
				clickEle(driver.findElement(By.xpath(xpath)));
				break;
			case 1:
				xpath = "//ul[@id='mainMenuFirstLevelUnorderedList']//child::a[contains(@id,'"+m[1]+"')]";
				clickEle(driver.findElement(By.xpath(xpath)));
				break;
			case 2:
				xpath = "//ul[@id='mainMenuFirstLevelUnorderedList']//child::a[contains(@id,'"+m[2]+"')]";
				clickEle(driver.findElement(By.xpath(xpath)));
				break;
			}
		}
	}

}
