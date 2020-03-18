package teamframework;
/*Test Case 2 User should register successfully.
        Click on Register
        Enter correct details in field
        Click on register button.
        Expected Result:
        Success Message “Your registration completed”
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

public class RegisterSuccessfully {
    WebDriver driver;
    @Before
    public void openBrowser(){
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @Test
    public void userDetails() throws InterruptedException {
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        Thread.sleep(2000);
        WebElement genderBt = driver.findElement(By.xpath("//input[@id='gender-female']"));
        genderBt.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
        firstName.sendKeys("Aankita");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='LastName']"));
        lastName.sendKeys("Kaswala");
        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("aj1kaswala@yahoo.com");
        WebElement dateOfBirthDay = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dateOfBirthDay.sendKeys("1");
        WebElement dateOfBirthMonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        dateOfBirthMonth.sendKeys("July");
        WebElement dateOfBirthYear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        dateOfBirthYear.sendKeys("1986");
        WebElement companyName = driver.findElement(By.xpath("//input[@name='Company']"));
        companyName.sendKeys("jmphysiocare");
        WebElement newsLatter = driver.findElement(By.xpath("//input[@type='checkbox']"));
        newsLatter.sendKeys(" ");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("abc123 ");
        WebElement conformPassword = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
        conformPassword.sendKeys("abc123 ");
        WebElement registerBt = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerBt.click();
        WebElement registerMsg = driver.findElement(By.xpath("//div[@class=\"result\"]"));
        registerMsg.getText();


        String expectedResult = "Your registration completed";
        String actualResults =registerMsg.getText();
        Assert.assertEquals(expectedResult,actualResults);


    }
    @Test
    public void userDetail() throws InterruptedException {
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        Thread.sleep(2000);
        WebElement genderBt = driver.findElement(By.xpath("//input[@id='gender-female']"));
        genderBt.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
        firstName.sendKeys("ankita");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='LastName']"));
        lastName.sendKeys("Kaswala");
        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("aj12kaswala@yahoo.com");
        WebElement dateOfBirthDay = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dateOfBirthDay.sendKeys("1");
        WebElement dateOfBirthMonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        dateOfBirthMonth.sendKeys("July");
        WebElement dateOfBirthYear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        dateOfBirthYear.sendKeys("1986");
        WebElement companyName = driver.findElement(By.xpath("//input[@name='Company']"));
        companyName.sendKeys("jmphysiocare");
        WebElement newsLatter = driver.findElement(By.xpath("//input[@type='checkbox']"));
        newsLatter.sendKeys(" ");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("abc123 ");
        WebElement conformPassword = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
        conformPassword.sendKeys("abc123 ");
        WebElement registerBt = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerBt.click();
        WebElement registerMsg = driver.findElement(By.xpath("//div[@class=\"result\"]"));
        registerMsg.getText();


        String expectedResult = "Your registration complete";
        String actualResults =registerMsg.getText();
        Assert.assertEquals(expectedResult,actualResults);


    }

    @After
    public void browserClose(){
        driver.quit();
    }
}




