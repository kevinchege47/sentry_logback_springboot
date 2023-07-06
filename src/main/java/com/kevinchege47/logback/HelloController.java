package com.kevinchege47.logback;

import io.sentry.Sentry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    @GetMapping("/api/javainuse")
    public int sayHello(){
//    int result = 10 / 0;
        return 10 * 2;
//        return "Swagger Hello World";

    }

}
