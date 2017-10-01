package stepDefinationcmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class IrishLoginTestcmd_StepDef {
	
// WebDriver  driver = null;
 
 public static WebDriver driver;
 
	@Given("^user opens Irish login page$")
	public void user_opens_gmail_login_page(){
	driver = new FirefoxDriver();
	driver.get("https://www.irishjobs.ie/login");
}
@Then("^user enters username$")
public void user_enters_username(){
	
	driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("rajani.hanamshetty@gmail.com");
}

@Then("^user enters Password$")
public void user_enters_Password(){
	
	driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Daksha123$");
}

@And("^user click on submit button$")
public void user_click_on_submit_button(){
	
	driver.findElement(By.xpath("//*[@id='loginButton']")).click();
}
@And("^User_Should_be_logged_in_successfully$")
public void User_Should_be_logged_in_successfully(){
	
	System.out.println("User logged in successfully");

}	

@Given("^User is logged in to Irishportal$")
public void User_In_Irish_Page(){
	System.out.println("In IRISHJOB");
	
	}

@Then("^user enter the keyword$")
public void User_click_keyword() {
	//throws Throwable 
	driver.findElement(By.xpath("//*[@id='Keywords']")).sendKeys("Selenium");
	//throw new PendingException();
}
@Then("^click on search button$")
public void click_on_search_button() throws InterruptedException{
	
	driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
	
	Thread.sleep(4000);
}

@Then("^Click and select dropdown value$")
public void Select_dropdown_value(){
	
	WebElement a = driver.findElement(By.xpath("//*[@id='SortedBy']"));
			a.click();
			Select s1=new Select(a);
			s1.selectByVisibleText("Most Recent");
			System.out.println("selected the value from dropdown");
			
}

@And("^logout$")
public void logout1(){
	
	driver.close();
}

@And("^logged out from the portal$")
public void Log_out(){
	
	driver.findElement(By.xpath("//*[@id='global-user-options']/ul/li[4]/a")).click();
}

}
	
	
	
