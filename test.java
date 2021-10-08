import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassures.RestAssured.given:
import static dependencies.Endpoints.*:

@DisplayName("Наши имена")
public class Tests {

    @Test
    @DisplayName("получить записи со статусом Available")
    public void getPetByStatusAvailable() {
        given()
        contentType(ContentType.JSON)
                .baseUri(baseUri)
                .get(STATUS_AVAILABLE)
                .then()
                .assertThat().status(200)
                .log().all();
    }
}
