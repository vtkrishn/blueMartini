package com.vtkrishn.resumeMaker.exception;

import com.vtkrishn.resumeMaker.logger.ResumeLogger;

/**
 * Exception class
 */
public class ResumeException extends Exception{
    @SuppressWarnings("compatibility:1332891654706886474")
    private static final long serialVersionUID = 1L;

    public ResumeException() {
        super();
    }
    
    public ResumeException(final String message) {
        ResumeLogger.getLogger().fine(message);
    }
}
