package timvroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends IPageChrome{
	   public StartPage(){
		      driver.get("http://timvroom.com/selenium/playground/");
		      PageFactory.initElements(driver, this);

	   }
	   
	   @FindBy(id="answer1")
	   WebElement answer1Field;
	   @FindBy(xpath="//*[@id='answer2']")
	   WebElement answer2Field;
	   public boolean waitForElementPresent(String element){
	    	boolean present = false;
	    	present=driver.findElement(By.className(element)).isDisplayed();
	    	return present;
	    }
       public void clickonlink(String link){
    	    driver.findElement(By.linkText(link)).click();
       }
       
}

