package com.banistmo.stepDefinitions;

import com.banistmo.driver.WebDriverSetup;
import com.banistmo.task.ConversorTasaInteresTask;
import com.banistmo.task.HerramientasNegocioTask;
import com.banistmo.task.MenuHerramientasTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static com.banistmo.utils.GlobalData.URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class tasaNominalEfectivaStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("ingreso a la pagina de Bancolombia")
    public void ingresoALaPaginaDeBancolombia() {
        WebDriverSetup.withChromeOptions();
        theActorCalled("CamiloRuiz").can(BrowseTheWeb.with(WebDriverSetup.on(URL)));
    }

    @When("ingreso a la seccion de tasa nominal a tasa efectiva")
    public void ingresoALaSeccionSeTasaNominalATasaEfectiva() {
        OnStage.theActorCalled("CamiloRuiz").attemptsTo(
                MenuHerramientasTask.on(),
                HerramientasNegocioTask.on(),
                ConversorTasaInteresTask.on()
        );
    }

    @Then("puedo visualizar el porcentaje de la tasa nominal efectiva")
    public void puedoVisualizarElPorcentajeDeLaTasaNominalEfectiva() {
       //Ensure.that(PORCENTAJE).text().isEqualTo(PORCENTAJE_TASA_NOMINAL_EFECTIVA.getDataTasaInteres());
    }
}