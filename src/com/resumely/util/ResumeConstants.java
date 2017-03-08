package com.resumely.util;


import com.resumely.logger.ResumeLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.logging.FileHandler;


public final class ResumeConstants {
    private static Properties properties;
    private static FileHandler handler;
    public static final String EXTENSION_SEPARATOR = ".";
    public static final String LOG_FILE_LOCATION = "LOG_FILE_LOCATION";
    public static final String APPEND_LOG = "APPEND_LOG";
    
    //Static block to instanitate properties and log handler
    static {
            properties = new Properties();
            try{
                properties.load(new FileInputStream(new File("src\\config.properties")));
            } 
            catch (IOException e) {
            ResumeLogger.getLogger().entering("ResumeConstants", e.getMessage());
            }

        try {
            handler = new FileHandler(properties.getProperty(LOG_FILE_LOCATION),Boolean.valueOf(properties.getProperty(APPEND_LOG)));
        } catch (IOException e) {
            ResumeLogger.getLogger().entering("ResumeConstants", e.getMessage());
        }
    }
    
    /**
     * Get the config file handler
     * @return
     */
    public static FileHandler getHandler(){
        return handler;
    }
    
}
