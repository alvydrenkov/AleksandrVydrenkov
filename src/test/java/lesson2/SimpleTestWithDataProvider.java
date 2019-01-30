package lesson2;

import base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SimpleTestWithDataProvider extends SeleniumBase {

    @DataProvider
    private Object[][] simpleDataProvider() {
        return new Object[][] {
                {0, "Name0"},
                {1, "Name1"},
                {2, "Name2"}
        };
    }

    @Test(dataProvider = "simpleDataProvider")
    public void simpleTest(int i, String s) {
        System.out.println("i = " + i + "; s = " + s);
    }
}
