package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathLocatorsExercise {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       /* driver.get("https://www.google.com.tr/?hl=tr");
        WebElement searchBox = locateElementByAbsoluteXpath(driver);
        Thread.sleep(2000);
        searchBox.clear();
        Thread.sleep(2000);
        searchBox = locateElementByRelativeXpath(driver);
        Thread.sleep(2000);
        searchBox.clear();

        driver.navigate().to("https://www.saucedemo.com");
        loginByXpath(driver);
        locateElementsByXPathPredicates(driver);*/

       /* driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        locateElementsByXPathAxes(driver);*/

        driver.navigate().to("https://www.saucedemo.com");
        loginByXpath(driver);
        locateElementsByXPathMethods(driver);
        locateElementsByXPathOperators(driver);
        //driver.quit();
    }

    public static WebElement locateElementByAbsoluteXpath(WebDriver driver){
        WebElement searchBox = driver.findElement(By.xpath(
                "/html/body/div[1]/div[3]/form/div[1]/div/div[1]/div[1]/div[2]/div/textarea"));
        searchBox.sendKeys("Selenium XPath Kullanımı");
        return searchBox;
    }

    public static WebElement locateElementByRelativeXpath(WebDriver driver) {
        By relativeXPath1 = By.xpath("//textarea[@class='gLFyf']");
        By relativeXPath2 = By.xpath("//form/div[1]/div/div[1]/div[1]/div[2]/div/textarea");
        By relativeXPath3 = By.xpath("//form//textarea");;
        By relativeXPath4 = By.xpath("//div[@class='DPXIy']/textarea");

        WebElement searchBox;
        searchBox = driver.findElement(relativeXPath1);
        System.out.println("Is Relative XPath1 displayed? / Answer : " + searchBox.isDisplayed());
        searchBox = driver.findElement(relativeXPath2);
        System.out.println("Is Relative XPath2 displayed? / Answer : " + searchBox.isDisplayed());
        searchBox = driver.findElement(relativeXPath3);
        System.out.println("Is Relative XPath3 displayed? / Answer : " + searchBox.isDisplayed());
        searchBox = driver.findElement(relativeXPath4);
        System.out.println("Is Relative XPath4 displayed? / Answer : " + searchBox.isDisplayed());
        searchBox.sendKeys("Selenium XPath Kullanımı");
        return searchBox;
    }

    public static void loginByXpath(WebDriver driver){
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@name='login-button']")).click();
    }

    public static void locateElementsByXPathPredicates(WebDriver driver){
        driver.findElement(By.xpath(
                "//div[@class='inventory_list']/div[position()='3']//button")).click();
        driver.findElement(By.xpath(
                "//div[@class='inventory_list']/div[last()]//button")).click();
    }

    public static void locateElementsByXPathAxes(WebDriver driver){
        System.out.println(driver.findElement(By.xpath(
                "//table[@id='customers']//child::tr[5]/child::td[2]")).getText());
        System.out.println(driver.findElement(By.xpath(
                "//table[@id='customers']/descendant::th[2]")).getText());
        System.out.println(driver.findElement(By.xpath(
                "//table[@id='customers']/descendant::th[2]/parent::tr")).getTagName());
        System.out.println(driver.findElement(By.xpath(
                "//table[@id='customers']//child::tr[5]/child::td[2]/ancestor::table")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath(
                "//table[@id='customers']//child::tr[5]/child::td[2]/following-sibling::td")).getText());
        System.out.println(driver.findElement(By.xpath(
                "//table[@id='customers']//child::tr[5]/child::td[2]/preceding-sibling::td")).getText());
    }

    public static void locateElementsByXPathMethods(WebDriver driver){
        List<WebElement> priceList = driver.findElements(By.xpath("//div[contains(@class,'item_price')]"));
        priceList.forEach(s-> System.out.println(s.getText()));
        System.out.printf("----------------------------%n");
        /*for (WebElement price : priceList)
        {
            System.out.println(price.getText());
        }*/

        driver.findElement(By.xpath(
                "//div[text()='Sauce Labs Fleece Jacket']/following::button")).click();
    }

    public static void locateElementsByXPathOperators(WebDriver driver){
        driver.findElement(By.xpath(
                "//button[contains(@class,'btn_inventory') and contains(@id,'onesie')]")).click();
        driver.findElement(By.xpath(
                "//a[contains(@href,'linkedin') or text()='LinkedIn']")).click();
    }


}
