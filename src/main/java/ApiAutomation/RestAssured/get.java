package ApiAutomation.RestAssured;

public class get {
    /*
    import io.restassured.RestAssured;
    import io.restassured.http.ContentType;
    import org.testng.annotations.Test;
    import static io.restassured.RestAssured.*;
    import static org.hamcrest.Matchers.*;

    public class ApiGetTest {

        @Test
        public void testGetUserGetCall() {
            // 1. Define the Base URI
            RestAssured.baseURI = "https://reqres.in";

            // 2. Execute the GET Request
            given()
                .contentType(ContentType.JSON)
                .queryParam("page", 2)                     // Adds URL query param: /api/users?page=2
                // .pathParam("id", 2)                     // Use this if URL looks like /api/users/{id}
            .when()
                .get("/users")                             // Appends target endpoint
            .then()
                .log().all()                               // Logs the full response headers and body
                .statusCode(200)                           // Validates Status Code is 200 OK
                .header("Content-Type", containsString("application/json")) // Validates headers
                .body("page", equalTo(2))                  // Validates top-level integer fields
                .body("data", hasSize(greaterThan(0)))     // Validates array size
                .body("data[0].first_name", equalTo("Michael")); // Validates specific item in JSON array
        }
    }

     */
}
