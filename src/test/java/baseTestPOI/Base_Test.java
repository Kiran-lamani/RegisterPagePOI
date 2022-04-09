package baseTestPOI;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import testPOI.Reg_Page;
public class Base_Test {
	public static WebDriver driver;  
	 public static Reg_Page l1;
	 @BeforeClass
	 public static void launchApp() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();	  
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);    
	  l1 = new Reg_Page(driver);
	 }
	 @AfterClass
	 public static void closeApp() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  //driver.close();
	}

}
