import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    public static void main(String[] args) {
        System.out.println("Teszt");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //WebDriver driver = new ChromeDriver();
        //driver.get("https://selenide.org/");

        Configuration.browser = "chrome";
        open("https://selenide.org/");

    }
}
