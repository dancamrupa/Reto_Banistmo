package com.banistmo.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConversorTasaInteresUserInterface {

    public static final Target TITULO_CONVERSOR_TASA_INTERES = Target.the("Titulo Converson tasa interes")
            .locatedBy("//h1[contains(text(),'Conversor de tasas ')]");
    public static final Target BOTON_CALCULAR = Target.the("Boton calcular de tasa nominal a tasa efectiva")
            .located(By.id("btntoolUno"));
    public static final Target INTERES = Target.the("Campo Interes")
            .located(By.id("interes"));
    public static final Target PERIODICIDAD = Target.the("Lista Periodicidad")
            .located(By.id("periodicidad-deseada"));
    public static final Target CAPITALIZACION = Target.the("Lista Capitalizacion")
            .located(By.id("capitalizacion"));
    public static final Target PORCENTAJE = Target.the("Valor Porcentaje")
            .locatedBy("//h3[@id='respuesta']");
}