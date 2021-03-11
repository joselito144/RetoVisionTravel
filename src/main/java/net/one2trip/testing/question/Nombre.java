package net.one2trip.testing.question;

import net.one2trip.testing.ui.One2TripPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Nombre implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        //actor.attemptsTo(WaitUntil.the(One2TripPage.TITULO_DETALLE, isEnabled()));
        return  Text.of(One2TripPage.TITULO_DETALLE).viewedBy(actor).asString();
    }

    public static Question<String> paquete() {
        return new Nombre();
    }
}
