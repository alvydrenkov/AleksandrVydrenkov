package lesson4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;

public class SimpleTestSelenide {

    @BeforeSuite
    public void beforeSuite() {
        Configuration.startMaximized = true;
    }

    @Test
    public void simpleTest() {
        // 1
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
//
//        String handle = driver.getWindowHandle();
//        driver.switchTo().window(handle);

        // 2
//        driver.navigate().to("https://epam.github.io/JDI/index.html");

        // 3
//        assertEquals(driver.getTitle(), "Home Page");

        // 4
//        driver.findElement(By.cssSelector("[id='user-icon']")).click();
//        driver.findElement(By.cssSelector("[id='name']")).sendKeys("epam");
//        driver.findElement(By.cssSelector("[id='password']")).sendKeys("1234");
//        driver.findElement(By.cssSelector("[id='login-button']")).click();

        // 5
//        driver.close();

        open("https://epam.github.io/JDI/index.html");
        assertEquals(getWebDriver().getTitle(), "Home Page");

        $("[id='user-icon']").click();
        $("[id='name']").sendKeys("epam");
        $("[id='password']").sendKeys("1234");
        $("[id='login-button']").click();

        $("#user-name").shouldHave(text("PITER CHAILOVSKII"));

        close();
    }

}
