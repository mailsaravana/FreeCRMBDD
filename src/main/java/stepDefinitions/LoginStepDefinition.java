package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class LoginStepDefinition {

WebDriver driver;
	
	
@Given("user is on login page")
public void user_is_on_login_page() {
	System.setProperty("webdriver.chrome.driver", "G:/selenium/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://ui.cogmento.com/");
		
}

@When("user enters username and password")
public void user_enters_username_and_password() {
 String title=driver.getTitle();
 System.out.println(title);
 Assert.assertEquals("Cogmento CRM", title);
	driver.findElement(By.name("email")).sendKeys("mailsaravana@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Intel125$");
}

@When("clicks on login button")
public void clicks_on_login_button() {
	driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {

	String Userr = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/span[1]")).getText();
	System.out.println(Userr);
	Assert.assertEquals( "Sara v", Userr);
	

			

	
}

	
}
