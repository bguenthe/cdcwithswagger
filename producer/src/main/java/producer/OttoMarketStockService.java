package producer;

import org.springframework.stereotype.Service;

@Service
public class OttoMarketStockService {
    public OttoMarketStock findById(Long id) {
        OttoMarketStock ottoMarketStock = new OttoMarketStock("partnernummer", "stylenummer", "partner_artikelnummer", "konzern_artikelnummer", "hersteller_Marke", "groesse", "EAN", 100L, 100L, "letze_Aengerung_Partnerbestand", 100L, 0L, 0L, 0L);
        return ottoMarketStock;
    }
}