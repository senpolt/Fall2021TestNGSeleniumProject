package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.input.SwappedDataInputStream;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstSeleniumScript {

    public static void main(String[] args) throws Throwable{
        //We have to setup webDriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        // We need to create an object of appropriate class (ChromeDriver class)
        ChromeDriver driver = new ChromeDriver();
        String url="http://google.com";

        String url2 ="http://amazon.com";
        //Let's open google.com
        driver.get("http://google.com");
        //will put on hold current run on 3 seconds
        Thread.sleep(3000);

        //Test1: Verify that title of the page is a "Google"
        //to read page title
        String actualResult=driver.getTitle();
        String expectedResult="Google";
        if(actualResult.equals(expectedResult)){
            System.out.println("Test pass");
        }else{
            System.out.println("Test failed");
        }
        //will refresh the page (url)
       // driver.navigate().refresh();
       // Thread.sleep(3000);
        //Navigate to the amazon.com
        driver.navigate().to(url2);
        driver.navigate().refresh();
        Thread.sleep(3000);
        //wait for 3 seconds
        Thread.sleep(3000);
        //will navigate to the previous url in our case it is a google.com
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        //will close web browser
       driver.close();
       //driver.close();
    }




}
