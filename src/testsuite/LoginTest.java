package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    /*
    3. Write down the following test in the ‘LoginTest’ class
1. userSholdLoginSuccessfullyWithValidCredentials()

* Enter “Admin” username
* Enter “admin123 password
* Click on the ‘Login’ button
* Verify the ‘Dashboard’ text is displayed
     */
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void open() {
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        // Verify Dashboard text
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.linkText("Dashboard")).getText();
        Assert.assertEquals("Dashboard",expectedText,actualText);

    }
    public void close(){
        closeBrowser();
    }
}
