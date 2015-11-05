import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ofisun on 11/3/2015.
 */
public class LoginTest {

    protected static WebDriver driver;
   // public String url = "http://localhost:80/wordpress/wp-login.php";

    @Test
    public void Lesson1()
    {

        driver = new FirefoxDriver();
        driver.navigate().to(Setting.loginUrl);
        driver.findElement(By.id("user_login")).clear();
        driver.findElement(By.id("user_login")).sendKeys("oleg");
        driver.findElement(By.id("user_pass")).clear();
        driver.findElement(By.id("user_pass")).sendKeys("oleg");
        driver.findElement(By.id("wp-submit")).click();

        driver.close();
        driver.quit();
    }



}
