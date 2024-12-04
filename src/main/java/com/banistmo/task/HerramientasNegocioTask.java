package com.banistmo.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banistmo.userInterface.HerramientasNegocioUserInterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HerramientasNegocioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(TITULO_HERRAMIENTAS_NEGOCIO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SIGUIENTE_SLIDE),
                Click.on(OPCION_GESTIONAR_MIS_FINANZAS),
                Click.on(OPCION_CONVERTIDOR_TASA_INTERES)
        );
    }

    public static HerramientasNegocioTask on() {
        return Instrumented.instanceOf(HerramientasNegocioTask.class).withProperties();
    }
}