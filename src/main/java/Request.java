import io.restassured.*;
import io.restassured.http.*;
import io.restassured.response.*;

public class Request {
    public static String baseUrl = "https://api.weather.yandex.ru/v2/forecast?lat=56.852677&lon=53.206896&limit=7&hours=true&extra=true";
    public static Response getWeather() {
        return RestAssured.given()
                .given().header("X-Yandex-API-Key", "8be4e087-692b-4a5c-988e-394a6b499313")
                .baseUri(baseUrl)
                .when()
                .get(baseUrl)
                .then()
                .extract()
                .response();
    }
}

