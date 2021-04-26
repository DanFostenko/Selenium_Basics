import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class B7DynamicPageTest {

    private WebDriver driver;
    private B4DynamicPage b4DynamicPage;
    public static String site = "the-internet.herokuapp.com";
    public static String name = "Bogdan Fostenko";

    @Before    // annotation for starting activities before each testing method
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumBasicsProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //  Chrome driver initialization
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //  waiting for appearing of element which wasn't found
        driver.manage().window().maximize();    //  full window size
        driver.get("https://"+site);
        b4DynamicPage = new B4DynamicPage(driver);
    }

    @Test    // annotation for main activities for each testing method
    public void method1() {
        b4DynamicPage.clickDynamicPage();
        b4DynamicPage.clickExample2Page();
        b4DynamicPage.clickStartButton();
        b4DynamicPage.checkElementExists();
        //Assert.assertEquals(driver.findElement(b4DynamicPage.helloMessage).getText(),"Hello World!");
    }

    @After    // annotation for closing activities after each testing method
    public void tearDown() {
        //driver.quit();  //  quit Chrome driver
    }

}