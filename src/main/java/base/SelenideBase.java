package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class SelenideBase {

    @BeforeSuite
    public void beforeSuite() {
        Configuration.startMaximized = true;
    }
}
