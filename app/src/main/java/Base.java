import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class Base {

    private static AndroidDriver driver;

    @Test
    public void TCase() throws MalformedURLException {


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus 6");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0");
        caps.setCapability("appPackage", "com.rozdoum.eventor.couchbase");
        caps.setCapability("appActivity", "com.rozdoum.eventor.activities.MainActivity");
 //       caps.setCapability("noReset", "true");


        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, caps);

        driver.launchApp();
        driver.findElement(By.id("com.rozdoum.eventor.couchbase:id/action_search")).click();
        driver.findElement(By.className("android.support.v7.app.ActionBar$Tab")).click();
    }



        }

