package com.virgingames.bingoinfo;

import com.virgingames.constants.EndPoints;
import com.virgingames.constants.Path;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class BingoLobbySteps {
    @Step("Getting bingo lobby data")
    public ValidatableResponse getBingoLobbyInfo(){
        return SerenityRest.given().log().all()
                .basePath(Path.getPath)
                .when()
                .get(EndPoints.getEndPoint)
                .then();
    }
}
