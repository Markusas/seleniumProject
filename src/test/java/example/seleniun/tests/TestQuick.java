package example.seleniun.tests;

import example.selenium.BaseTest;
import example.selenium.PractisePage;
import org.testng.annotations.Test;

public class TestQuick extends BaseTest {
    PractisePage practisePage;

    @Test
    public void letsStart() {
        practisePage = new PractisePage(driver);
        practisePage.flow();
    }

}
