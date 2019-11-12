package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver driver;
	@Given("user launches chromebrowser and opens Testmeapp")
	public void user_launches_chromebrowser_and_opens_Testmeapp() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
	 
	driver.navigate().to("http://localhost:8083/TestMeApp");
		
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		// driver= new ChromeDriver();
	//	 driver.manage().window().maximize();
	//	 driver.navigate().to("http://localhost:8083/TestMeApp");
	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() {
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String username) {
		driver.findElement(By.id("userName")).sendKeys(username);;
	   
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);;
	}

	@When("user clicks on Login")
	public void user_clicks_on_Login() {
		 driver.findElement(By.name("Login")).click();

	}

	@When("user points to All Categories")
	public void user_points_to_All_Categories() {
		 driver.findElement(By.linkText("All Categories")).click();
	}

	@When("user selects Electronics")
	public void user_selects_Electronics() {
		 driver.findElement(By.linkText("Electronics")).click();   
	}

	@When("user selects Headphone")
	public void user_selects_Headphone() {
		driver.findElement(By.partialLinkText("Head Phone")).click();
	}

	@Then("user searches for headphone")
	public void user_searches_for_headphone() {
		driver.findElement(By.id("pname")).sendKeys("headphone");
	    driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/div/button")).click();
	}

	@Then("user adds headphone to cart")
	public void user_adds_headphone_to_cart() {
		// driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.partialLinkText("Add to cart")).click();
	}

	@Then("user clicks on cart")
	public void user_clicks_on_cart() {
		driver.findElement(By.partialLinkText("Cart")).click();
	}

	@Then("user clicks on  checkout")
	public void user_clicks_on_checkout() {
		
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

	

}

