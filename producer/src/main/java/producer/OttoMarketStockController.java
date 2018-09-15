package producer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/* SWAGGER */
/* UI: http://localhost:8080/swagger-ui.html */
/* API: http://localhost:8080/v2/api-docs */

@RestController
public class OttoMarketStockController {
    @RequestMapping(value = "/ottomarketstock", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public OttoMarketStock ottomarketstock() {
        return new OttoMarketStock("partnernummer", "stylenummer", "partner_artikelnummer", "konzern_artikelnummer", "hersteller_Marke", "groesse", "EAN", 100L, 100L, "letze_Aengerung_Partnerbestand", 100L, 0L, 0L, 0L);
    }
}
