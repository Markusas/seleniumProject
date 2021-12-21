package example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {
    public static void main(String[] args) {

        //Invoking Browser
        //Chrome - ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\632789\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
