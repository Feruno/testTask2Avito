package test2Avito.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AvitoCareEcoImpactPage {

    public String co2Counter(){
        return "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(2) > div > div.desktop-value-Nd1tR";
    }
    public String litersWaterCounter(){
        return "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(4) > div > div.desktop-value-Nd1tR";
    }
    public String energyCounter(){
        return "#app > div > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div > div.desktop-impact-items-F7T6E > div:nth-child(6) > div > div.desktop-value-Nd1tR";
    }
}
