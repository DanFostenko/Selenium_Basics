import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class B4DynamicPage {

    WebDriver driver;

    public B4DynamicPage(WebDriver driver) {  //class constructor
        this.driver = driver;
    }

    //Elements on page
    private By dynamicPage = By.xpath("//a[text()='Dynamic Loading']");  //locator for 'Dynamic Loading' link
    private By example2Page = By.xpath("//a[starts-with(text(),'Example 2')]");  //locator for 'Example 2: Element rendered after the fact' link
    private By startButton = By.xpath("//button[text()='Start']");  //locator for 'Start' button
    public By helloMessage = By.xpath("//h4[text()='Hello World!']");  //locator for 'Hello World!' text message

    private By contentField = By.xpath("//body[@id='tinymce']");  //locator for the field with 'Your content goes here.'
    private By contentInput = By.xpath("//body[@id='tinymce']/p");  //locator for the input area in content field


    //Methods
    public void clickDynamicPage() {
        driver.get("https://"+B1MainClass.site);
        driver.findElement(dynamicPage).click();
    }

    public void clickExample2Page() {
        driver.findElement(example2Page).click();
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
    }

    public boolean checkElementExists() {
        try {
            driver.findElement(helloMessage);
        } catch (NoSuchElementException e) {
            return false;
        }
        {
            System.out.println("Element " + helloMessage + " exists");
        return true;
        }
    }

}
