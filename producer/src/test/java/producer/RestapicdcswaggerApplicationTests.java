package producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import producer.OttoMarketStock;
import producer.OttoMarketStockController;
import producer.OttoMarketStockService;
import producer.RestapicdcswaggerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestapicdcswaggerApplication.class)
public abstract class RestapicdcswaggerApplicationTests {

    @Autowired
    OttoMarketStockController ottoMarketStockController;

    @MockBean
    OttoMarketStockService ottoMarketStockService;

    @Before
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(ottoMarketStockController);

        Mockito.when(ottoMarketStockService.findById(1L))
                .thenReturn(
                        new OttoMarketStock("partnernummer", "stylenummer", "partner_artikelnummer", "konzern_artikelnummer", "hersteller_Marke", "groesse", "EAN", 100L, 100L, "letze_Aengerung_Partnerbestand", 100L, 0L, 0L, 0L));
    }
}