package com.sbytestream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        int repeats = 1;

        if (args.length > 0) {
            repeats = Integer.parseInt(args[0]);
        }

        for(int n=0; n < repeats; n++) {
            logger.trace("this is a trace");
            logger.error("this is an error");
            logger.warn("this is a warning");
            logger.info("this is an info");
            logger.debug("this is a debug");
        }

        System.out.println("Logs have been written.");
    }

    private static Logger logger = LoggerFactory.getLogger(App.class);
}
