package apiTest;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListUserTest {
    @Test
    void testHttpGet() {
        given()
                .contentType("application/json")
                .when()
                .get("https://httpbin.org/get")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    void testHttpPost() {
        given()
                .contentType("application/json")
                .body("{\"name\": \"Johnn\", \"age\": 30}")
                .when()
                .patch("https://httpbin.org/patch n")
                .then()
                .statusCode(200)
                .body("json.name", equalTo("John"));
    }
    @Test
    public void userListTest() {
        given()
                .log().all() // ← Логируем ЗАПРОС
                .when()
                .get("https://jsonplaceholder.typicode.com/users") // ← Используем httpbin
                .then()
                .log().all() // ← Логируем ОТВЕТ
                .statusCode(200);
    }
}

