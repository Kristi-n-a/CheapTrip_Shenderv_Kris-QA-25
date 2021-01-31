package comCheapTripQA25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

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

    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }

    public boolean isSloganFormPresent(){
        return isElementPresent(new By.ByName("[name=\"ion-input-0\"]"));
    }

    public List<WebElement> isSelectLangPresent(){
        return wd.findElements(new By.ByCssSelector("\"ion-buttons.select.buttons-last-slot.sc-ion-buttons-md-h.sc-ion-buttons-md-s.md.hydrated"));
    }

    public List<WebElement> isSelectRussianLang(){
        return wd.findElements(By.id("id = \"ion-rb-1-lbl\""));
    }

}
