package com.banistmo.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuHerramientasUserInterface {
    public static final Target TITULO_BANCOLOMBIA = Target.the("Titulo Herramientas negocio")
            .locatedBy("//img[@aria-label=\"ir a personas bancolombia\"]");
    public static final Target NEGOCIOS = Target.the("Opcion Negocios")
            .located(By.id("header-pymes"));
    public static final Target SOLUCIONES_NO_FINANCIERAS = Target.the("Opcion Soluciones no financieras")
            .located(By.id("menu-productos-finan"));
    public static final Target HERRAMIENTAS = Target.the("Opcion Herramientas")
            .located(By.id("linkherramientas"));

}