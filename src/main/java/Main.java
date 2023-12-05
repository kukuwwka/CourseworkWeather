
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class Main {
    @Test
    public void Weather() {
        for (int i = 0; i <= 6; i++) {
            String city = Request.getWeather().jsonPath().getString("geo_object.locality.name");
            String weatherDate = Request.getWeather().jsonPath().getString("forecasts.date" + "[" + i + "]");
            String degreesNight = Request.getWeather().jsonPath().getString("forecasts.parts.night.temp_avg" + "[" + i + "]");
            String degreesMorning = Request.getWeather().jsonPath().getString("forecasts.parts.morning.temp_avg" + "[" + i + "]");
            String degreesDay = Request.getWeather().jsonPath().getString("forecasts.parts.day.temp_avg" + "[" + i + "]");
            String degreesEvening = Request.getWeather().jsonPath().getString("forecasts.parts.evening.temp_avg" + "[" + i + "]");
            System.out.println("Погода в " + city + " на дату "  + weatherDate);
            System.out.println("Ночью: " + degreesNight + "\nУтром: " + degreesMorning + "\nДнём: " + degreesDay + "\nВечером: " + degreesEvening);
        }
    }
}
