import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class B2CheckboxesPage {

    WebDriver driver;

    public B2CheckboxesPage(WebDriver driver) {  //class constructor
        this.driver = driver;
    }

    //Elements on page
    private By checkboxesPage = By.xpath("//a[text()='Checkboxes']");  //locator for 'Checkboxes' link
    private By checkbox1 = By.xpath("//input[@type='checkbox'][1]");  //locator for 'checkbox 1' element
    private By checkbox2 = By.xpath("//input[@type='checkbox'][2]");  //locator for 'checkbox 1' element

    //Methods
    public void clickCheckboxesPage() {
        driver.get("https://"+B1MainClass.site);
        driver.findElement(checkboxesPage).click();
    }

    public void resolveCheckboxes() {
        this.resolveCheckbox(checkbox1);
        this.resolveCheckbox(checkbox2);
    }

    public void resolveCheckbox(By checkbox) {
        /*if checkbox is not selected, then click on it;
        if it is already selected, then also click on it*/
        if (!driver.findElement(checkbox).isSelected())
            driver.findElement(checkbox).click();
        else driver.findElement(checkbox).click();
    }

    public boolean checkStatuses() {
        if (driver.findElement(checkbox1).isSelected())
            return true;
        else if (!driver.findElement(checkbox2).isSelected())
            return true;
        else return false;
    }


}
