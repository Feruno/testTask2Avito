package test2Avito.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;

import test2Avito.data.DataGenerator;
import test2Avito.page.AvitoCareEcoImpactPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class VisualThreeCountersTests {

    @BeforeEach
    void setUp() {
        Configuration.reportsFolder = "src/test/resources/output";
        //Configuration.fastSetValue = true;
    }

    @Test
    void windowResolution1920x1080(TestInfo info) {

        Configuration.browserSize = "1920x1080";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 20000;

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1366x768(TestInfo info) {

        Configuration.browserSize = "1366x768";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 20000;

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1536x864(TestInfo info) {

        Configuration.browserSize = "1536×864";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 20000;

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }


    @Test
    void windowResolution1024x768(TestInfo info) {

        Configuration.browserSize = "1024x768";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 20000;

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        String pngFileName = screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1920x1080CounterSetValues(TestInfo info) {

        var avitoCareEcoImpactPage = new AvitoCareEcoImpactPage();

        var counterValues = DataGenerator.randValues();

        Configuration.browserSize = "1920x1080";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 20000;


        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.co2Counter() + " ').innerHTML = ' " + counterValues + " ';");
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.litersWaterCounter() + " ').innerHTML = ' " + counterValues + " ';");
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.energyCounter() + " ').innerHTML = ' " + counterValues + " ';");

        //jse.executeScript("document.querySelectorAll('//div[text()[contains(.,'не попало в атмосферу')]]/..//div[text()[contains(.,'0')]]').innerHTML = '123';");

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1920x1080CounterSetValuesDouble(TestInfo info) {

        var avitoCareEcoImpactPage = new AvitoCareEcoImpactPage();

        var counterValuesDouble = DataGenerator.randValuesDouble();

        Configuration.browserSize = "1920x1080";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 20000;


        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.co2Counter() + " ').innerHTML = ' " + counterValuesDouble + " ';");
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.litersWaterCounter() + " ').innerHTML = ' " + counterValuesDouble + " ';");
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.energyCounter() + " ').innerHTML = ' " + counterValuesDouble + " ';");

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        screenshot(info.getTestMethod().get().getName());
    }

    @Test
    void windowResolution1920x1080CounterSetValuesDoubleManual(TestInfo info) {

        var avitoCareEcoImpactPage = new AvitoCareEcoImpactPage();

        var counterValuesDouble = 10.777;

        Configuration.browserSize = "1920x1080";
        open("https://www.avito.ru/avito-care/eco-impact");
        Configuration.timeout = 20000;

        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.co2Counter() + " ').innerHTML = ' " + counterValuesDouble + " ';");
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.litersWaterCounter() + " ').innerHTML = ' " + counterValuesDouble + " ';");
        jse.executeScript("document.querySelector(' " + avitoCareEcoImpactPage.energyCounter() + " ').innerHTML = ' " + counterValuesDouble + " ';");

        $(".desktop-impact-items-F7T6E").scrollIntoView("{block: \"end\"}");

        screenshot(info.getTestMethod().get().getName());
    }

    @AfterEach
    void setUpe() {
        Selenide.closeWebDriver();
    }
}
