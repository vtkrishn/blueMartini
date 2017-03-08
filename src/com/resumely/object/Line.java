package com.resumely.object;

import com.resumely.Parser;

import java.util.Map;

public class Line {
    String lineContent;
    Word[] words;
    int wordCount;
    
    public Line(String lineContent) {
        this.lineContent = lineContent;
        
        //words = Parser.tokenizeWords(this);
        //update total words 
        //update total characters in the Resume
    }
    
    public String getLineContent() {
        return lineContent;
    }

    public void setTotalCharacterCount(int totalCharacterCount) {
        //this.totalCharacterCount = totalCharacterCount;
    }

    public static Word[] getWords(String lineContent) {
        return Parser.getWordList(lineContent);
    }

    public int getWordCount() {
        return wordCount;
    }

//    public static Map<Token, Integer> getCharacters() {
//        return characters;
//    }
//
//    public int getTotalCharacterCount() {
//       // return totalCharacterCount;
//    }
}
