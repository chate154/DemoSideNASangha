package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Operator.Operator;



public class ObjectRepository extends Operator {
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-content']")
	public static WebElement menuList;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtUsername']")
	public static WebElement TEXTUSERNAME;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
	public static WebElement TEXTPASSWORD;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='react-autosuggest__suggestions-list']")
	public static WebElement menuItemListOrangeHrm;

}
