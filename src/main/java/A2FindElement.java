import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class A2FindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumBasicsProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //  Driver initialization
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //  waiting for appearing of element which wasn't found
        driver.manage().window().maximize();    //  full window size
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.findElement(By.linkText("Log in"));
        WebElement link = driver.findElement(By.linkText("Log in"));    //найти элемент по тексту в ссылке, внести в переменную
        WebElement link2 = driver.findElement(By.partialLinkText("Donate"));    //найти ссылку по части текста, хранить в переменной
        WebElement searchField = driver.findElement(By.name("search")); //найти элемент по значению "search" атрибута "name"
        WebElement searchButton = driver.findElement(By.className("searchButton")); //найти элемент по имени класса
        WebElement li = driver.findElement(By.id("ca-viewsource")); //найти элемент по значению id
        WebElement input = driver.findElement(By.tagName("input")); //поиск элемента по имени тега
        WebElement element = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton")); //поиск по CSS-локатору
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"p-logo\"]/a")); //поиск по XPath
        WebElement element3 = driver.findElement(By.xpath("//div[@id='mw-panel']/div[@id='p-logo']//a")); //поиск по XPath

        driver.quit();  //  quit driver
    }
}
