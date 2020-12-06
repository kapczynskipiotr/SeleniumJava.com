package seleniumGridJunit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;
    public Base(){
            System.out.println("XD");
    }
    public static void initialization(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piotrek\\IdeaProjects\\SeleniumJava.com\\src\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

}
