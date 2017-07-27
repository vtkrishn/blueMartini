package com.resumely.client;


import com.resumely.LineList;
import com.resumely.Parser;
import com.resumely.WordList;
import com.resumely.exception.ResumeException;
import com.resumely.logger.ResumeLogger;
import com.resumely.modules.AbstractFile;
import com.resumely.object.Line;
import com.resumely.object.Resume;
import com.resumely.object.Word;
import com.resumely.util.ResumeUtil;

import java.util.HashMap;
import java.util.Map;

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
        AbstractFile resume = new Resume(args[0]);
        //read the content row by row from the document
        ResumeUtil.getInstance().readContent(resume);  
        //extract word by word
        LineList list = new LineList();
        Parser.lineTokenize(resume.getContent(),list);
        //identify first 10 lines and work on those words
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<=10;i++){
            //System.out.println(list.getLines().get(i).getWordCount());
            Line line = list.getLines().get(i);
            String lineContent = line.getLineContent();
            Word[] words = line.getWords(lineContent);
            for(Word w : words){
                String[] str = w.getContent().split(" ");
                for(String s : str)
                    map.put(s, map.getOrDefault(s, 0)+1);
            }
        }
        System.out.println(map.size());
    } 
    
    
    
}
