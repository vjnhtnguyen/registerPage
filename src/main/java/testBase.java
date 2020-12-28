package main.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase {
    public static WebDriver wd;
    public static WebDriverWait wait;

    @BeforeSuite
    public void initChrome() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");

        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wait = new WebDriverWait(wd, 600);
    }

    @AfterSuite
    public void quitChrome() {
        wd.close();
        wd.quit();
    }

    public void checkPageIsReady() {
        JavascriptExecutor js = (JavascriptExecutor) wd;
        if (js.executeScript("return document.readyState").toString().equals("complete")) {
            return;
        }
        for (int i = 0; i < 25; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")) {
                break;
            }
        }
    }

    public void waitElement(WebElement element) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.visibilityOf(element));
//        for (int i = 0; i < 20; i++) {
//            if (element.isDisplayed()) {
//                break;
//            }
//            Thread.sleep(1000);
//        }
//        throw
    }

    public void waitAndClick(WebElement element) throws InterruptedException {
        waitElement(element);
        element.click();

    }

    public void scrollIntoView(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) wd).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

    }
}