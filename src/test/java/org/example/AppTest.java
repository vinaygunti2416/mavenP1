package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class AppTest
{
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setupdrive(String browser,String link)
    {
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        driver.get(link);
        driver.manage().window().maximize();
    }



    @Test
    void dropdownmethod()throws InterruptedException{

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/select[1]/option[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/select[2]/option[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/select[3]/option[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[3]/div/div/label[2]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/input[3]")).click();
        Thread.sleep(3000);

    }


    @AfterClass
    void driveclose(){
        driver.close();
    }

}
