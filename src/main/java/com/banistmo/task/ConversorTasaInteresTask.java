package com.banistmo.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banistmo.userInterface.ConversorTasaInteresUserInterface.*;
import static com.banistmo.utils.enums.ConversorTasaInteresEnum.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.banistmo.interactions.SelectElementFromList;

public class ConversorTasaInteresTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(TITULO_CONVERSOR_TASA_INTERES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CALCULAR),
                WaitUntil.the(INTERES, isPresent()),
                Enter.theValue(TASA_INTERES_ENUM.getDataTasaInteres()).into(INTERES),
                SelectElementFromList.fromList(PERIODICIDAD, ANUAL.getDataTasaInteres()),
                SelectElementFromList.fromList(CAPITALIZACION, MENSUAL.getDataTasaInteres())
        );
    }

    public static ConversorTasaInteresTask on() {
        return Instrumented.instanceOf(ConversorTasaInteresTask.class).withProperties();
    }
}