package net.one2trip.testing.task;

import net.one2trip.testing.ui.One2TripPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Search implements Task {
    private static final Target TITULO_PLAN = Target.the("Titulo plan").located(By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/div[1]/app-package-listing[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/app-list-card[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
    private String planElegido;

    @Step("{0} elige el plan: " )
    @Override
    public <T extends Actor> void performAs(T actor) {

        //this.planElegido = Text.of(TITULO_PLAN).toString();
        actor.attemptsTo(WaitUntil.the(One2TripPage.BOTON_INVITADO, isVisible()),
                Click.on(One2TripPage.BOTON_INVITADO),
                Click.on(One2TripPage.PESTANIA_PAQUETES),
                Click.on(One2TripPage.LINK_AQUI),
                Click.on(One2TripPage.BOTON_VER_MAS),
                WaitUntil.the(One2TripPage.BOTON_VER_DETALLE, isEnabled()),
                Click.on(One2TripPage.BOTON_VER_DETALLE),
                WaitUntil.the(One2TripPage.TITULO_DETALLE, isEnabled()));

    }

    public static Search packageFor(String title)  {
        return instrumented(Search.class, title);
    }
}
