package Operator;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PracticeInfo.MyPractice;





public class Operator extends MyPractice  {
	int[] a= {3,6,9,1};

	
public static void main(String[] args) throws InterruptedException {
	try {
		add1();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void array() {
	
	System.out.println();
	
}
public static void clickWeb(WebElement ele,int time) {
	ele.click();
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(time, TimeUnit.SECONDS);
}

public static void new1() {
	clickWeb(driver.findElement(By.xpath("")), 789);
	  SortedSet set = new TreeSet();   
      // Add the elements in the given set.  
      set.add("A");  
      set.add("B");  
      set.add("C");  
      set.add("D");  
      System.out.println(set.toString());
      for (Object v:set) {
    	  System.out.println(v);
    	  
      }
}
     

public static void enterText(WebElement web,String s)
{
	web.sendKeys(s);
}
public static void add1() throws InterruptedException, AWTException {
	launchBrowser("chrome","https://www.youtube.com/watch?v=Ogo_t1c-TN4");
	/*try {
	int a=2;
	int b=0;
	int c=a/b;
	System.out.println(c);
	}
	
	catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("continue 2");
	}
	Alert al = driver.switchTo().alert();
	al.sendKeys("");
	al.accept();*/
	// throws && throw
	//declare exception at method level
	//public void check() throws interrupted Exception(){
	//thread.sleep(50);
	//throw new ExcdName();
//	String s = "this is a demo";
//	System.out.println(s.length());
//	System.out.println(s.replaceAll("is", " ").length());
//String s = "this,is,demo";
//String[] d = s.split(",");
//System.out.println(d.length);
//for (String v:d) {
//	System.out.println(v.length());
//}
//	String s = "this,is,demo";
//	String[] d = s.split(",");
//	for (int x=0;x<1;x++) {
//		System.out.println(d[x].length());
//	}
//	for (int x=1;x<2;x++) {
//		System.out.println(d[x].length());
//	}
//	for (int x=2;x<3;x++) {
//		System.out.println(d[x].length());
//	}
//	String[] s = {"ram","Radha","ram","Mohan"};
//	for (int x=0;x<s.length-1;x++) {
//		for (int j=x+1;j<s.length-1;j++) {
//			if (s[x]==s[j]) {
//				System.out.println(s[x]);
//			}
//		}
//	}
 /*  int rem,sum=0,temp;
   int n=151;
   temp=n;
   while (n>0) {
	   rem=n%10;
	   sum=(sum*10)+rem;
	   n=n/10;
   }
   if (temp==sum) {
	   // 1. n = 151 rem = 1 sum= 1 n= 15
	   //2. n=15 rem = 5;sum = 15; n = 1
	   // 3. n=1 rem = 1; sum = 151 ; n=0
	   System.out.println("yes");
   }else {
	   System.out.println("no");
   }*/
	//launchBrowser("chrome", "https://www.google.com/");
	
}
public static void h() {
	String t= "this is a demo"; 
	// 14-11 = 3 o/p
	System.out.println(t.length()-t.replaceAll(" ", "").length());
}
public static void handleSpoinner(WebElement ele,String object,int time) {
	WebDriverWait wait = new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.visibilityOf(ele));
	
}
public static void jCLick(WebElement ele) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", ele);
	
}
public static void Jenter(WebElement ele ,String val) {
	JavascriptExecutor jse = ((JavascriptExecutor)driver);
	jse. executeScript("arguments[0].value='"+val+"';",ele);
}

public static WebDriver launchBrowser(String browser,String url) throws InterruptedException, AWTException
{
	
	switch(browser.toUpperCase())
	{
	case "CHROME":
		System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		System.out.print("A");
		option.addArguments("--start-maximized");
		option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		driver = new ChromeDriver(option);
		driver.get(url);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T); 
        driver.get(url);
		return driver;
		
		
	case "FIREFOX":
	    System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
	    driver = new FirefoxDriver();
	    Toolkit toolkit1 = Toolkit.getDefaultToolkit();
	    Dimension screenResolution = new Dimension((int) 
        toolkit1.getScreenSize().getWidth(), (int) 
        toolkit1.getScreenSize().getHeight());
	    driver.manage().window().setSize(screenResolution);
	    driver.get(url);
	    break;
	    
	    
	case "INTERNET":
	    System.setProperty("webdriver.ie.driver","src/test/resources/Driver/IEDriverServer.exe");
	    DesiredCapabilities dc = new  DesiredCapabilities();
        dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    driver = new InternetExplorerDriver(dc);
	    Toolkit toolkit = Toolkit.getDefaultToolkit();
        int Width = (int) toolkit.getScreenSize().getWidth();
        int Height = (int)toolkit.getScreenSize().getHeight();
        driver.manage().window().setSize(new Dimension(Width,Height));
	    driver.get(url);
	    break;
	
	case "EDGE":
	    System.setProperty("webdriver.edge.driver","src/test/resources/Driver/msedgedriver.exe");
	    /*ChromeOptions obj = new ChromeOptions();
	    obj.addArguments("--ignore-certificate-errors");*/
	    driver = new EdgeDriver();
	    Toolkit tool = Toolkit.getDefaultToolkit();
        int Width1 = (int) tool.getScreenSize().getWidth();
        int Height1 = (int)tool.getScreenSize().getHeight();
        driver.manage().window().setSize(new Dimension(Width1,Height1));
	    driver.get(url);
	    break;
	default:
		System.out.println("Expression not match");
		break;
	    
}
	return driver;
}

public static void clickEle(WebElement ele) throws InterruptedException {
ele.click();
	}
class b{
	
}
public static void a() throws InterruptedException {
	try {
		launchBrowser("chrome", "https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
class c extends b{
	public void a() {
		
		
	}
}

	 

/*public static void clickEle(WebElement ele) throws InterruptedException {
ele.click();
	}

public void closeB() {
	System.out.println(" ");
*/

public static void newMethod() {
	/*for (int x=0;x<=10;x++)
	{
		if (x==5)
		{
			break;
		}
		System.out.println(x);
		break;
	*/
	
	for (int y=0;y<=10;y++)
	{
		if(y==5)
		{
			continue;
		}
		System.out.println(y);
		
	}
}

	public static void add()
	{
	String [] party = {"Applicant","Ben","Open","Adv"};
	for (int x=0;x<party.length;x++)
	{
		if (party[x].equalsIgnoreCase("Ben")) 
		{
		
			continue;
		}
		System.out.println(party[x]);
	}
	
	
	
	
	}
	
	
public static List<WebElement> h(WebElement ele) {
	List<WebElement> h =driver.findElements((By) ele);
	return h;
}
	public static void click(WebElement ele)
	{
		ele.click();
		
	}
	// a
	//b
	//o
	//adv

	
}