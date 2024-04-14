package test2Avito.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AvitoCareEcoImpactPage {

    //public SelenideElement co2Counter = $("#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(2) > div > div.desktop-value-Nd1tR");

    public String co2Counter = "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(2) > div > div.desktop-value-Nd1tR";

    public SelenideElement litersWaterCounter = $("#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(4) > div > div.desktop-value-Nd1tR");

    public SelenideElement energyCounter = $("#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(6) > div > div.desktop-value-Nd1tR");

}
