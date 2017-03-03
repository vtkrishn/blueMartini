package com.resumely.client;


import com.resumely.exception.ResumeException;
import com.resumely.logger.ResumeLogger;
import com.resumely.object.Resume;
import com.resumely.util.ResumeUtil;

/**
 * Main Class
 */
public class ResumeClient {
    
    public ResumeClient() {
        super();
    }
    
    public static void main(String[] args){
        //arg should not be null
        if(args == null || args.length == 0){
            try {
                throw new ResumeException("No File provided for processing");
            } catch (ResumeException e) {
                ResumeLogger.getLogger().entering("ResumeClient", e.getMessage());
            }
        }
        //create the file with the command argument
        Resume resume = new Resume(args[0]);
        ResumeUtil.readContentFromResume(resume);  
    } 
    
    
    
}
