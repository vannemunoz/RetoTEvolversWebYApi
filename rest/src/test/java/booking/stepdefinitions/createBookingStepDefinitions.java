package booking.stepdefinitions;

import booking.models.ResponseGetBooking;
import booking.question.statuscode;
import booking.question.validateFill;
import booking.question.visualcieResponse;
import booking.task.CreateToken;
import booking.task.GetBooking;
import booking.task.PostBooking;
import booking.task.PutBooking;
import booking.utils.customMatch.FillBody;
import booking.utils.customMatch.matchWithBookResponse;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static booking.utils.customMatch.Keywords.*;

public class createBookingStepDefinitions {

    @Given("^the services (.*)$")
    public void theServices(String URL) {
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(URL)));
        OnStage.theActorCalled(ACTOR);
    }

    @When("^the user try create booking$")
    public void theUserTryCreateBooking(List<Map<String, String>> data) {
        FillBody fill = new FillBody(data.get(0));
        ResponseGetBooking body = fill.Fill();
        OnStage.theActorInTheSpotlight().attemptsTo(
                PostBooking.create(body)
        );
    }

    @Then("^the user will see the status code (.*)$")
    public void theUserWillSeeTheStatusCode(int code) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        statuscode.theResponse(), Matchers.is(code)
                )
        );
    }

    @Then("^the user wll see the information after update$")
    public void theUserWllSeeTheInformation() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        validateFill.fill(), matchWithBookResponse.andDataFeature((ResponseGetBooking) OnStage.theActorInTheSpotlight().recall(BOOK)))
        );
    }

    @Then("^the user will see  totalprice (.*)$")
    public void theUserWillSeeTotalprice(Integer totalPrice) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        visualcieResponse.withData(), Matchers.is(totalPrice)
                )
        );
    }

    @When("^the user want get booking with id$")
    public void theUserWantGetBooking() {
        int id = OnStage.theActorInTheSpotlight().recall(BOOKING_ID);
        OnStage.theActorInTheSpotlight().attemptsTo(
                GetBooking.obtener(id)
        );

    }

    @And("^create token$")
    public void createToken() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateToken.token()
        );
    }

    @When("^the user want Update booking$")
    public void theUserWantUpdateBooking(List<Map<String, String>> data) {
        FillBody fill = new FillBody(data.get(0));
        ResponseGetBooking body = fill.Fill();
        OnStage.theActorInTheSpotlight().attemptsTo(
                PutBooking.update(body)
        );
    }

}
