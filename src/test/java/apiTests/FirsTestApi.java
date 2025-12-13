package apiTests;

import io.restassured.http.ContentType;
import org.codehaus.groovy.runtime.StringGroovyMethods;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class FirsTestApi {
   public final String URL = "https://jsonplaceholder.typicode.com/";
    @Test
    public void getUserAddress(){
        given()
                .contentType(ContentType.JSON)
                .when()
                .get(URL+"users")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

}
