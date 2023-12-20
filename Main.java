package org.example;

import dev.failsafe.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;
import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        locateElements();
    }

    public static void locateElements() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.linkedin.com/home");
//        driver.findElement(By.id("session_key")).sendKeys("OlricinSeleniumYolculugu");
//        driver.findElement(By.id("session_password")).sendKeys("ParolaÖzeldir :)");
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        driver.findElement(By.name("session_key")).sendKeys("OlricinSeleniumYolculugu");
//        driver.findElement(By.name("session_password")).sendKeys("ParolaÖzeldir :)");

        /*driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("Olric");
        driver.findElement(By.name("password")).sendKeys("****");*/


        /*int countOfTextInput = driver.findElements(By.className("text-input")).size();
        System.out.println(countOfTextInput);*/

        /*driver.get("https://www.google.com.tr/?hl=tr");
        driver.findElement (By.className("gLFyf")).sendKeys("Selam Google");*/

        /*driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement (By.tagName("input")).sendKeys("6");*/

        /*driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.findElement (By.linkText("Example 1: Element on page that is hidden")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        Thread.sleep(2500);
        driver.findElement(By.partialLinkText("Example 2")).click();*/

        /*driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("Olric");
        driver.findElement(By.name("password")).sendKeys("****");*/


        driver.get("https://www.linkedin.com/home");
        driver.findElement(By.id("session_key")).sendKeys("OlricinSeleniumYolculugu");
        driver.findElement(By.id("session_password")).sendKeys("ParolaÖzeldir :)");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //        driver.quit();
    }
}