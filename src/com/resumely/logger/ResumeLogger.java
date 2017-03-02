package com.resumely.logger;


import com.resumely.util.ResumeConstants;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Common logging class
 */
public final class ResumeLogger {
    
    private static Logger logger;
    
    static {
            logger = Logger.getLogger("ResumeLogger");
            logger.addHandler(ResumeConstants.getHandler());
            logger.setLevel(Level.ALL);
    }
    
    /**
     * get the logger instance
     * @return
     */
    public static Logger getLogger(){
        return logger;
    }
}
