package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HealthResourceTest {

    @Test
    public void testHealthEndpoint() {
        given()
          .when().get("/api/v1/health")
          .then()
             .statusCode(200)
             .body(is("Meck meck! That coyote is never going to catch me!"));
    }

}