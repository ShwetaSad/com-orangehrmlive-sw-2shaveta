package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    /*
    Write down the following test in the
‘ForgotPasswordTest’ class
1. userShouldNavigateToForgotPasswordPage
Successfully()
* click on the ‘Forgot your password’ link
* Verify the text ‘Reset Password’
* click on the ‘Cancel’ button
* Verify the text ‘Login’
     */
String baseUrl= "https://opensource-demo.orangehrmlive.com/";
  @Before
    public void Setup(){
        openBrowser(baseUrl);
    }
@Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        driver.findElement(By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //Verify text reset button
    String expectedText = "Reset Password";
       String actualText = driver.findElement(By.xpath("//button[@type='submit']")).getText();
       Assert.assertEquals("Reset Password",expectedText,actualText);


        driver.findElement(By.xpath("//button[@type='button']")).click();

        // Verify text Login
    String expectedText1 = "Login";
    String actualText1 = driver.findElement(By.xpath("//h5")).getText();
    Assert.assertEquals("Login", expectedText1 , actualText1);

    }

    @After
    public void close(){
      closeBrowser();

    }

}
