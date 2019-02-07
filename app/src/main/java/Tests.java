import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

public class Tests {

    private static AndroidDriver driver;


    public static void EventNameCheck() throws MalformedURLException, InterruptedException, IllegalMonitorStateException, NullPointerException {


//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "Nexus 6");
//        caps.setCapability("udid", "emulator-5554");
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("platformVersion", "8.0");
//        caps.setCapability("appPackage", "com.rozdoum.eventor.lpmd2018");
//        caps.setCapability("appActivity", "com.rozdoum.eventor.activities.SchedulerActivity");
//        caps.setCapability("noReset", "true");


//        URL url = new URL("http://0.0.0.0:4723/wd/hub");
//        AndroidDriver driver = new AndroidDriver(url, caps);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        String EventNameExp = "Atlassian Summit | San Jose, CA";

//        driver.launchApp();
//        driver.wait(60000);
        System.out.println("Hola! Starting a Name Check Test");
        System.out.println("Waiting till Menu button becomes active");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")).isDisplayed();
        System.out.println("Clicking Menu button");
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
        System.out.println("Obtaining Event Name");
        String EventNameAct = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();

        System.out.println("Comparing Expected and Actual Names");
        if (EventNameAct.equals(EventNameExp)){
            System.out.println("Yep, names is correct"+
                    EventNameAct+" = "+EventNameExp);
        }
        else {
            System.out.println("No, something is wrong here"+
                    EventNameAct+" != "+EventNameExp);
        }
        System.out.println("This was last step of the test");
//        driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/drawableImageView")).click();
//        driver.findElement(By.className("android.support.v7.app.ActionBar$Tab")).click();
    }


}
