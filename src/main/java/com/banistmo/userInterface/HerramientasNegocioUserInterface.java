package com.banistmo.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HerramientasNegocioUserInterface {

    public static final Target TITULO_HERRAMIENTAS_NEGOCIO = Target.the("Titulo Herramientas negocio")
            .locatedBy("//h1[contains(text(),'Herramientas para tu negocio')]");
    public static final Target BOTON_SIGUIENTE_SLIDE = Target.the("Boton Siguiente slide")
            .locatedBy("//div[@aria-label=\"Next slide\"]");
    public static final Target OPCION_GESTIONAR_MIS_FINANZAS = Target.the("Opcion gestionar mis finanzas")
            .locatedBy("//a[contains(text(),'Gestionar las finanzas de mi negocio')]");
    public static final Target OPCION_CONVERTIDOR_TASA_INTERES = Target.the("Opcion Convertidor tasa interes")
            .locatedBy("//h5[contains(text(),'Convertidor de tasas de interés')]");

}