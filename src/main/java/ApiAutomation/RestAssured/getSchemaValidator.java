package ApiAutomation.RestAssured;

public class getSchemaValidator {
    /*
    import io.restassured.RestAssured;
    import io.restassured.http.ContentType;
    import io.restassured.module.jsv.JsonSchemaValidator;
    import org.testng.annotations.Test;

    import static io.restassured.RestAssured.*;

    public class ApiSchemaTest {

        @Test
        public void testGetCallWithSchemaValidation() {
            // 1. Base URL configuration
            RestAssured.baseURI = "https://herokuapp.com";

            // 2. Execute GET and assert schema matching
            given()
                .contentType(ContentType.JSON)
                .pathParam("id", 1)
            .when()
                .get("/booking/{id}")
            .then()
                .statusCode(200)
                // Validates that the response format exactly matches your json schema file
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("booking-schema.json"));
        }
    }

     */
}
