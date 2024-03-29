package day1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HesapMakinesi {
    AndroidDriver<AndroidElement> driver; // Anadroid cihazlardaki islemleri yapabilmemizi saglayan driver objesi


    //  AndroidDriver<MobileElement> driver2; // Anadroid cihazlardaki islemleri yapabilmemizi saglayan driver objesi
    //  IOSDriver<IOSElement> iosDriver; // Ios cihazlardaki islemleri yapabilmemizi saglayan driver objesi
    //  AppiumDriver<MobileElement> appiumDriver; // her iki platformda da islemleri yapabilmemezi saglayan driver objesi



    @Test
    public void ilkHesapAppTest() throws MalformedURLException {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        // capabilities.setCapability("deviceName","Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\AfadLocal\\IdeaProjects\\Appium\\Apps\\Calculator_8.4 (503542421)_Apkpure.apk");
        // UiAutomator 2 otomasyon ismi sadece android 6 dan yuksek olan android sistemleri icin calisir
        // UiAutomator otomasyon ismi sadece android 6 ve 6 dan dusuk olan android sistemleri icin calisir

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);





    }
}