package teamframework;
/* User should navigate to register page successfully.
        Click on Register Link
        Message “Your Personal Details“
        Assert above message.*/

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigateToRegisterPage {
    WebDriver driver;

    @Before
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        Thread.sleep(2000);
        WebElement registerFeature = driver.findElement(By.xpath("//strong[contains(text(),'Your Personal Details')]"));
        registerFeature.getText();
        String expectedText = "Your Personal Details";
        String actualText = registerFeature.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToRegisterPageUnsuccessfully() {
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        WebElement registerFeature = driver.findElement(By.xpath("//strong[contains(text(),'Your Personal Details')]"));
        registerFeature.getText();
        String expectedText = "Your Personal Detail";
        String actualText = registerFeature.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @After
    public void browserClose() {

        driver.quit();
    }


}
