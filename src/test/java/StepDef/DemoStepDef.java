package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDef {
	WebDriver driver=null;
	@Given("^the login page is opened$")
	
	public void the_login_page_is_opened()  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Log in")).click();
	}

	@When("^user enters aravind\\.guggilla(\\d+)@gmail\\.com as username$")
	public void user_enters_aravind_guggilla_gmail_com_as_username(int arg1)  {
		  driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
	}

	@When("^user enters aravind as password$")
	public void user_enters_aravind_as_password()  {
		 driver.findElement(By.name("Password")).sendKeys("aravind");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@Then("^demo Web shop page will open successfully$")
	public void demo_Web_shop_page_will_open_successfully() {
	 
	}
}
