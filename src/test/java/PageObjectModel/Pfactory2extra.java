package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pfactory2extra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();
		PFactory Pobject= new PFactory(driver);
		Pobject.loginmethod("aravind.guggilla57@gmail.com","aravind");
	}
}
