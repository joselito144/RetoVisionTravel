package net.one2trip.testing.task;

import net.one2trip.testing.ui.One2TripPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Search implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(One2TripPage.BOTON_INVITADO, isVisible()),
                Click.on(One2TripPage.BOTON_INVITADO),
                Click.on(One2TripPage.PESTANIA_PAQUETES),
                Click.on(One2TripPage.LINK_AQUI),
                Click.on(One2TripPage.BOTON_VER_MAS),
                Click.on(One2TripPage.BOTON_VER_DETALLE));

    }

    public static Search packageFor(String title)  {
        return instrumented(Search.class, title);
    }
}
