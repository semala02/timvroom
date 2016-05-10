package timvroom;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import timvroom.IPageChrome;
//import timvroom.StartPage;

public class TimvroomTest {

	protected static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String nameanswer;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/etxmsl/workspace/timvroom/chromedriver");
		if (driver == null){
		 driver=new ChromeDriver();
	     driver.get("http://timvroom.com/selenium/playground/");

		}

	}

	/*
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
    	if(driver != null){
    		driver.close();
    	}
	} */

	//@Test
	public TimvroomTest() {
		PageFactory.initElements(driver, this);
	}
	
	   @FindBy(id="answer1")
	   WebElement answer1Field;
	   @FindBy(id="answer4")
	   WebElement answer4Field;
	   @FindBy(id="answer6")
	   WebElement answer6Field;
	   @FindBy(id="answer8")
	   WebElement answer8Field;
	   @FindBy(id="answer10")
	   WebElement answer10Field;
       @FindBy(id="answer11")
       WebElement answer11Field;
       @FindBy(id="answer13")
       WebElement answer13Field;
       @FindBy(id="answer14")
       WebElement answer14Field; 
	   @FindBy(id="name")
	   WebElement nameField;
	   @FindBy(xpath="//a[@onclick='link_clicked();return false']")
	   WebElement link_clicked;
	   @FindBy(id="submitbutton")
	   WebElement submit;
	   @FindBy(id="checkresults")
	   WebElement checkresult;
	   
 @Test
 public void task1(){
	    String title = driver.getTitle();
	    //String title = titleelement.getText();
	    answer1Field.sendKeys(title);
	
 }
 @Test
 public void task2(){
	    nameanswer="Kilgore Trout";
	    nameField.sendKeys(nameanswer);
 }
 @Test
 public void task3(){
	    WebElement dropDownList = driver.findElement(By.id("occupation"));
	    new Select(dropDownList).selectByVisibleText("Science Fiction Author");
 }
 
 @Test
 public void task4(){
	    List<WebElement> listweb = driver.findElements(By.className("bluebox"));
	    int blueboxes=listweb.size();
	    String blueboxstring = Integer.toString(blueboxes);
	    answer4Field.sendKeys(blueboxstring);
	    System.out.println("Blueboxes="+blueboxes);
 }
 @Test
 public void task5(){
	    link_clicked.click();
 }

 @Test
 public void task6(){
	    WebElement redbox=driver.findElement(By.id("redbox"));
	    String classvalue = redbox.getAttribute("class");
	    answer6Field.sendKeys(classvalue);
	    System.out.println("Class="+classvalue);
 }
 @Test
 public void task7(){
	    js.executeScript("ran_this_js_function();");
 }
 @Test
 public void task8(){
	    Object val = js.executeScript("return got_return_from_js_function();");
	    System.out.println("got_return_from_js_function()="+val);
	    Long value = (Long)val;
	    String valtosend=value.toString();
	    answer8Field.sendKeys(valtosend);
	    //System.out.println("got_return_from_js_function()="+val);
 }
 
 @Test
 public void task9(){
	    WebElement radio=driver.findElement(By.xpath("//input[@value='wrotebook']"));
	    radio.click();
 }
 
 @Test
 public void task91_10(){
	    WebElement redbox=driver.findElement(By.id("redbox"));
	    String redboxtext = redbox.getText();
	    answer10Field.sendKeys(redboxtext);
	    System.out.println("Rexbox text="+redboxtext);
 }
 @Test
 public void task92_11(){
	    int greenbox;
	    int orangebox;
	    String box;
	    WebElement spanbox1 =driver.findElement(By.id("greenbox"));
	    WebElement spanbox2 =driver.findElement(By.id("orangebox"));
	    greenbox=spanbox1.getLocation().getY();
	    orangebox=spanbox2.getLocation().getY();
	    System.out.println("Greenbox location: "+greenbox);
	    System.out.println("Orangebox location: "+orangebox);
	    if (greenbox<orangebox){
		    box="green";}
	    else{
		    box="orange";}
	    answer11Field.sendKeys(box);
	    System.out.println("Box: "+box);
	    //answer11=box;
  }
  @Test
  public void task93_12(){
	     int height;
	     int width;
	     height=driver.manage().window().getSize().getHeight();
	     width=driver.manage().window().getSize().getWidth();
         System.out.println("Current width: "+width);
         driver.manage().window().setSize(new Dimension(850,650));
	     height=driver.manage().window().getSize().getHeight();
	     width=driver.manage().window().getSize().getWidth();
         System.out.println("Current width: "+width);
         System.out.println("Current height: "+height);

  }
  @Test
  public void task94_13(){
	     boolean found=false;
	     try{
	         found= driver.findElement(By.id("ishere")).isEnabled();
	     }catch(Exception e){
	    	 System.out.println("id ishere not found");
	     }
	     String result;
	     if (found){
	    	 result="yes";}
	     else{
	    	 result="no";}
	     System.out.println("id ishere found="+result);
	     answer13Field.sendKeys(result);
  }
  @Test
  public void task95_14(){
	     WebElement purplebox = driver.findElement(By.id("purplebox"));
	     boolean found = purplebox.isDisplayed();
	     String result;
	     if (found){
	    	 result="yes";}
	     else{
	    	 result="no";}
	     System.out.println("Purplebox displayed="+result);
	     answer14Field.sendKeys(result);
	     
  }
  @Test
  public void task96_15(){
	     WebElement clickgame1 = driver.findElement(By.linkText("click then wait"));
	     clickgame1.click();
	     WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("click after wait")));
	     wait.pollingEvery(100, TimeUnit.MILLISECONDS);
	     WebElement clickgame2 = driver.findElement(By.linkText("click after wait"));
	     clickgame2.click();
	     WebDriverWait wait2 = new WebDriverWait(driver, 5);
	     wait2.until(ExpectedConditions.alertIsPresent());
	     Alert alert = driver.switchTo().alert();
	     String alerttext=alert.getText();
	     alert.accept();  
	     System.out.println("Alerttext: "+alerttext);
  }
  @Test
  public void task97_17() {
	         submit.click();
		     checkresult.click();
  }
  
}