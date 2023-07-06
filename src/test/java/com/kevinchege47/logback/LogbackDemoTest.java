package com.kevinchege47.logback;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogbackDemoTest {
    @Disabled
    @Test
    public void testPerformTask() throws Exception {
        LogbackDemo logBackDemo = new LogbackDemo();
        logBackDemo.performTask();
    }

}