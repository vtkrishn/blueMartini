package com.vtkrishn.resumeMaker.client;

import com.vtkrishn.resumeMaker.exception.ResumeException;
import com.vtkrishn.resumeMaker.logger.ResumeLogger;
import com.vtkrishn.resumeMaker.util.ResumeUtil;

import java.io.File;

public class ResumeClient {
    public ResumeClient() {
        super();
        //client to load the resume client
    }
    
    public static void main(String[] args){
        //Read a word document from command line by providing the location
        //disect thfose file with words
        //D:\gitRepos_blueMartini\src\com\vtkrishn\resumeMaker\test.doc
        if(args == null){
            try {
                throw new ResumeException("No File provided for processing");
            } catch (ResumeException e) {
                ResumeLogger.getLogger().severe(e.getMessage());
            }
        }
        File file = ResumeUtil.setFile("D:\\gitRepos_blueMartini\\src\\com\\vtkrishn\\resumeMaker\\test.doc");
        ResumeUtil.readDocFile(file);
    } 
    
    
    
}
