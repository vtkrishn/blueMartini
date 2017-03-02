package com.vtkrishn.resumeMaker.util;

import java.io.File;
import java.io.FileInputStream;

import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ResumeUtil {
    private static File file;
    
    public static File setFile(String filelocation){
        file = new File(filelocation);
        return file;
    }
    
    public static void readDocFile(File file) {

                    try {
                            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                            HWPFDocument doc = new HWPFDocument(fis);
                            WordExtractor we = new WordExtractor(doc);
                            
                            String[] paragraphs = we.getParagraphText();
                            
                            for (String para : paragraphs) {
                                    System.out.println(para.toString());
                            }
                            fis.close();
                    } catch (Exception e) {
                            e.printStackTrace();
                    }

            }

            public static void readDocxFile(File file) {

                    try {
                            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                            XWPFDocument document = new XWPFDocument(fis);
                            List<XWPFParagraph> paragraphs = document.getParagraphs();
                            
                            for (XWPFParagraph para : paragraphs) {
                                    System.out.println(para.getText());
                            }
                            fis.close();
                    } catch (Exception e) {
                            e.printStackTrace();
                    }
    }
}
