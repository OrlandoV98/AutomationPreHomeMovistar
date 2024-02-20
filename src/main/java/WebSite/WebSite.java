package WebSite;

import SetUp.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebSite {

    public WebDriver driver;

    public void OpenWebSite() throws InterruptedException {

        SetUp setUp = new SetUp();
        setUp.OpenDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.get("https://landingtv-staging.vml.pe/");
        Thread.sleep(5000);

        Locators  locators = new Locators();
        locators.NewClient(driver);
        locators.FormNewclient(driver);
        locators.ValidateSendForm(driver);

        Thread.sleep(5000);

        driver.quit();

    }

}
