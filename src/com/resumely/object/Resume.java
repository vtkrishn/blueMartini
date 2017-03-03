package com.resumely.object;


import com.resumely.exception.ResumeException;
import com.resumely.logger.ResumeLogger;
import com.resumely.util.ResumeConstants;

import java.io.File;

import org.apache.poi.poifs.filesystem.DocumentInputStream;

public class Resume {
    String name;
    Object[] content;
    long size;
    FileType type;
    File file;
    
    public Resume(String resume) {
        if(resume == null || resume.equals(""))
            try {
                throw new ResumeException("Invalid File specified");
            } catch (ResumeException e) {
                ResumeLogger.getLogger().entering("Resume", e.getMessage());
            }
    
        if(resume.contains(ResumeConstants.EXTENSION_SEPARATOR)){
            identifyFileType(resume);
        }
        else{
            try {
                throw new ResumeException("Not a proper file");
            } catch (ResumeException e) {
                ResumeLogger.getLogger().entering("Resume", e.getMessage());
            }
        }
            //valid file
            this.file = new File(resume);
            this.name = file.getName();
            this.size = file.length();
    }
    
    /*
     * indetify the file type
     */
    private void identifyFileType(String resume) {
        String[] fileAndExtension = resume.split("\\" + ResumeConstants.EXTENSION_SEPARATOR);
        switch(fileAndExtension[1]){
            case "doc":
                this.type = Resume.FileType.DOC;
                break;
            case "docx":
                this.type = Resume.FileType.DOCX;
                break;
            case "txt":
                this.type = Resume.FileType.TXT;
                break;
            case "pdf":
                this.type = Resume.FileType.PDF;
                break;
            default:
                try {
                    throw new ResumeException("Not support for this extension file");
                } catch (ResumeException e) {
                ResumeLogger.getLogger().entering("Resume", e.getMessage());
                }
                break;
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public File getFile(){
        return file;
    }
    
    public FileType getType(){
        return this.type;
    }
    
    public void setContent(Object[] fileContent){
        this.content = fileContent;
    }
        
        public enum FileType{
          DOC,DOCX,PDF,TXT;
            private static final long serialVersionUID = 1L;
        };
}
