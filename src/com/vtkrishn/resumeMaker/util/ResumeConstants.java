package com.vtkrishn.resumeMaker.util;

import com.vtkrishn.resumeMaker.logger.ResumeLogger;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import java.util.logging.FileHandler;

public final class ResumeConstants {
    
    private static Properties properties;
    private static FileHandler handler;
    
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
            handler = new FileHandler(properties.getProperty("LOG_FILE_LOCATION"),Boolean.valueOf(properties.getProperty("APPEND_LOG")));
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
