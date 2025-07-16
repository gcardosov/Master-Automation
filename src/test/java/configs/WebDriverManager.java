package configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "/home/gcardoso/Documentos/Driver/chromedriver-linux64/chromedriver");

            ChromeOptions options = new ChromeOptions();

            // Opciones para hacerlo menos detectable
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            options.setExperimentalOption("useAutomationExtension", false);
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);
        }
        return driver;
    }
}