package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HandlingSelectionElements {

    private static WebDriverWait wait;

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/automation-practice-form");

        sleep(2);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,250)"); // 250px scroll vertically

        WebElement sportsCheckboxLabel = driver.findElement(By.xpath(
                "//label[text()='Sports']"));
        clickWithSafeCheck(sportsCheckboxLabel, driver);
        WebElement readingCheckboxLabel = driver.findElement(By.xpath(
                "//label[text()='Reading']"));
        clickWithSafeCheck(readingCheckboxLabel, driver);
        WebElement musicCheckboxLabel = driver.findElement(By.xpath(
                "//label[text()='Music']"));
        clickWithSafeCheck(musicCheckboxLabel, driver);

        sleep(3);

        WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
        clickWithSafeCheck(maleRadioButton, driver);

        sleep(3);
        driver.quit();
    }


    private static void clickWithSafeCheck(WebElement clickableElement, WebDriver driver) {
        if (clickableElement.isEnabled() && clickableElement.isDisplayed()) {
            WebElement element;
            String valueName;
            if (clickableElement.getTagName().equals("label")){
                element = driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(clickableElement));
                valueName = clickableElement.getText();
            }else {
                element = clickableElement;
                valueName = clickableElement.getAttribute("value");
            }
            System.out.printf("%s " + "before click: " + element.isSelected() + "%n", valueName);
            clickableElement.click();
            System.out.printf("%s " + "after click: " + element.isSelected() + "%n", valueName);
        } else {
            System.out.println("Element is neither displayed nor enabled");
        }
    }
    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
