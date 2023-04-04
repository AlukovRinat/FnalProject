package api.jsonplaceholder;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PlaceHolderTest {
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
                .multiPart("username", "09876&*()")
                .multiPart("password", "_)(*&^678")
                .post("/login")
                .then()
                .statusCode(200);

    }

    @Test
    public void RusCymbolAuthData(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .contentType("multipart/form-data")
                .multiPart("username", "длорпло")
                .multiPart("password", "ждлорпавыф")
                .post("/login")
                .then()
                .statusCode(200);

    }

    @Test
    public void getNotMePost0(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?owner=notMe&sort=createdAt&order=ASC&page=1")
                .then()
                .statusCode(500);

    }

    @Test
    public void getNotMePost1(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?owner=notMe&sort=createdAt&order=ASC&page=2")
                .then()
                .statusCode(500);

    }

    @Test
    public void getNotMePost2(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?owner=notMe&sort=createdAt&order=ASC&page=3")
                .then()
                .statusCode(500);

    }

    @Test
    public void getNotMePost3(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?owner=notMe&sort=createdAt&order=ASC&page=4")
                .then()
                .statusCode(500);

    }

    @Test
    public void getNotMePost4(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?owner=notMe&sort=createdAt&order=ASC&page=5")
                .then()
                .statusCode(500);

    }

    @Test
    public void getMePost0(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?sort=createdAt&order=ASC&page=1")
                .then()
                .statusCode(500);

    }

    @Test
    public void getMePost1(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?sort=createdAt&order=ASC&page=2")
                .then()
                .statusCode(500);

    }

    @Test
    public void getMePost2(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?sort=createdAt&order=ASC&page=3")
                .then()
                .statusCode(500);

    }

    @Test
    public void getMePost3(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?sort=createdAt&order=ASC&page=4")
                .then()
                .statusCode(500);

    }

    @Test
    public void getMePost4(){
        RequestSpecification requestSpec = given()
                .baseUri("https://test-stand.gb.ru")
                .header("Language", "en");
        requestSpec
                .post("/api/posts?sort=createdAt&order=ASC&page=5")
                .then()
                .statusCode(500);

    }
}


