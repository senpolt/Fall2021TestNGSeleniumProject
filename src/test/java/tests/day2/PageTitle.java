package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
    public static void main(String[] args) throws Throwable{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().fullscreen();
        //Thread.sleep(3000);
        driver.get("http://google.com");
        Thread.sleep(2000);
//        driver.manage().window().fullscreen();
//        Thread.sleep(3000);
        String actualResult =driver.getTitle();
        String expectedResult ="Google";
        if(expectedResult.equals(actualResult)){
            System.out.println(actualResult);
            System.out.println("Test passed");
        }else
            System.out.println("Test failed");

        driver.close();
    }
}
