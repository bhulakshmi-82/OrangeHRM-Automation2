package PageRepository;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.support.FindBy;	
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class LoginPage {

	    WebDriver driver;

	    @FindBy(name = "username")
	    private WebElement username;

	    @FindBy(name = "password")
	    private WebElement password;

	    @FindBy(xpath = "//button[@type='submit']")
	    private WebElement loginBtn;
	    
	   

	    public boolean isDashboardDisplayed() 
	    {
	        return dashboardHeader.isDisplayed();
	    }
	    @FindBy(xpath = "//h6[text()='Dashboard']")
	    private WebElement dashboardHeader;


	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    public boolean isDashboardDisplayed1() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.visibilityOf(dashboardHeader));
	        return dashboardHeader.isDisplayed();
	    

	    }
	    public void login(String user, String pass) {
	        username.sendKeys(user);
	        password.sendKeys(pass);
	        loginBtn.click();
	    }


		
	}

	
