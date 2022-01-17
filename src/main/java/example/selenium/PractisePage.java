package example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PractisePage {
    WebDriver driver;

    public PractisePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void flow() {
        driver.findElement(By.name("name")).sendKeys("Tester");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
        driver.findElement(By.id("exampleCheck1")).click();
        Select genderSelect = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        genderSelect.selectByIndex(1);
        driver.findElement(By.id("inlineRadio1"));
        driver.findElement(By.className("form-control")).sendKeys("1995/05/02");
        driver.findElement(By.className("btn")).click();
        System.out.println(driver.findElement(By.className("alert")).getText());


    }


}
