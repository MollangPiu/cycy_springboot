package kr.soft.shopping.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/test")
    public void test() {
        logger.info("TEST ACTION");
    }

    @GetMapping("/test1")
    public String test1() {
        logger.info("TEST ACTION");

        return "Hello World";
    }

}
