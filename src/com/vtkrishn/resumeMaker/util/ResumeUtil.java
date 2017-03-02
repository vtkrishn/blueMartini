package com.vtkrishn.resumeMaker.util;

import com.vtkrishn.resumeMaker.logger.ResumeLogger;

import com.vtkrishn.resumeMaker.object.Resume;

import java.io.File;
import java.io.FileInputStream;

import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 * Utility File
 */
public class ResumeUtil {
    public static void readDocFile(Resume file) {

                    try {
                            FileInputStream fis = new FileInputStream(file.getFile().getAbsolutePath());
                            HWPFDocument doc = new HWPFDocument(fis);
                            WordExtractor we = new WordExtractor(doc);
                            file.setContent(we.getParagraphText());
                            fis.close();
                    } catch (Exception e) {
                        ResumeLogger.getLogger().entering("ResumeUtil", e.getMessage());
                    }

            }

            public static void readDocxFile(Resume file) {

                    try {
                            FileInputStream fis = new FileInputStream(file.getFile().getAbsolutePath());
                            XWPFDocument document = new XWPFDocument(fis);
                            List<XWPFParagraph> paragraphs = document.getParagraphs();
                            
                            for (XWPFParagraph para : paragraphs) {
                                    System.out.println(para.getText());
                            }
                            fis.close();
                    } catch (Exception e) {
                        ResumeLogger.getLogger().entering("ResumeUtil", e.getMessage());
                    }
    }
}
