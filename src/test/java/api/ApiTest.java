package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.hasItem;

public class ApiTest {

        @Test
        public void testCase() {
            when().
                    get("https://prod.roketapp.site/market/currency?symbol=BTC"). //Send get request
                    then()
                    .statusCode(200) //Check status
                    .body("data.currencies.name", hasItem("Bitcoin")) //Check currency name, it is static field
                    .body("data.currencies.symbol", hasItem("BTC"))  //Check currency name, it is static field
                    .body(matchesJsonSchemaInClasspath("schema.json"));
                //Check rest of the response these fields' data type should be fit to standarts (data type and not null)

        }

}
