package com.resumely.object;

import com.resumely.Parser;

import java.util.Map;

public class Line {
    String lineContent;
    Word[] words;
    int wordCount;
    Map<Token,Integer> characters;
    int totalCharacterCount;
    
    public Line(String lineContent) {
        this.lineContent = lineContent;
        words = Parser.tokenizeWords(lineContent);
        this.wordCount = words.length;
        characters = Parser.tokenizeCharacters(words,this);
    }
    
    public String getLineContent() {
        return lineContent;
    }

    public void setTotalCharacterCount(int totalCharacterCount) {
        this.totalCharacterCount = totalCharacterCount;
    }
}
