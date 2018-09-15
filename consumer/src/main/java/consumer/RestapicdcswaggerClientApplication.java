package consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestapicdcswaggerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestapicdcswaggerClientApplication.class, args);
    }
}

@RestController
class MessageRestController {

    private final RestTemplate restTemplate;

    MessageRestController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @RequestMapping("/message")
    String getMessage() {
        return this.restTemplate.getForObject("http://localhost:8081/ottomarketstock", String.class);
    }

}
