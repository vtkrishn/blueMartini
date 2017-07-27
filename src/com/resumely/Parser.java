package com.resumely;

import com.resumely.object.Line;
import com.resumely.object.Token;
import com.resumely.object.Word;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    
    //Problem (Determine the Name of the person)
    //it can be anywhere in the document, but mostly it will be in the first few lines
    //(These may conflict with Address also)
        //will not be there in the dictionary,
        //not a verb
        //Mostly start in Capital, Camel case
        //Bold letter
        //sometimes will have the label as Name
        //Spaced with 2 or 3 continuous 
        //can be in the header
        //can have as a image also
        //mostly unique across the document
        //
     
     //Problem 2(Determine the Address of the  person)
    //Address 1, number followed by a Name
    //Can contain some of the special characters [.,/#,No, Apt, Suite]
    //street - Name and common [Common, way,street, boulevard, Suite etc]
    //Address 2 - 
    
    public static void lineTokenize(Object[] resumeContent,LineList list){
        for(int i=0;i<resumeContent.length;i++){
            Line line = new Line((String)resumeContent[i]);
            list.add(line);    
        }
        list.analyze();
    }
    public static Word[] getWordList(String lineContent){
        String[] words = lineContent.split(" ");
        Word[] word = new Word[words.length];
        int i=0;
        for(String wrd : words){
             word[i] = new Word(wrd);
            i++;
        }
        return word;
    }
    public static Map<Token,Integer> tokenizeWords(Line line){
        return null;
    }
    public static Map<Token,Integer> tokenizeCharacters(Word word){
        Map<Token,Integer> tokens = null;
        
        int totalCharacterCount=0;
        int spaceCount = 0;
        Token token = null;
            int i=0;
            while(i<word.length()){
                char ch = word.getContent().charAt(i++);
                
                if(tokens == null)
                    tokens = new HashMap<Token,Integer>();
                
                token = new Token(ch);
                
                if(tokens.containsKey(token))
                    tokens.put(token,tokens.get(token) + 1);
                else
                    tokens.put(token,1);
                
                totalCharacterCount++;
            }
            spaceCount++;
        token = new Token(' ');
        tokens.put(token,spaceCount);
        //line.setTotalCharacterCount(totalCharacterCount);
        return tokens;
    }
}
