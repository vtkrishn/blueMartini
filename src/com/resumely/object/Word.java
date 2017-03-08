package com.resumely.object;

import com.resumely.Parser;

import java.util.Map;

public class Word {
    String content;
    char[] characters;
    int characterCount;
    
    public Word(String content) {
        this.content = content;
        //characters = Parser.tokenizeCharacters(this);
    }

    public String getContent() {
        return content;
    }
    public int length(){
        return content.length();
    }

}
