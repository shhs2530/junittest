import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Sample junit test code to integrate by
 */
public class JenkinsDemo
{
    private static String Base_Url = "https://www.google.com";
    private WebDriver driver;

    @Before
    public void setUp()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\opt\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Base_Url);
    }

    @After
    public void after()
    {
        driver.quit();
    }

    @Test
    public void testCasePassed()
    {
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
    
}
