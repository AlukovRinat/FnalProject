package api.jsonplaceholder;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static io.restassured.RestAssured.given;
public class stage4 {
    private final static String URL = "https://test-stand.gb.ru/gateway/login";

    @Test
    public void ValidAuthData(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .contentType("multipart/form-data")
                .multiPart("username", "GB202303616b97")
                .multiPart("password", "0680901c68")
                .post("/login")
                .then()
                .statusCode(200);

    }

    @Test
    public void UnValidAuthData(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .contentType("multipart/form-data")
                .multiPart("username", "rinat_alyukov")
                .multiPart("password", "847bc7dfb3")
                .post("/login")
                .then()
                .statusCode(200);

    }
    private final static String URL ="https://test-stand.gb.ru/?sort=createdAt&order=ASC"
    @Test
    void getTestMy1() {
        given()
                .header("X-Auth-Token",getXAuthToken())
                .queryParam("sort", "createdAt")
                .queryParam("order", "ASC")
                .queryParam("page", "1")
                .when()
                .get(getUrl()+"api/posts")
                .then()
                .statusCode(200);
    }

    private java.net.URL getUrl() {
        return null;
    }

    private Object getXAuthToken() {
        return null;
    }

}
