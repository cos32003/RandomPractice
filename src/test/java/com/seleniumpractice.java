package PracticeCoding;

import groovyjarjarantlr.Tool;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sun.reflect.misc.FieldUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Files;
import java.sql.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class seleniumpractice {
    @Test
public void test() throws InterruptedException, AWTException, SQLException {
        WebDriver ChromeWebdriver = new ChromeDriver();
        String url = "https://www.google.com";
        ChromeWebdriver.get(url);
        Thread.sleep(5000);
        ChromeWebdriver.quit();

        //authentication popup
        String username = "admin";
        String password = "passrod";
        ChromeWebdriver.get("https://"+username+":"+password+"@"+"xxx/basic_auth");

        //explicit wait
        WebDriverWait webDriverWait = new WebDriverWait(ChromeWebdriver, Duration.ofSeconds(120));
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("xxx")));

        //Enter text SendKeys()

            //Without using SendKeys(), we can use javascript executer
            JavascriptExecutor js = (JavascriptExecutor) ChromeWebdriver;
            js.executeScript("document.getElementById('xxx').value='xxx';");

            //reset the value
            ChromeWebdriver.findElement(By.id("xxx")).clear();
            String text = ChromeWebdriver.findElement(By.id("xxx")).getText();

            //get attribute value
            String attribute = ChromeWebdriver.findElement(By.id("xxx")).getAttribute("xxx");
            //get title
            String title = ChromeWebdriver.getTitle();
            //submit html form
            ChromeWebdriver.findElement(By.id("xxx")).submit();
            //launch url
        ChromeWebdriver.navigate().to("https://www.google.com");
        //refresh page
        ChromeWebdriver.navigate().refresh();
        //back
        ChromeWebdriver.navigate().back();
        //forward
        ChromeWebdriver.navigate().forward();
        //get current url
        String currentUrl = ChromeWebdriver.getCurrentUrl();
        //get page source
String pageSource = ChromeWebdriver.getPageSource();
//max windows
        ChromeWebdriver.manage().window().maximize();
        //delete cookie
        ChromeWebdriver.manage().deleteAllCookies();
        //get the cookie
        Set<Cookie> cookieSet = ChromeWebdriver.manage().getCookies();
        for(Cookie cookie:cookieSet){
            System.out.println(cookie.getName());
        }
        //get windows handle and switch to child window. Get windowsid
        Set<String> windowshandles = ChromeWebdriver.getWindowHandles();
        Iterator<String> iterator = windowshandles.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();
        //driver.close(). driver.quit(), the different is driver.close() close the current window and driver.quit() close all the windows. Also driver.close() then report invalidsessionid, driver.quit() then report sessionid is null

        //findelement(),findelements(). When there is no element found, findelement() return noelementfound exception.
        WebElement item = ChromeWebdriver.findElement(By.id("xxx"));
        List<WebElement> items = ChromeWebdriver.findElements(By.id("xxx"));

        //if object is presence on multiple pages, we can use findelements() to find all the elements and then use for loop to find the element we want
List<WebElement> elements = ChromeWebdriver.findElements(By.xpath("xxx"));

if (elements.size()>0){
    for(WebElement element:elements){
        if(element.isDisplayed()){
            element.click();
            break;
        }
    }

}
//handle js alert/popup
        Alert alert = ChromeWebdriver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.sendKeys("xxx");
        alert.getText();
        // use robot class to simulate keyboard and mouse action
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.mouseMove(100,100);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //upload file popup
        ChromeWebdriver.get("https://xxx/fup.html");
        ChromeWebdriver.findElement(By.id("xxx")).sendKeys("xxx/xxx/xxx.txt");

        //how to handle multiple browser windows popup.

        Set<String> windowshandles1 = ChromeWebdriver.getWindowHandles();
        Iterator<String> iterator1 = windowshandles.iterator();
        String parentwindow1 = iterator.next();
        String childwindow1 = iterator.next();
        ChromeWebdriver.switchTo().window(childwindow1);
        ChromeWebdriver.close();

        //how to handle database connection
        String url_database = "jdbc:mysql://xxx:3306/xxx";
        String username_database = "xxx";
        String password_database = "xxx";
        Connection connection = DriverManager.getConnection(url_database,username_database,password_database);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from xxx");
        while(resultSet.next()){
            System.out.println(resultSet.getString("xxx"));
        }
        connection.close();
        
        //how to handle Ajax. Ajax is asynchronous javascript and xml. Ajax is used to update the page without reloading.
        //Use explicit wait to wait for the element to be visible
        WebElement AjaxElement = (new WebDriverWait(ChromeWebdriver,Duration.ofSeconds(120))).until(ExpectedConditions.visibilityOfElementLocated(By.id("xxx")));
        //take screenshot
        File screenshot = ((TakesScreenshot) ChromeWebdriver).getScreenshotAs(OutputType.FILE);
        //copy file screenshot to the destination
        //FileUtils.copyFile(screenshot, new File("xxx/xxx/xxx.png"));

        //how to handle mouse over action on a submenu option under a header menu
        WebElement headermenu = ChromeWebdriver.findElement(By.id("xxx"));
        Actions action = new Actions(ChromeWebdriver);
        action.moveToElement(headermenu).build().perform();
        Thread.sleep(5000);
        ChromeWebdriver.findElement(By.id("xxx")).click();

        //how to resolve SSL certificate issue in firefox
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        firefoxOptions.merge(desiredCapabilities);
        WebDriver webDriver = new FirefoxDriver(firefoxOptions);

        //webdriver is an interface, ChromeDriver, FirefoxDriver, InternetExplorerDriver, SafariDriver, OperaDriver, EdgeDriver are classes that implement the interface
        WebDriver driver;
        String browser = "chrome";
        if(browser.equals("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            driver = new FirefoxDriver();
        }
        else if(browser.equals("ie")){
            driver = new InternetExplorerDriver();
        }
        else{
            driver = new SafariDriver();
        }








    }
}
