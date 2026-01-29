package TaskOfMileStone7;
import java.time.Duration;

import java.util.Properties;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;	
import org.testng.annotations.Test;

import BaseConfiguration.WebDriverChoosing;
import PageRepository.LoginPage;

public class LoginTest extends WebDriverChoosing {


	    @Test
	    public void verifyLogin() throws Exception {

	    	 Properties prop = new Properties();
	         prop.load(
	             getClass().getClassLoader()
	                       .getResourceAsStream("Data.properties"));

	       
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        
             Thread.sleep(10000);
             
	        driver.get(prop.getProperty("url"));
	        
	        Thread.sleep(10000);
	        
	        LoginPage login = new LoginPage(driver);
	        login.login(prop.getProperty("username"),
	                    prop.getProperty("password"));
	        
	        Thread.sleep(10000);
	        
	        Assert.assertTrue(login.isDashboardDisplayed(), "Login Failed");


	        driver.quit();
	    }
	}



