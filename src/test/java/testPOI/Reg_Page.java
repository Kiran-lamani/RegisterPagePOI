package testPOI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Reg_Page {	
	 public Reg_Page(WebDriver driver) {
		  this.driver = driver;
		  PageFactory.initElements( driver,this);
		 }
		 WebDriver driver;
			
		 @FindBy (xpath ="//a[@href='/register']") 
		 WebElement Registerlink;
			
		 @FindBy(xpath ="//input[@name='Gender']")
		 WebElement Select_gender;
			
		 @FindBy (xpath ="//input[@data-val-required='First name is required.']") 
		 WebElement Firstname;
			
		 @FindBy (xpath ="//label[text()='Last name:']/following::input") 
		 WebElement Lastname;
			
		 @FindBy (id ="Email") 
		 WebElement Emailtxt;
			
		 @FindBy (id ="Password") 
		 WebElement Password;
			
		 @FindBy (id ="ConfirmPassword") 
		 WebElement ConfirmPassword;
			
		 @FindBy (id ="register-button") 
		 WebElement Registerbtn;

			
		 public void click_on_Register_link() throws InterruptedException {
		  
		  System.out.println("Opening register page");
		  Registerlink.click();
		  Thread.sleep(4000);
		 }

			
		 public void select_gender() throws InterruptedException {
		  System.out.println("Selecting gender");
		  Select_gender.click();
		  Thread.sleep(4000);
		 }

			
		 public void First_name_and_Last_Name_(String string, String string2) throws InterruptedException {
		     Firstname.sendKeys(string);
		     Lastname.sendKeys(string2);
		     Thread.sleep(4000);
		 }

			
		 public void user_enters_email(String Email) throws InterruptedException {
		  Emailtxt.sendKeys(Email);
		  Thread.sleep(4000);
		     
		 }

			
		 public void password_as_and_confirm_password_as(String Pass, String Cpass) throws InterruptedException {
		  Password.sendKeys(Pass);
		  ConfirmPassword.sendKeys(Cpass);
		  Thread.sleep(4000);
		     
		 }

			
		 public void page_Title_should_be() {
		   String s = driver.getTitle();
		   System.out.println("The title of the page is :"+ s);
		     
		 }

			
		 public void click_on_Register_button() throws InterruptedException {
		  System.out.println("Registration is successful");
		  Registerbtn.click();
		  Thread.sleep(4000);
		 }
}
