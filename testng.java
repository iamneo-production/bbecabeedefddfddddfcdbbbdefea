import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the Firefox driver executable
        System.setProperty("webdriver.gecko.driver", "path_to_geckodriver.exe");
        
        // Initialize the Firefox driver
        driver = new FirefoxDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testTitle() {
        // Navigate to "http://iamneo.ai"
        driver.get("http://iamneo.ai");
        
        // Verify the title of the page
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "We are Hiring!", "Page title doesn't match");
    }

    @Test(priority = 2)
    public void testNavigation() {
        // Navigate to "https://www.facebook.com"
        driver.get("https://www.facebook.com");
        
        // Navigate back to "http://iamneo.ai"
        driver.navigate().back();
        
        // Print the URL of the current page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        
        // Navigate forward
        driver.navigate().forward();
        
        // Reload the page
        driver.navigate().refresh();
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
