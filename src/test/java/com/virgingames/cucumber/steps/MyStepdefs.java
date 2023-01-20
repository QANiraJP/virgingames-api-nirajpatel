package com.virgingames.cucumber.steps;

import com.virgingames.bingoinfo.BingoLobbySteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class MyStepdefs {
    static ValidatableResponse response;
    int noOfPlayers;


    @Steps
    BingoLobbySteps bingoLobbySteps;

    @When("^I send GET request$")
    public void iSendGETRequest() {
        response = bingoLobbySteps.getBingoLobbyInfo();
         noOfPlayers = response.extract().jsonPath().get("bingoLobbyInfoResource.streams[0].noPlayers");
    }

    @And("^I get valid status code 200")
    public void iGetValidStatusCode() {
        response.statusCode(200);
    }

    @Then("^I verify that number of player is greater than zero$")
    public void iVerifyThatNumberOfPlayerIsGreaterThanZero() {
        Assert.assertTrue("Number of players are greater than zero",noOfPlayers>0);
    }
}
