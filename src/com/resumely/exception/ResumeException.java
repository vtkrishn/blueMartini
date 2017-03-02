package com.resumely.exception;

import com.resumely.logger.ResumeLogger;

/**
 * Exception class
 */
public class ResumeException extends Exception{
    @SuppressWarnings("compatibility:1332891654706886474")
    private static final long serialVersionUID = 1L;

    public ResumeException() {
        super();
    }
    
    /**
     * Constructor with message
     * @param message
     */
    public ResumeException(final String message) {
        ResumeLogger.getLogger().fine(message);
    }
}
