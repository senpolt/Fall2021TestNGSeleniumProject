package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicNavigation {

    public static void main(String[] args) throws Throwable {
        //We have to setup webDriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        // We need to create an object of appropriate class (ChromeDriver class)
        ChromeDriver driver = new ChromeDriver();
        String url = "http://google.com";

        String url2 = "http://amazon.com";
        //Let's open google.com
        //if i want to maximize browser
        driver.manage().window().maximize();
        driver.get("http://google.com");
        //will put on hold current run on 3 seconds
        Thread.sleep(3000);

        //Test1: Verify that title of the page is a "Google"
        //to read page title
        String actualResult = driver.getTitle();
        String expectedResult = "Google";
        if (actualResult.equals(expectedResult)) {
            System.out.println(expectedResult);
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        Thread.sleep(3000);
        //We want to navigate to the different page,with in same browser
        //we are not gonna open new browser or page
        //url can be passed as an object or as a string
        driver.navigate().to(url2);
        String title=driver.getTitle();
        System.out.println(title);

        //if I want to comeback, to the previous page
        driver.navigate().back();
        //if I want to go forward
        driver.navigate().forward();
        //If I wanr to refresh the page
        driver.navigate().refresh();

        //If I want to know URL of current website
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        /*
        to close the browser at the end of the test execution
        if we opened  a gate - we need to close it.

        Selenium cannot close browser automatically for this, use method close
         */
        driver.close();
    }
}
