import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;


public class selenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        new SafariDriver();

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



        driver.manage().addCookie(new Cookie("","","","",null));
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("cookieName");

        driver.manage().window().maximize();

        /*
        An implicit wait in Selenium is a global setting that instructs the WebDriver to poll the Document Object Model (DOM) for a specified amount of time when trying to find an element that is not immediately available. The default setting is 0 seconds, meaning it will immediately throw a NoSuchElementException if the element isn't found right away.

        Key Characteristics:
        Global Scope: Once set, the implicit wait applies to every findElement and findElements call for the entire duration of that WebDriver instance's life.
        Dynamic Duration: The driver does not wait for the entire duration every time. If the element is found before the specified timeout, the script proceeds immediately, improving efficiency.
        Presence Only: It only waits for the element to be present in the DOM, not necessarily for it to be visible or interactable (e.g., clickable)
         */
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));//default is 0
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(30));//default is 300(5 minutes)
        driver.manage().timeouts().setScriptTimeout(java.time.Duration.ofSeconds(20));//default is 30


        driver.switchTo().frame(0);
        driver.switchTo().frame("frameName");
        driver.switchTo().frame(driver.findElement(By.id("frameId")));
        driver.switchTo().defaultContent();

        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("text");


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
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        //more actions can be added as needed

        //Dropdown handling
        WebElement element=driver.findElement(By.id("elementId"));
        Select select= new Select(element);
        select.selectByIndex(0);
        select.selectByValue("value");
        select.selectByVisibleText("visibleText");
        select.deselectAll();
        select.getAllSelectedOptions();
        List<WebElement> options = select.getOptions();


        //get selected elements
        select.getAllSelectedOptions();
        select.getFirstSelectedOption();
        select.getOptions();//returns all options in the dropdown

        //table handling
        WebElement table= driver.findElement(By.id("tableId"));
        int rowCount= table.findElements(By.tagName("tr")).size();
        int columnCount= table.findElements(By.tagName("th")).size();

        //actions on elements
        driver.findElement(By.id("elementId")).click();
        driver.findElement(By.id("elementId")).sendKeys("text");
        driver.findElement(By.id("elementId")).getText();
        driver.findElement(By.id("elementId")).getAttribute("attributeName");
        driver.findElement(By.id("elementId")).isDisplayed();
        driver.findElement(By.id("elementId")).isEnabled();
        driver.findElement(By.id("elementId")).isSelected();
        driver.findElement(By.id("elementId")).clear();
        driver.findElement(By.id("elementId")).submit();
        driver.findElement(By.id("elementId")).getCssValue("propertyName");

    }
}
