package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Case1 {
	WebDriver driver;
	@Given("user opens sign up page in testme application")
	public void user_opens_sign_up_page_in_testme_application() {
		System.out.println("user opened the application");
		  
	  	System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
		WebElement signup= driver.findElement(By.linkText("SignUp"));
		signup.click();
	  
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
		
	  
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("user enters confirm password as {string}")
	public void user_enters_confirm_password_as(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@When("user enters gender")
	public void user_enters_gender() {
		driver.findElement(By.name("gender")).click();
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@When("user enters mobile number as {string}")
	public void user_enters_mobile_number_as(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@When("user enters security question")
	public void user_enters_security_question() {
		//driver.findElement(By.name("securityQuestion")).sendKeys();
	}

	@When("user enters security answer as {string}")
	public void user_enters_security_answer_as(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@When("Click submit button")
	public void click_submit_button() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("verify login success")
	public void verify_login_success() throws InterruptedException {
		 System.out.println("login success");
			Thread.sleep(5000);
			
			
			// String reg=driver.findElement(By.xpath("//*[@id='errormsg']")).getText();
			
					
			
				//if(reg.equals("User Registered Succesfully!!! Please login"))
			 String log_title=driver.getTitle();
				if(log_title.equals("Login"))
				{	
				Assert.assertTrue(true);}
				else
				{
				Assert.assertTrue(false);}
			 
				
			
	   
		
	}
	
	@Then("close application")
	public void close_application() {
		driver.close();
	}



}
