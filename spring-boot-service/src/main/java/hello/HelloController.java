package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/")
    public String index() {
        LOGGER.info("hello world call");
        return "Greetings from Spring Boot!";
    }
    
}
