import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC2_Evelin {

 @Test
    public void getDriver(){

     WebDriverManager.chromedriver().setup();

     WebDriver driver =  new ChromeDriver();

     driver.navigate().to("https://www.etsy.com/");

 }
}
