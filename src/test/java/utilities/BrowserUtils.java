package utilities;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.logger.Log;

import static org.junit.jupiter.api.Assertions.*;

public class BrowserUtils {

    static Log log=new Log();
    static Actions actions=new Actions(Driver.getDriver());

    public static void sleep(int second){
        second *=1000;
        log.info("statik bekleme kullandınız.....!!!!");
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){
            log.info("Uyurkan problem oldu");
        }
    }

    public static void verifyTitle(String expectedTitle){

        assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }
    public static void containsUrl(String str){

        sleep(5);
        assertTrue(Driver.getDriver().getCurrentUrl().contains(str));

    }
    public static void hover(WebElement element){
      actions.moveToElement(element).pause(1000).perform();
    }
}
