package com.vtkrishn.resumeMaker.object;

import com.vtkrishn.resumeMaker.exception.ResumeException;

import com.vtkrishn.resumeMaker.logger.ResumeLogger;

import java.io.File;

public class Resume {
    String name;
    String[] content;
    long size;
    FileType.TYPE type;
    File file;
    
    public Resume(String resume) {
        if(resume == null || resume.equals(""))
            try {
                throw new ResumeException("Invalid File specified");
            } catch (ResumeException e) {
                ResumeLogger.getLogger().entering("Resume", e.getMessage());
            }
    
        if(resume.contains(".")){
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
        String[] fileAndExtension = resume.split("\\.");
        switch(fileAndExtension[1]){
            case "doc":
                this.type = FileType.TYPE.DOC;
                break;
            case "docx":
                this.type = FileType.TYPE.DOC;
                break;
            case "txt":
                this.type = FileType.TYPE.DOC;
                break;
            case "pdf":
                this.type = FileType.TYPE.DOC;
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
    
    public void setContent(String[] fileContent){
        this.content = fileContent;
    }
        
    static class FileType{
        enum TYPE{
          DOC,DOCX,PDF,TXT;
            private static final long serialVersionUID = 1L;
        };
    }
}
