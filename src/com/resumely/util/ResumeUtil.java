package com.resumely.util;


import com.resumely.logger.ResumeLogger;
import com.resumely.modules.AbstractFile;
import com.resumely.modules.AbstractResume;
import com.resumely.modules.ResumeReader;
import com.resumely.object.Resume;

import java.io.FileInputStream;

import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


/**
 * Utility File
 */
public class ResumeUtil implements ResumeReader{
            private final static ResumeUtil resumeUtil;
            static{
                resumeUtil = new ResumeUtil();
            }
            public void readContent(AbstractFile file) {
            
                        try {
                                FileInputStream fis = new FileInputStream(file.getFile().getAbsolutePath());
                            if(file.getType() == AbstractFile.FileType.DOC){
                                HWPFDocument doc = new HWPFDocument(fis);
                                WordExtractor we = new WordExtractor(doc);
                                file.setContent(we.getParagraphText());
                                fis.close();
                            }
                            else if(file.getType() == AbstractFile.FileType.DOCX){
                                XWPFDocument document = new XWPFDocument(fis);
                                List<XWPFParagraph> paragraphs = document.getParagraphs();
                                file.setContent(paragraphs.toArray());
                            }
                                
                        } catch (Exception e) {
                            ResumeLogger.getLogger().entering("ResumeUtil", e.getMessage());
                        }
            
                }
            
            public static ResumeUtil getInstance(){
                return resumeUtil;
            }
}
