package helpers;

import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;

import static helpers.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class Browserstack {
    public static String getVideoUrl(String sessionId) {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class);

        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .filter(withCustomTemplates())
                .auth().basic("bsuser_2gsfxe", "62xcPFSGwCCGa138xF5F")
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");

    }
}
