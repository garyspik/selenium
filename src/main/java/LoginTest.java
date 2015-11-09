import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Calendar;

/**
 * Created by ofisun on 11/3/2015.
 */
public class LoginTest {

    protected static WebDriver driver;
    long curTime = System.currentTimeMillis();
    String strLong = Long.toString(curTime);


    @Test
    public void Lesson2()
    {

        driver = new FirefoxDriver();
        driver.navigate().to(Setting.loginUrl+".php");
        driver.findElement(By.id("user_login")).clear();
        driver.findElement(By.id("user_login")).sendKeys("oleg");
        driver.findElement(By.id("user_pass")).clear();
        driver.findElement(By.id("user_pass")).sendKeys("oleg");
        driver.findElement(By.id("wp-submit")).click();
        driver.navigate().to(Setting.url+"/wordpress/wp-admin/edit.php");
        driver.findElement(By.xpath("/html/body//h1//a")).click();
        driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys(strLong);
        driver.findElement(By.xpath("//*[@id=\"content-html\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]")).sendKeys(strLong);
        driver.findElement(By.xpath("//*[@id=\"publish\"]")).click();
        driver.findElement(By.xpath("/html/body//*[@href=\"edit.php\"]")).click();
        Assert.assertEquals(String.valueOf(driver.findElement(By.xpath("strLong")).getText()),strLong);



        driver.close();
        driver.quit();

    }




}
