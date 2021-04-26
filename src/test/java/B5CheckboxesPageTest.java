import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class B5CheckboxesPageTest {

    private WebDriver driver;
    private B2CheckboxesPage b2CheckboxesPage;
    public static String site = "the-internet.herokuapp.com";

    @Before    // annotation for starting activities before each testing method
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumBasicsProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //  Chrome driver initialization
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //  waiting for appearing of element which wasn't found
        driver.manage().window().maximize();    //  full window size
        driver.get("https://"+site);
        b2CheckboxesPage = new B2CheckboxesPage(driver);
    }

    @Test    // annotation for main activities for each testing method
    public void method1() {
        b2CheckboxesPage.clickCheckboxesPage();
        b2CheckboxesPage.resolveCheckboxes();
        Assert.assertTrue(b2CheckboxesPage.checkStatuses());
    }

    @After    // annotation for closing activities after each testing method
    public void tearDown() {
        //driver.quit();  //  quit Chrome driver
    }

}