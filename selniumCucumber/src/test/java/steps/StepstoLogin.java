package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepstoLogin {
 WebDriver d;
	
	
	@Given("user should navigate to the application")
	public void user_should_navigate_to_the_application() {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver64\\chromedriver-win64\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://bookcart.azurewebsites.net/login");
		
	 
	   
	}

	@Given("user clicks on the Login link")
	public void user_clicks_on_the_Login_link() {
	  d.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]")).click();  
	   
	}

	@Given("user enters the username {string}")
	public void user_enters_the_username(String string) {
		d.findElement(By.id("mat-input-0")).sendKeys("ortoni");
	    
	   
	}

	@Given("user enters the password {string}")
	public void user_enters_the_password(String string) {
		d.findElement(By.id("mat-input-1")).sendKeys("admin123");
	    
	   
	}

	@When("user clicks the Login button")
	public void user_clicks_the_Login_button() {
		d.findElement(By.cssSelector("button[color='primary']")).click();
	    
	   
	}

	@Then("Login should be sucessful.")
	public void login_should_be_sucessful() {
	    
	 WebElement ele=d.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[3]"));
           String txt=ele.getText();
           System.out.println(txt);
	}

	@When("Login should be Unsucessful.")
	public void login_should_be_Unsucessful() {
		System.out.println("INCORRECT DETAILS");
	    
	   
	}
}
