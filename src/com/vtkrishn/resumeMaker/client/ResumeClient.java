package com.vtkrishn.resumeMaker.client;

import com.vtkrishn.resumeMaker.exception.ResumeException;
import com.vtkrishn.resumeMaker.logger.ResumeLogger;
import com.vtkrishn.resumeMaker.object.Resume;
import com.vtkrishn.resumeMaker.util.ResumeUtil;

import java.io.File;

/**
 * Main Class
 */
public class ResumeClient {
    
    public ResumeClient() {
        super();
    }
    
    public static void main(String[] args){
        //arg should not be null
        if(args == null){
            try {
                throw new ResumeException("No File provided for processing");
            } catch (ResumeException e) {
                ResumeLogger.getLogger().entering("ResumeClient", e.getMessage());
            }
        }
        //create the file with the command argument
        Resume resume = new Resume(args[0]);
        ResumeUtil.readDocFile(resume);
        
    } 
    
    
    
}
