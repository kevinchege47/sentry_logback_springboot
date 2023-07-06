package com.kevinchege47.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public void performTask(){
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an {} message.","info");
        logger.warn("This is a warn message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
    }
    public void sayMarco() {
        String msg = "I'm Marco";
        logger.info("Hello there. I am {}", msg);
        logger.debug("Debugging message");
    }
}
