package notepadhomework;
/*
Navigate to website "https://demo.nopcommerce.com/"
 Click on register link.
 Fill the all fields.
 Click on register button.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        Thread.sleep(2000);
        WebElement genderBt = driver.findElement(By.xpath("//input[@id='gender-female']"));
        genderBt.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
        firstName.sendKeys("Ankita");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='LastName']"));
        lastName.sendKeys("Kaswala");
        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("ajkaswala@yahoo.com");
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

    }
}
