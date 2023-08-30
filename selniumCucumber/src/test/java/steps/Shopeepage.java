package steps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shopeepage {
	WebDriver d;
	WebElement fas;
	
	@Given("user should navigate to the application")
	public void user_should_navigate_to_the_application() {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver64\\chromedriver-win64\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
	    
	}

	@Given("user moves cursor on Fashion")
	public void user_moves_cursor_on_Fashion() {
		
		fas=d.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]"));
		Actions a=new Actions(d);
		a.moveToElement(fas).build().perform();
	    
	   
	}

	@When("user clicks on Mens Kurthas")
	public void user_clicks_on_Mens_Kurthas() {
		
		Select c=new Select(fas);
		c.selectByVisibleText("Men's Kurtas");
	    
	   
	}

	@Then("Page should be opened")
	public void page_should_be_opened() {
		
		String txt=d.getTitle();
	    System.out.println(txt);
	   
	}

	@When("Page should Not be opened.")
	public void page_should_Not_be_opened() throws IOException {
	   
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("flkpage.png");
		FileHandler.copy(src, dest);
	   
	}

}
