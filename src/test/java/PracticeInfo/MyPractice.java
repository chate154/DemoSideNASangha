package PracticeInfo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import ObjectRepository.ObjectRepository;
import Operator.Operator;
import StepDefination.StepDefination;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyPractice  {
	public static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	NumberMethod();
	

}
public static void m() {
	for (int x=0;x<10;x++)
	{
		if (x==7)
		{
			continue;
			
		}
		System.out.println(x);
	}
}
public static void ListArray() {
	List<String> list = new ArrayList<String>();
	list.add("all");
	list.add("mi");
	list.add("ras");
	list.add("pa");
	System.out.println(list.size());
	for (String v:list)
	{
		System.out.println(v);
	}
	for (int x=0;x<list.size();x++)
	{
		System.out.println(list.get(x));
	}
}
public static void NumberMethod() {
	String a = "Applicant,Beneficary,Advising,opeining";
	String[] h= a.split(",");
	for (int x=0;x<=h.length-1;x++)
	{
		switch(x) {
		case 0:
			System.out.println("Applicant click");
			break;
		case 1:
			System.out.println("beneficary click");
			break;
		case 2:
			System.out.println("Advising click");
			break;
		case 3:
			System.out.println("opeining click");
			break;
			
		}
	/*if (h[x].equals("Applicant"))
	{
		System.out.println("Applicant click");
		//System.out.println(h[x]);
	}
	else if(h[x].equals("Beneficary"))	
	{
		System.out.println("beneficary click");
	}
	else if(h[x].equals("Advising"))	
	{
		System.out.println("Advising click");
	}
	else if(h[x].equals("opeining"))	
	{
		System.out.println("opeining click");
	}*/
	
		
		for (int j=0;j<1;j++)
		{
			System.out.println("Select Applicant");
			System.out.println("enter a customerID");
			System.out.println("Select customerID");
			System.out.println("Select language");
			
		}
	
	}
	System.out.println("click on save");
	System.out.println("click on verify");
}
public static void h() {
	int a=10,b=20;
	do
	{
		System.out.println("hello");
	}while(false);
	System.out.println("hii");
		
}
public static void newMethodArray() {
	int[][] x = {{10,20,30},{40,50}};
	for(int a=0;a<x.length;a++)
	{
		for (int b=0;b<x[a].length;b++)
		{
		System.out.println(x[a][b]);	
		}
	}
}
public static void newImplement()
{
	WebElement ele = null;
	String str = "Admin->Job->Job Title";
	String[] arr = str.split("->");
	String xpath = null;
	
	for(int x=0;x<=arr.length-1;x++)
	{
		switch(x)
		{
		case 0:
			xpath = arr[0];
			System.out.println("0");
			break;
		case 1:
			xpath = arr[1];
			System.out.println("1");
			break;
		case 2:
			xpath = arr[2];
			System.out.println("2");
			break;
			
		}
		
	}
}
public static void method2() {
	int x=10;
	if(x==20)
	{
	int y=10;	
	}
	
		
		
	
	else
	{
		System.out.println("false");
	}
}
public static void addMethod() {
	int a= 2;
	for (int x=0;x<3;x++)
	{
		System.out.println("click on verify Icn");
		if (a==2)
		{
			System.out.println("click element visible]");
			break;
			
		}
	}
}
public static void newMethod() {
	int a,b,c,d;
	a=b=c=d=20;
	System.out.println(a+".."+b+".."+c+".."+d);
	int p=20;
	   p+=10;
	   System.out.println(p);
	   //replaceAll("\\s+","") 
	   String x = " rahul radha";
	  String s =  x.replaceAll("\\s+","") ;
	  System.out.println(s);
}
public static void newMethod1() {
	
	  
     System.out.println(m1(1)+m1(2)*m1(3)+m1(10)/2+m1(12));
     // 1+2*3+10/2+12
     //1+6+10/2+12
     //1+6+5+12
     //24
}
public static int m1(int  i)
{
	System.out.println(i);
	return i;
	
}
public static void myMethod() {
	int a=2;
	for (int x=0;x<2;x++)
	{
		System.out.println("verify");
		if (a==2)
		{
			String str= "Arrow,Arrow2";
			String[] s = str.split(",");
			for (int j=1;j<s.length;j++)
			{
				System.out.println("size1");
				System.out.println("size2");
			}
			
		}
	}
}
public static void methodOveriiding () {
	
	
}
public static void methodOveriiding (String name) {
}
public static void methodOveriiding (int name) {
}




public static WebDriver lauchBrowser() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
    //here "--start-maximized" argument is responsible to maximize chrome browser
     co.addArguments("--start-maximized");
	driver = new ChromeDriver(co);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
	/*WebDriverWait wait = new WebDriverWait(driver, 9000);*/
	/*
	 * Flights
Hotels 
Villas & Apts
Holiday Packages
Trains
Buses
Cabs
Visa
Charter Flights
Activitie
	 *//*
	List<WebElement> e = driver.findElements(By.xpath("//ul[@class='makeFlex font12']//child::li"));
	System.out.println(e.size());
	WebElement element;
	for(int x=0;x<e.size();x++) {
		element = e.get(x);
		System.out.println(element.getText().substring(0, 6).length()==6);
		System.out.println("length verified\n"+ element.getText().substring(0, 6));
		String ele = element.getText();
		boolean text = ele.contains("Charter Flighting");
		if (text)
		{
			System.out.println("Element is Flights "+text);
			
		}
		else
		{
			System.out.println("not match");
		}
		
	}
	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='makeFlex font12']")));
	List<WebElement> list = ele.findElements(By.tagName("li"));
	System.out.println(list.size());
	WebElement Ele;
	for (int x=0;x<list.size();x++)
	{
		Ele=list.get(x);
		if (Ele.getText().contains("Charter Flights"))
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("arguments[0].click();", Ele);	
		}
		
	}
	*/
	/*for (WebElement v:list)
	{
		if (v.getText().contains("Charter Flights")) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click();", v);
		}
	}*/
	
	// Make My Trip
/*  try {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].click();", driver.findElement(By.xpath("//label[@for='fromCity']")));
	}catch(ScriptTimeoutException e) 
	{
		System.out.println("exception Handled " +e.getMessage());
	}
	driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest')]")).sendKeys("Mumbai");
	//String text = driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest')]"));
	//System.out.println(text);
	Thread.sleep(7000);
	try {
	WebDriverWait w = new WebDriverWait(driver, 9000);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='react-autosuggest__suggestions-list']")));
	List<WebElement> g = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
	for (WebElement list:g)
	{
		//xpath: //ul[@class='react-autosuggest__suggestions-list']
		String[] data =list.toString().split("->");
		System.out.println(data[1].replaceAll("]]", "]").substring(8));
		if (list.getText().equalsIgnoreCase("Mumbai, India")){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("arguments[0].click();", list);
			Thread.sleep(9000);
		}
	}
	}catch(Exception e) {
		System.out.println("Handles");*/
	//}
	
	/*WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@id='react-autowhatever-1']"))));
	List<WebElement> element = ele.findElements(By.tagName("p"));
	try {
	for (WebElement list:element)
	{
		
		if(list.get Text().contains("Hyderabad, India"))
		{
			JavascriptExecutor js1 = (JavascriptExecutor)driver;
			js1.executeAsyncScript("arguments[0].click();", list);
		break;
		}
	}
	}
	catch(Exception e) {
		System.out.println("Exception Handled "+ e.getMessage());
	}*/
	
	
	return driver;

}


public static void takeS() throws IOException {
	try {
	DateFormat format = new SimpleDateFormat("dd_MMM_YY");
	Date dateobj = new Date();
	String strDirname = format.format(dateobj);
	dateobj = new Date();
	format = new SimpleDateFormat("HH_mm_ss");
	String f = format.format(dateobj)+".jpeg";
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File ("C:\\Users\\Firstcry\\eclipse-workspace\\Everything\\Screenshots"+strDirname+"\\"+f));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
	
	public static void Close() {
		driver.quit();
	}
	public static void GenericMethod(String value) throws InterruptedException
	{
		//ul[@class='navbarul']//child::a[text()='NEWS']
		String xpa = "//ul[@class='navbarul']//child::a[text()='"+value+"']";
		//Operator.clickEle(driver.findElement(By.xpath(xpa)));
		
		
	}
	
	
	
	/*boolean result = driver.findElement(By.xpath("//input[@value='m']")).isSelected();*/
	/*if (result)
	{
		System.out.println("element is selected");
	}
	else if (!result)
	{
			
			driver.findElement(By.xpath("//input[@value='m']")).click();
	}*/

public static void enterUser()
{
	
	List<WebElement> val = driver.findElements(By.xpath("//div[@class='cell topicons']"));
	WebElement v;
	for (int x=0;x<val.size();x++)
	{
		v=val.get(x);
		System.out.println(v.getText());
	}
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("0aU@d6VSQy");
	boolean result = driver.findElement(By.xpath("//input[@id='btnLogin']")).isEnabled();
	if (result)
	{
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	else
	{
		System.out.println("not clicable");
	}
	
}
public static void openM(String menu) throws InterruptedException {
	Thread.sleep(10);
	//String m = "Admin->User Management->Users";
	//String[] m= {"Admin","User Management","Users"};
	//String[] list = m.split("->");
	String[] list = menu.split("=>");
	System.out.println(list);
	String xpath = null;
	for (int x=0;x<=list.length;x++)
	{
		/*switch(x)
		{
		case 0:
			/////ul[@id='mainMenuFirstLevelUnorderedList'] //child::a[contains(@id,'Admin')]
			//div[@id='menu-content']//child::li[contains(@id,'admin') and @class='level1 admin no-padding parent']
			//path = "ul[@id='mainMenuFirstLevelUnorderedList'] //child::a[contains(@id,'"+list[0]+"')]";
			path = "div[@id='menu-content']//child::li[contains(@id,'"+list[0]+"') and @class='level1 admin no-padding parent']";
				clickEle(ObjectRepository.menuList.findElement(By.xpath(path)));
				break;	
			
			
		case 1:
			//path = "//ul[@id='mainMenuFirstLevelUnorderedList']//child::a[text()='"+list[1]+"']";
			path="//div[@id='menu-content']//child::li[contains(@id,'"+list[1]+"') and @class='level2 no-padding parent active']";
			clickEle(ObjectRepository.menuList.findElement(By.xpath(path)));
			break;
		case 2:
			//path = "//ul[@id='mainMenuFirstLevelUnorderedList']//child::a[text()='"+list[2]+"']";
			path = "//span[text()='"+list[2]+"']";
			clickEle(ObjectRepository.menuList.findElement(By.xpath(path)));
			break;*/
		switch (x) 
		{
		case 0:
			//xpath = "//*[contains(@id,'"+list[0]+"') and contains(@class,'level1')]";
			xpath = "//div[@id='menu-content']//child::span[text()='"+list[0]+"']";
			//clickEle(ObjectRepository.menuList.findElement(By.xpath(xpath)));
			//driver.findElement(By.xpath(xpath)).click();
			//Operator.clickEle(driver.findElement(By.xpath(xpath)));
			break;
		case 1:
			//xpath = "//*[contains(@id,'"+list[1].replaceAll("\\s+","")+"') and contains(@class,'level2')]";
			xpath = "//div[@id='menu-content']//child::span[text()='"+list[1]+"']";
			//clickEle(ObjectRepository.menuList.findElement(By.xpath(xpath)));
			//driver.findElement(By.xpath(xpath)).click();
			//Operator.clickEle(driver.findElement(By.xpath(xpath)));
			break;
		case 2:
			//xpath = "//*[text()='"+list[2]+"']";
			xpath = "//div[@id='menu-content']//child::span[text()='"+list[2]+"']";
			//clickEle(ObjectRepository.menuList.findElement(By.xpath(xpath)));
			//driver.findElement(By.xpath(xpath)).click();
			//Operator.clickEle(driver.findElement(By.xpath(xpath)));
			
			break;
		}
		
	}
	
	
//	boolean res = driver.findElement(By.xpath("//input[@id='hide-textbox']")).isDisplayed();
//	if (res)
//	{
//		System.out.println("selected");
//		
//	}
//	else if(!res)
//	{
//		System.out.println("Selected chkbox");
//	}
//	else
//	{
//		System.out.println("close");
//	}
	// ittrate list in webelement
	
	/*List<WebElement> v = driver.findElements(By.xpath("//select[@name='DOB_Day1b1b0dbe']//parent::select"));
	//List<WebElement> v = driver.findElements(By.tagName("img"));
	WebElement q;
	for (int x=0;x<v.size();x++)
	{
		q=v.get(x);
		System.out.println(q.getText());*/
		
	}
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	
	public static void NewProgram() {
		String s= "DD//MMMM//YYYY";
		String[] a =s.split("//");
		for (int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
			
		}
		try
		{
			
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void MyF() {
		//not excuate
		String s = "rohan";
		String n = "mona";
		int a = 20,b=30;
			
			
		
		//int x = 10,y=20,c=70;
		// excuate first below
		
		System.out.println(s+a+b+n);///rohan 20 30 mona//mona
		System.out.println(n+b+s+a);//mona 30 rohan 20
		System.out.println(a+b+n+s);//50 mona rohan
		System.out.println(b+a+n+s);//50 mona rohan
		
		
	}
}





