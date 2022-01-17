package example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    //DesiredCapabilities dc;
    String baseUrl;

    //String nodeUrl;

    @BeforeSuite
    public void setUp() {

        //nodeUrl = "http://10.61.202.161:4444";
        baseUrl = "https://rahulshettyacademy.com/angularpractice/";
        //dc = new DesiredCapabilities();
        //dc.setBrowserName("chrome");
        //dc.setPlatform(Platform.WINDOWS);

        //driver = new RemoteWebDriver(new URL(nodeUrl), dc);
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.setExperimentalOption("useAutomationExtension", false);

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}