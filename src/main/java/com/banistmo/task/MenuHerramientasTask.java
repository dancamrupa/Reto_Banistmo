package com.banistmo.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banistmo.userInterface.MenuHerramientasUserInterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MenuHerramientasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(TITULO_BANCOLOMBIA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NEGOCIOS),
                WaitUntil.the(SOLUCIONES_NO_FINANCIERAS, isPresent()),
                Click.on(SOLUCIONES_NO_FINANCIERAS),
                Click.on(HERRAMIENTAS)
        );
    }

    public static MenuHerramientasTask on() {
        return Instrumented.instanceOf(MenuHerramientasTask.class).withProperties();
    }
}