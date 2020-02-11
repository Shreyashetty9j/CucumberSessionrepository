package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDef {
	WebDriver driver=null;
	@Given("^the registration page is opened$")
	public void the_registration_page_is_opened()  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Register")).click();
	}

	@When("^user enters Shreya as Fisrt name$")
	public void user_enters_Shreya_as_Fisrt_name() {
		 driver.findElement(By.name("FirstName")).sendKeys("Shreya");
	}

	@When("^user enters Shetty as Last name$")
	public void user_enters_Shetty_as_Last_name()  {
		  driver.findElement(By.name("LastName")).sendKeys("Shetty");
	}

	@When("^user enters shreyashetty(\\d+)j@gmail\\.com as Email$")
	public void user_enters_shreyashetty_j_gmail_com_as_Email(int arg1) {
		driver.findElement(By.id("Email")).sendKeys("shreyashetty9j@gmail.com");
	}

	@When("^user enters shreya(\\d+)\\* as Password$")
	public void user_enters_shreya_as_Password(int arg1)  {
		 driver.findElement(By.name("Password")).sendKeys("shreya123*");
	}

	@When("^user enters shreya(\\d+)\\* as Confirm Password$")
	public void user_enters_shreya_as_Confirm_Password(int arg1){
		 driver.findElement(By.name("ConfirmPassword")).sendKeys("shreya123*");
	}

	@Then("^user clicks on Register button$")
	public void user_clicks_on_Register_button() {
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
	}

	@Then("^registration should be successful$")
	public void registration_should_be_successful()  {
	   
	}

}
