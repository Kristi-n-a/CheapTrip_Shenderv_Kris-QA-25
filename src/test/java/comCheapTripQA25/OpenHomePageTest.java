package comCheapTripQA25;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class OpenHomePageTest extends TestBase{

    @Test
    public void homePageTest(){
        System.out.println("Site opened");
    }

    @Override
    public boolean isSloganFormPresent() {
        return super.isSloganFormPresent();
    }

    @Override
    public List<WebElement> isSelectLangPresent() {
        return super.isSelectLangPresent();
    }

    @Override
    public List<WebElement> isSelectRussianLang() {
        return super.isSelectRussianLang();
    }
}
