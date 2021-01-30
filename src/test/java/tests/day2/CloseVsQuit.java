package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {
    public static void main(String[] args) throws Throwable {
//        System.setProperty("webdriver.chrome.driver","chromedriver");
//        WebDriver driver = new ChromeDriver();
//
        //We have to setup webDriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        // We need to create an object of appropriate class (ChromeDriver class)
        ChromeDriver driver = new ChromeDriver();

         driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);

       // driver.close();//close only one tape (browser closes previous window)
        driver.quit();//close all he windows



    }
}
