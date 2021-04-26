import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/*https://coursehunter.net/course/selenium-webdriver-java-dlya-nachinayushchih
install Google Chrome browser, JDK, Maven, IntelliJ IDEA Community Edition, set system environment variables
create Maven project in IntelliJ IDEA IDE
add in pom.xml from https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java and https://junit.org/junit4/dependency-info.html:

<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
    </dependency>
</dependencies>

reload IntelliJ IDEA

download Google Chrome driver from https://chromedriver.chromium.org/downloads*/

public class A1LaunchImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\SeleniumBasicsProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //  Chrome driver initialization

        /*System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumBasicsProject\\geckodriver.exe");
        WebDriver ffdriver = new FirefoxDriver();  //  Firefox driver initialization*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //  waiting for appearing of element which wasn't found

        driver.manage().window().maximize();    //  full window size
        driver.manage().window().setSize(new Dimension(900,500));    //  predefined window size

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");    //  alternative method
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println(driver.getTitle());  //  print page title
        System.out.println(driver.getCurrentUrl());  //  print URL

        driver.quit();  //  quit Chrome driver
        //ffdriver.quit();    //  quit Firefox driver
    }
}
