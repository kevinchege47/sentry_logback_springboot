package com.kevinchege47.logback;

import io.sentry.Sentry;

import java.lang.Exception;

import io.sentry.Sentry;

public class TestCrash {
    public void testCrash() {
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
    }

}
