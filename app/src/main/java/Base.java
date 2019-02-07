import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({
//        Tests.class
//})

public class Base {

    private AndroidDriver driver;

    @BeforeTest
    public void InitSetup() throws MalformedURLException {

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
        WebDriverWait wait = new WebDriverWait(driver, 60);
        String SyncMsgExp = "Synchronisation with server, please wait";
        String SyncMsgAct = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).getText();


        driver.launchApp();
        System.out.println("This is routine before each test");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"))));
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
        if (SyncMsgExp.equals(SyncMsgAct)){
            System.out.println("Synchronisation is going good");
        }
        else {
            System.out.println("Ooops, Synchronization isn't going anywhere");
        }
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.rozdoum.eventor.lpmd2018:id/alertTitle")));
        System.out.println("Ok, and now to the Tests");


    }

    @Test
    public void TCase () throws MalformedURLException, InterruptedException, NullPointerException {
//        AndroidDriver driver = InitSetup();

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
        WebDriverWait wait = new WebDriverWait(driver, 60);
        String EventNameExp = "Atlassian Summit | San Jose, CA";


        System.out.println("Hola! Starting a Name Check Test");
        System.out.println("Waiting till Menu button becomes active"+"Waiting for 60 sec (because this PC is slooooooooow)");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")).isDisplayed();
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
        System.out.println("Closing app");
        driver.closeApp();
        System.out.println("App is closed");
        System.out.println("I've run a test! Good job! Keep it up!");
    }

//    @AfterTest
//    public void TearDown() throws MalformedURLException {
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "Nexus 6");
//        caps.setCapability("udid", "emulator-5554");
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("platformVersion", "8.0");
//        caps.setCapability("appPackage", "com.rozdoum.eventor.lpmd2018");
//        caps.setCapability("appActivity", "com.rozdoum.eventor.activities.SchedulerActivity");
////        caps.setCapability("noReset", "true");
//
//
//        URL url = new URL("http://0.0.0.0:4723/wd/hub");
//        AndroidDriver driver = new AndroidDriver(url, caps);
//
//
////        URL url = new URL("http://0.0.0.0:4723/wd/hub");
////        AndroidDriver driver = driver;
//
//        System.out.println("This is routine after each test");
//        System.out.println("Closing app");
//        driver.closeApp();
//        System.out.println("App is closed");
//        System.out.println("I've run a test! Good job! Keep it up!");
//    }





        }

