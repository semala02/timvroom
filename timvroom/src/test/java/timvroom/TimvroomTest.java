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
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/etxmsl/workspace/timvroom/chromedriver");
		if (driver == null){
		 driver=new ChromeDriver();
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
	      driver.get("http://timvroom.com/selenium/playground/");
	      PageFactory.initElements(driver, this);
	}
	
	   @FindBy(id="answer1")
	   WebElement answer1Field;
	   String answer1;
	   @FindBy(id="answer4")
	   String answer4;
	   WebElement answer4Field;
	   @FindBy(id="answer6")
	   String answer6;
	   WebElement answer6Field;
	   @FindBy(id="answer8")
	   String answer8;
	   WebElement answer8Field;
	   String answer10;
	   @FindBy(id="answer10")
	   WebElement answer10Field;
       @FindBy(id="answer11")
       String answer11;
       WebElement answer11Field;
       @FindBy(id="answer13")
       String answer13;
       WebElement answer13Field;
       @FindBy(id="answer14")
       String answer14;
       WebElement answer14Field;
	   @FindBy(id="name")
	   String nameanswer;
	   WebElement nameField;
	   @FindBy(xpath="//a[@onclick='link_clicked();return false']")
	   WebElement link_clicked;
	   @FindBy(id="checkresults")
	   WebElement submitform;
	   
 @Test
 public void task1(){
	    WebElement titleelement = driver.findElement(By.tagName("title"));
	    String title = titleelement.getText();
	    answer1Field.sendKeys(title);
	    answer1=title;
	
 }
 @Test
 public void task2(){
	    nameField.sendKeys("Kilgore Trout");
	    nameanswer="Kilgore Trout";
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
	    answer4=blueboxstring;
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
	    answer6=classvalue;
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
	    answer8=valtosend;
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
	    answer10=redboxtext;
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
		    box="Green";}
	    else{
		    box="Orange";}
	    answer11Field.sendKeys(box);
	    System.out.println("Box: "+box);
	    answer11=box;
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
	     boolean found = driver.findElement(By.id("ishere")).isDisplayed();
	     //boolean found = ishere.isEnabled();
	     String result;
	     if (found){
	    	 result="yes";}
	     else{
	    	 result="no";}
	     System.out.println("id ishere found="+result);
	     answer13Field.sendKeys(result);
	     answer13=result;
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
	     answer14=result;
	     
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
	     String alerttext;
	     WebDriverWait wait2 = new WebDriverWait(driver, 5);
	     wait2.until(ExpectedConditions.alertIsPresent());
	     Alert alert = driver.switchTo().alert();
	     alerttext=alert.getText();
	     alert.accept();     
  }
  @Test
  public void task97_17() {
	     nameField.sendKeys(nameanswer);
	     answer1Field.sendKeys(answer1);
		    WebElement dropDownList = driver.findElement(By.id("occupation"));
		    new Select(dropDownList).selectByVisibleText("Science Fiction Author");

	     answer4Field.sendKeys(answer4);
	     answer6Field.sendKeys(answer6);
	     answer8Field.sendKeys(answer8);
		    WebElement radio=driver.findElement(By.xpath("//input[@value='wrotebook']"));
		    radio.click();
         answer11Field.sendKeys(answer11);
         answer13Field.sendKeys(answer13);
         answer14Field.sendKeys(answer14);
	     submitform.click();
  }
  
}