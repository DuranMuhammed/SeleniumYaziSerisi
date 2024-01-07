package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorsExercise {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        driver.get("https://www.saucedemo.com");
//        locateByIdWithCSS(driver);
//        locateByClassWithCSS(driver);
//        locateByOthersWithCSS(driver);
        locateByCombinations(driver);
        Thread.sleep(2000);
        locateByParentChild(driver);
        locateBySubstringText(driver);
        Thread.sleep(2000);
        goToCartPage(driver);
        Thread.sleep(3000);
        driver.quit();
    }
    public static void locateByIdWithCSS(WebDriver driver){
//        driver.findElement(By.cssSelector("a[id='idExample']")).click();
        driver.findElement(By.cssSelector("a#idExample")).click();
//        driver.findElement(By.cssSelector("#idExample")).click();

    }

    public static void locateByClassWithCSS(WebDriver driver){
        driver.findElement(By.cssSelector("button.buttonClass")).click();
    }

    public static void locateByOthersWithCSS(WebDriver driver){
        driver.findElement(By.cssSelector("button[name=button1]")).click();
    }

    public static void locateByCombinations(WebDriver driver)  {
        driver.findElement(By.cssSelector("input#user-name[placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input.form_input[name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input#login-button")).click();
    }

    public static void locateByParentChild(WebDriver driver){
        driver.findElement(By.cssSelector("div.inventory_list>div:nth-child(2) button")).click();
    }

    public static void locateBySubstringText(WebDriver driver){
        driver.findElement(By.cssSelector("button[id^='add-to-cart-test']")).click();
        driver.findElement(By.cssSelector("button[id$='onesie']")).click();
        driver.findElement(By.cssSelector("button[id*='bolt']")).click();
    }

    public static void goToCartPage(WebDriver driver){
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
    }

}