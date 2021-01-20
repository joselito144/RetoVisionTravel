package net.one2trip.testing.task;


import net.one2trip.testing.ui.One2TripPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class In implements Task {
    PageObject page;

    public In(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static In inTo(One2TripPage automationDemoPage) {
        return instrumented(In.class, automationDemoPage);
    }
}
