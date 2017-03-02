package com.vtkrishn.resumeMaker.logger;

import com.vtkrishn.resumeMaker.util.ResumeConstants;

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
    
    public static Logger getLogger(){
        return logger;
    }
}
