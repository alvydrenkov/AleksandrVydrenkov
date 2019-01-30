package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class SeleniumBase {

    @BeforeSuite
    public void beforeSuite() {
    }

    @AfterSuite
    public void afterSuite() {
    }
}
