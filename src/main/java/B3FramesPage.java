import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class B3FramesPage {

    WebDriver driver;

    public B3FramesPage(WebDriver driver) {  //class constructor
        this.driver = driver;
    }

    //Elements on page
    private By framesPage = By.xpath("//a[text()='Frames']");  //locator for 'Frames' link
    private By iFramePage = By.xpath("//a[text()='iFrame']");  //locator for 'iFrame' link
    public By contentField = By.xpath("//body[@id='tinymce']");  //locator for the field with 'Your content goes here.'
    private By contentInput = By.xpath("//body[@id='tinymce']/p");  //locator for the input area in content field

    //Methods
    public void clickFramesPage() {
        driver.get("https://"+B1MainClass.site);
        driver.findElement(framesPage).click();
    }

    public void clickIFramePage() {
        driver.findElement(iFramePage).click();
    }

    public void writeName(String name) {
        driver.switchTo().frame("mce_0_ifr").findElement(contentField).click();
        driver.findElement(contentField).clear();
        driver.findElement(contentField).sendKeys(name);
        System.out.println(driver.findElement(contentField).getText());
        //if (driver.findElement(contentField).getText() == name) System.out.println(string1);
    }

}
