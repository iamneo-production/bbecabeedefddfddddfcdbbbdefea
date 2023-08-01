import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScenarioTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testScenario() {
        // Navigate to iamneo.ai
        driver.get("http://iamneo.ai");

        // Verify page title
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "We are Hiring!", "Page title doesn't match. FAIL.");

        // Navigate to Facebook
        driver.get("https://www.facebook.com");

        // Navigate back to iamneo.ai
        driver.navigate().back();

        // Print the current URL
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        // Navigate forward
        driver.navigate().forward();

        // Reload the page
        driver.navigate().refresh();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
