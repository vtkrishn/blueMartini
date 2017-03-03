package com.resumely.object;

import com.resumely.Parser;

import java.util.Map;

public class Word {
    String content;
    
    public Word(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public int length(){
        return content.length();
    }
}
