package notepadhomework;
/*Navigate to google https://www.google.com/
        In Google search type "nopCommerce demo store" and click search
        click on the link "nopCommerce demo store"
        print the links count and text from the page.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment1 {
    public static void main(String[] args){
       // String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.get(baseUrl);
        driver.get("https://www.google.com");
        WebElement searchButton = driver.findElement(By.name("q"));
        //WebElement searchButton = driver.findElement(By.xpath("//input[@title='Search']"));
        searchButton.sendKeys(new String[]{"nopCommerce demo store"});
        searchButton.submit();
        WebElement driver1 = driver.findElement(By.xpath("//h3[contains(text(),'nopCommerce demo store')]"));
        driver1.click();
       driver.manage().window().maximize();
       java.util.List<WebElement>Links = driver.findElements(By.tagName("a"));
        System.out.println(Links.size());
        for (int i = 1; i <= Links.size(); i = i + 1){
            System.out.println(Links.get(i).getText());
        }
    }
}
