package ApiAutomation.RestAssured;

public class Post {

    /*
        import io.restassured.RestAssured;
        import io.restassured.http.ContentType;
        import org.testng.annotations.Test;
        import static io.restassured.RestAssured.*;
        import static org.hamcrest.Matchers.*;

        public class ApiPostTest {

            @Test
            public void testCreateUserPostCall() {
                // 1. Define the Base URI
                RestAssured.baseURI = "https://reqres.in";

                // 2. Define the JSON Request Body
                String requestBody = "{\n" +
                        "    \"name\": \"John Doe\",\n" +
                        "    \"job\": \"QA Engineer\"\n" +
                        "}";

                // 3. Execute the POST Request
                given()
                    .header("Content-Type", "application/json") // Or use .contentType(ContentType.JSON)
                    .body(requestBody)
                .when()
                    .post("/users")
                .then()
                    .log().all()                                // Logs the full response payload
                    .statusCode(201)                            // Validates Status Code is 201 Created
                    .body("name", equalTo("John Doe"))          // Validates "name" field in response
                    .body("job", equalTo("QA Engineer"))        // Validates "job" field in response
                    .body("id", notNullValue());                // Validates "id" is generated
            }
        }

     */
}
