package org.example;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    @Test

    public void Test()
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.github.com/login");

        driver.findElement(By.id("ujehbh")).sendKeys("newthing");

        driver.findElement(By.name("kaka")).sendKeys("mamamia");

        driver.findElement(By.className("kuyya"));

        driver.findElement(By.linkText("forgot password"));

        driver.findElement(By.tagName("h1"));


    }

    public static void highlight(WebDriver driver , WebElement element)
    {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('style', 'background: blue;')", element);
    }
}