package comCheapTripQA25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

    WebDriver wd;

    @BeforeSuite
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("http://test70.lowcoststrip.com");
    }

    @Test
    public void openHomePage(){

    }

    @AfterSuite
    public void tearDawn(){
        wd.quit();
    }

}
