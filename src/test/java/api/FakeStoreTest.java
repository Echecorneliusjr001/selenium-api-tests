package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static sun.nio.cs.Surrogate.is;

public class FakeStoreTest {

    static {
        RestAssured.baseURI = "https://fakestoreapi.com";
    }

    // G
    @Test
    void getProducts200() {
        given()
                .when()
                .get("/products")
                .then()
                .statusCode(200);
    }

    // VG
    @Test
    void productCountIsCorrect() {
        given()
                .when()
                .get("/products")
                .then()
                .body("size()", is(20));
    }

    @Test
    void productHasRequiredFields() {
        given()
                .when()
                .get("/products/1")
                .then()
                .body("title", notNullValue())
                .body("price", notNullValue())
                .body("category", notNullValue());
    }
}

