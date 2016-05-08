package timvroom;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class IPageChrome {
		protected static WebDriver driver;
		
		public IPageChrome(){
			System.setProperty("webdriver.chrome.driver", "/home/etxmsl/workspace/timvroom/chromedriver");
			if (driver == null){
			 driver=new ChromeDriver();
			}
		}

		
	    public static void killDriver(){
	    	if(driver != null){
	    		driver.close();
	    	}
	    	    	
	    }

	}

