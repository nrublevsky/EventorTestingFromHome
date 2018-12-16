import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class Base {

    private static AndroidDriver driver;

    @Test
    public void TCase() throws MalformedURLException, InterruptedException, IllegalMonitorStateException {


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus 6");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0");
        caps.setCapability("appPackage", "com.rozdoum.eventor.lpmd2018");
        caps.setCapability("appActivity", "com.rozdoum.eventor.activities.SchedulerActivity");
//        caps.setCapability("noReset", "true");


        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, caps);

        driver.launchApp();
//        driver.wait(60000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")).isDisplayed();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
//        driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/drawableImageView")).click();
//        driver.findElement(By.className("android.support.v7.app.ActionBar$Tab")).click();
    }



        }

