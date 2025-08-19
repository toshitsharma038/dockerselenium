package cdac.dockerselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    @Test
    public void loginWithValidUser() 
    {
        System.out.println("Login successful!");
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open website
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            // Enter username
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("student");
            Thread.sleep(3000);
            // Enter password
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("Password123");
            Thread.sleep(3000);
            // Click submit button
            WebElement loginBtn = driver.findElement(By.id("submit"));
            loginBtn.click();

            // Optional: wait and print title
            Thread.sleep(3000);
            System.out.println("Page title after login: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
	}
    
}