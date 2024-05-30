package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

    @Test
    public void openEdge() throws  InterruptedException{
        WebDriver eDriver = new EdgeDriver();
        eDriver.get("https://www.google.com");
        eDriver.manage().window().maximize();
        Thread.sleep(10000);
        eDriver.manage().window().minimize();
        Thread.sleep(10000);
        eDriver.quit();
    }
}
