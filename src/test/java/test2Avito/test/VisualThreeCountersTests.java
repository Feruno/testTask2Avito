package test2Avito.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;

import test2Avito.data.DataGenerator;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class VisualThreeCountersTests {

    @BeforeEach
    void setUp() {
        Configuration.timeout = 20000;
        Configuration.reportsFolder = "src/test/resources/output";
        //Configuration.fastSetValue = true;
    }

    @Test
    void windowResolution1920x1080(TestInfo info) {

        Configuration.browserSize="1920x1080";
        open("https://www.avito.ru/avito-care/eco-impact");

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1366x768(TestInfo info) {

        Configuration.browserSize ="1366x768";
        open("https://www.avito.ru/avito-care/eco-impact");

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1536x864(TestInfo info) {

        Configuration.browserSize = "1536×864";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 60000;

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }


    @Test
    void windowResolution1024x768(TestInfo info) {

        Configuration.browserSize="1024x768";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 60000;

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1920x1080CounterSetValues(TestInfo info) {

        var co2Counter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(2) > div > div.desktop-value-Nd1tR";

        var litersWaterCounter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(4) > div > div.desktop-value-Nd1tR";

        var energyCounter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(6) > div > div.desktop-value-Nd1tR";

        var counterValues = DataGenerator.randValues();

        Configuration.browserSize="1920x1080";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 60000;


        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver() ;
        jse.executeScript("document.querySelector(' " + co2Counter + " ').innerHTML = ' " + counterValues + " ';");
        jse.executeScript("document.querySelector(' " + litersWaterCounter + " ').innerHTML = ' " + counterValues + " ';");
        jse.executeScript("document.querySelector(' " + energyCounter + " ').innerHTML = ' " + counterValues + " ';");

        //jse.executeScript("document.querySelectorAll('//div[text()[contains(.,'не попало в атмосферу')]]/..//div[text()[contains(.,'0')]]').innerHTML = '123';");

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1920x1080CounterSetValuesDouble(TestInfo info) {

        var co2Counter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(2) > div > div.desktop-value-Nd1tR";

        var litersWaterCounter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(4) > div > div.desktop-value-Nd1tR";

        var energyCounter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(6) > div > div.desktop-value-Nd1tR";

        var counterValuesDouble = DataGenerator.randValuesDouble();

        Configuration.browserSize="1920x1080";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 60000;


        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver() ;
        jse.executeScript("document.querySelector(' " + co2Counter + " ').innerHTML = ' " + counterValuesDouble + " ';");
        jse.executeScript("document.querySelector(' " + litersWaterCounter + " ').innerHTML = ' " + counterValuesDouble + " ';");
        jse.executeScript("document.querySelector(' " + energyCounter + " ').innerHTML = ' " + counterValuesDouble + " ';");

        //jse.executeScript("document.querySelectorAll('//div[text()[contains(.,'не попало в атмосферу')]]/..//div[text()[contains(.,'0')]]').innerHTML = '123';");

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1920x1080CounterSetValuesDoubleManual(TestInfo info) {

        var co2Counter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(2) > div > div.desktop-value-Nd1tR";

        var litersWaterCounter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(4) > div > div.desktop-value-Nd1tR";

        var energyCounter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(6) > div > div.desktop-value-Nd1tR";

        var counterValuesDouble = 10.777;

        Configuration.browserSize="1920x1080";
        open("https://www.avito.ru/avito-care/eco-impact");

        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver() ;
        jse.executeScript("document.querySelector(' " + co2Counter + " ').innerHTML = ' " + counterValuesDouble + " ';");
        jse.executeScript("document.querySelector(' " + litersWaterCounter + " ').innerHTML = ' " + counterValuesDouble + " ';");
        jse.executeScript("document.querySelector(' " + energyCounter + " ').innerHTML = ' " + counterValuesDouble + " ';");

        //jse.executeScript("document.querySelectorAll('//div[text()[contains(.,'не попало в атмосферу')]]/..//div[text()[contains(.,'0')]]').innerHTML = '123';");

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @AfterEach
    void setUpe() {
        Selenide.closeWebDriver();
    }
}
