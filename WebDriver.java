package JavaProject02;

import java.util.Objects;

public interface WebDriver {//Provide Implementation for the diagram below. Then create a test class
    // in which you need to create Objects of ChromeDriver, FirefoxDrive and
    //SafariDriver classes and see which methods available to them.
    void open();
    void close();
    String getTitle();


}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{
    void navigate();

}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Chrome");

    }

    @Override
    public void close() {
        System.out.println("Close Chrome");

    }

    @Override
    public String getTitle() {
        return "ChromeDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome screenshot");

    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome");
    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox");
    }

    @Override
    public String getTitle() {
        return "Firefox Driver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Firefox");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open SafariDriver");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");

    }

    @Override
    public String getTitle() {
        return "Safari Driver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari screenshot");

    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari");

    }
}
class WebdriverTester{
    public static void main(String[] args) {
        RemoteWebDriver []drivers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for (RemoteWebDriver driver:drivers){
            String driverTitle=driver.getTitle();
            System.out.println(driverTitle);
            driver.open();
            driver.close();
            driver.navigate();
            driver.getScreenshot();

        }
    }}