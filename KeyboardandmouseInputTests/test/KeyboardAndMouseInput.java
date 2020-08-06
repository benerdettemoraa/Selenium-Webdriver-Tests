import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/sabina.moraa/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        //to test the EnterFull Name input field
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("sabina");
        //to test the button functionality
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
