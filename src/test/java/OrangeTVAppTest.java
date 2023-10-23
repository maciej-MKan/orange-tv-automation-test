import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class OrangeTVAppTest {
    private static AppiumDriver driver;

    @BeforeAll
    public static void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("123")
                .setApp("./app.apk")
                ;
        driver = new AndroidDriver(
                new URL("http://127.21.0.2:4723"), options
        );
    }

    @Test
    public void entryApp(){
        driver.getStatus();
    }

    @Test
    public void testAppLoad() {
        // Weryfikacja poprawnego załadowania aplikacji
    }

    @Test
    public void testVodBanners() {
        // Policzenie i wypisanie na konsoli ile różnych banerów VOD
    }

    @Test
    public void testOpenRecommendedMovie() {
        // Otwarcie 4. filmu z listy "polecane dla Ciebie"
    }

    @Test
    public void testActorsOrder() {
        List<WebElement> actors = driver.findElements(By.id("new UiSelector().resourceIdMatches(\".*id/actorName\")"));
        actors.stream()
                .map(WebElement::getText)
                .sorted()
                .forEach(System.out::println);
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}

