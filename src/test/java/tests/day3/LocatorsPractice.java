package tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
    public static void main(String[] args) {
        //We have to setup webDriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        // We need to create an object of appropriate class (ChromeDriver class)
        ChromeDriver driver = new ChromeDriver();

    }
}
