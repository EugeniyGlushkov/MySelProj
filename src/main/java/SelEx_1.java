import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelEx_1 {

    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Eggs");
        element.sendKeys("boiled", Keys.ARROW_DOWN);
        element.submit();

        System.out.println("Page title is: " + driver.getTitle());
        (new WebDriverWait(driver, 10)).until((WebDriver d) -> d.getTitle()/*.toLowerCase()*/.startsWith("Eggsboiled"));
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}
