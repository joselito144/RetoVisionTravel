package net.one2trip.testing.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.one2trip.testing.question.Nombre;
import net.one2trip.testing.task.In;
import net.one2trip.testing.task.Search;
import net.one2trip.testing.ui.One2TripPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
public class SearchPackageDefinitions {

    One2TripPage one2TripPage;

    @Managed(driver = "chrome")
    WebDriver herBrowser;

    Actor user = Actor.named("User");
    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(herBrowser));
        herBrowser.manage().window().maximize();
    }

    @Given("^User enters one(\\d+)trip site page$")
    public void userEntersOneTripSitePage(int page) throws Exception {
        user.wasAbleTo(In.inTo(one2TripPage));
    }


    @When("^he is looking for vacation package \"([^\"]*)\"$")
    public void heIsLookingForVacationPackage(String title) throws Exception {
        user.attemptsTo(Search.packageFor(title));
    }

    @Then("^He sees in detail the title \"([^\"]*)\"$")
    public void heSeesInDetailTheTitle(String title) throws Exception {
        user.should(seeThat("El paquete es", Nombre.paquete(), equalTo(title)));
    }
}
