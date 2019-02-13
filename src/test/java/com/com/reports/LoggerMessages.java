package com.com.reports;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class LoggerMessages {
    private static Logger log= LogManager.getLogger(LoggerMessages.class);
    public static void main (String [] args)
    {
     log.info("This is information");
     log.warn("This is warning message");
     log.error("This is error message");
     log.trace("This is trace message");
     log.fatal("this is fatal message");
    }
}
