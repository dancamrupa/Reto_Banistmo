package com.banistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectElementFromList implements Interaction {

    private final Target selectElement;
    private final String optionText;

    public SelectElementFromList(Target selectElement, String optionText) {
        this.selectElement = selectElement;
        this.optionText = optionText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement select = selectElement.resolveFor(actor);

        List<WebElement> options = select.findElements(By.tagName("option"));

        options.removeIf(option -> option.getText().equals("Selecciona"));

        WebElement selectedOption = null;
        for (WebElement option : options) {
            if (option.getText().equals(optionText)) {
                selectedOption = option;
                break;
            }
        }

        if (selectedOption != null) {
            selectedOption.click();
        } else {
            throw new IllegalArgumentException("Opción no encontrada: " + optionText);
        }
    }

    public static SelectElementFromList fromList(Target selectElement, String optionText) {
        return new SelectElementFromList(selectElement, optionText);
    }
}