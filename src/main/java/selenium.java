import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class selenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        driver.switchTo().frame(0);
        driver.switchTo().frame("frameName");
        driver.switchTo().frame(driver.findElement(By.id("frameId")));
        driver.switchTo().defaultContent();

        driver.switchTo().window("windowName");
        driver.getWindowHandles();

        Actions actions= new Actions(driver);
        actions.contextClick();
        actions.contextClick(driver.findElement(By.id("elementId"))).perform();
        actions.clickAndHold(driver.findElement(By.id("elementId"))).perform();
        actions.doubleClick();
        actions.doubleClick(driver.findElement(By.id("elementId"))).perform();
        actions.dragAndDrop(driver.findElement(By.id("source")), driver.findElement(By.id("target"))).perform();
        actions.moveByOffset(0,100);
        actions.moveToElement(driver.findElement(By.id("elementId"))).perform();
        //more actions can be added as needed

        //Dropdown handling
        WebElement element=driver.findElement(By.id("elementId"));
        Select select= new Select(element);
        select.selectByIndex(0);

        //table handling
        WebElement table= driver.findElement(By.id("tableId"));
        int rowCount= table.findElements(By.tagName("tr")).size();
        int columnCount= table.findElements(By.tagName("th")).size();


    }
}
