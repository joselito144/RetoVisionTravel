package net.one2trip.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://test.one2trip.net/")
public class One2TripPage extends PageObject {

    public static final Target BOTON_INVITADO = Target.the("Continuar como invitado").located(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-ita[1]/div[1]/div[1]/div[4]/div[2]/input[1]"));
    public static final Target PESTANIA_PAQUETES = Target.the("Pestaña paquetes").located(By.xpath("//span[contains(text(),'Paquetes')]"));
    public static final Target LINK_AQUI = Target.the("Aqui").located(By.xpath("//a[contains(text(),'AQU')]"));
    public static final Target BOTON_VER_MAS = Target.the("Ver mas").located(By.xpath("//span[contains(text(),'VER M')]"));
    public static final Target BOTON_VER_DETALLE = Target.the("Ver Detalle").located(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/div[1]/app-package-listing[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/app-list-card[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]"));
    public static final Target TITULO_DETALLE = Target.the("Titulo Detalle").located(By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/div[1]/app-package-details[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
}
