package example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    //DesiredCapabilities dc;
    String baseUrl;

    //String nodeUrl;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        //nodeUrl = "http://10.61.202.161:4444";
        baseUrl = "https://rahulshettyacademy.com/angularpractice/";
        //dc = new DesiredCapabilities();
        //dc.setBrowserName("chrome");
        //dc.setPlatform(Platform.WINDOWS);

        //driver = new RemoteWebDriver(new URL(nodeUrl), dc);
        //WebDriverManager.chromedriver().setup();

        //options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        //options.setExperimentalOption("useAutomationExtension", false);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
