package com.resumely.modules;

import com.resumely.exception.ResumeException;
import com.resumely.logger.ResumeLogger;
import com.resumely.object.Resume;
import com.resumely.util.ResumeConstants;

import java.io.File;

public class AbstractFile {
    String name;
    Object[] content;
    long size;
    FileType type;
    File fileLocation;
    
    public AbstractFile(String resume){
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
            setFileLocation(new File(resume));
            setName(getFile().getName());
            setSize(getFile().length());
    }
    
    /*
     * indetify the file type
     */
    private void identifyFileType(String resume) {
        String[] fileAndExtension = resume.split("\\" + ResumeConstants.EXTENSION_SEPARATOR);
        switch(fileAndExtension[1]){
            case "doc":
                setType(Resume.FileType.DOC);
                break;
            case "docx":
                setType(Resume.FileType.DOCX);
                break;
            case "txt":
                setType(Resume.FileType.TXT);
                break;
            case "pdf":
                setType(Resume.FileType.PDF);
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
        return fileLocation;
    }
    
    public FileType getType(){
        return this.type;
    }
    
    public long getFileSize(){
        return this.size;
    }
    
    public void setContent(Object[] fileContent){
        this.content = fileContent;
    }
    
    public Object[] getContent(){
        return this.content;
    }

    public void setType(AbstractFile.FileType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void setFileLocation(File fileLocation) {
        this.fileLocation = fileLocation;
    }

    public enum FileType{
      DOC,DOCX,PDF,TXT;
        private static final long serialVersionUID = 1L;
    };
}
