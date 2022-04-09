package baseTestPOI;

import org.junit.Test;

public class Test_Runner extends Base_Test{
	@Test
	
	 public void VerifyLoginFunc() throws InterruptedException {
	  
	 l1.click_on_Register_link();
	 l1.select_gender();
	 l1.First_name_and_Last_Name_("Sprint2", "pro");
	 l1.user_enters_email("sprintpro@gmail.com");
	 l1.password_as_and_confirm_password_as("project@123", "project@123");
	 l1.page_Title_should_be();
	 l1.click_on_Register_button();
		
	 }
}
