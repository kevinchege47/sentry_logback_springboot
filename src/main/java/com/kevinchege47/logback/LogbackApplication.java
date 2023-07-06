package com.kevinchege47.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.Exception;
import io.sentry.Sentry;
@SpringBootApplication
public class LogbackApplication {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(LogbackApplication.class);
        SpringApplication.run(LogbackApplication.class, args);
        LogbackDemo poloBean = new LogbackDemo();
        poloBean.sayMarco();
        logger.debug("I am Polo");
        poloBean.performTask();

    }



}
