import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class B1MainClass {

    static WebDriver driver;
    public static String site = "the-internet.herokuapp.com";
    public static String name = "Bogdan Fostenko";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumBasicsProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //  Chrome driver initialization
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //  waiting for appearing of element which wasn't found
        driver.manage().window().maximize();    //  full window size
        driver.get("https://"+site);

        B2CheckboxesPage b2CheckboxesPage = new B2CheckboxesPage(driver);   //  Class initialization
        B3FramesPage b3FramesPage = new B3FramesPage(driver);
        B4DynamicPage b4DynamicPage = new B4DynamicPage(driver);

        b2CheckboxesPage.clickCheckboxesPage();
        b2CheckboxesPage.resolveCheckboxes();
        b2CheckboxesPage.checkStatuses();
        b3FramesPage.clickFramesPage();
        b3FramesPage.clickIFramePage();
        b3FramesPage.writeName(name);
        b4DynamicPage.clickDynamicPage();
        b4DynamicPage.clickExample2Page();
        b4DynamicPage.clickStartButton();
        b4DynamicPage.checkElementExists();

        driver.quit();  //  quit Chrome driver
    }

}
