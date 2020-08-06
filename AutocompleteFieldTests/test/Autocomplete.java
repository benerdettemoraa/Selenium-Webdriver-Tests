import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sabina.moraa/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        //testing the address in put field
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("55374");

        Thread.sleep( 1000);

        //we add some time to slow down the test



        //add a click on the autocomplete element
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        //to click result on the drop down menu
        autocompleteResult.click();
        driver.quit();
    }
}
