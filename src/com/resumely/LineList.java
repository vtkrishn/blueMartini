package com.resumely;

import com.resumely.object.Line;

import com.resumely.object.Token;

import com.resumely.object.Word;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.poifs.filesystem.Entry;

public class LineList{
    private static List<Line> _lines;
    static TreeMap<String,Integer> wordMap;
    static TreeMap<Character,Integer> characterMap;
    
    public LineList(){
        wordMap = new TreeMap<String, Integer>();
        characterMap = new TreeMap<Character, Integer>();
    }
    
    public void add(Line line){
        if(_lines == null)
           _lines = new ArrayList<Line>();
        
        _lines.add(line);
    }
    
    public void analyze(){
        for(int i=0;i<_lines.size();i++){
            //System.out.println(list.getLines().get(i).getWordCount());
            Line line = _lines.get(i);
            String lineContent = line.getLineContent();
            Word[] words = line.getWords(lineContent);
            for(Word w : words){
                String[] str = w.getContent().split("\\t|,|;|\\.|\\?|!|-|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/|\n");
                char[] ch = null;
                for(String s : str){
                     ch = s.toCharArray();
                    wordMap.put(s, wordMap.getOrDefault(s, 0)+1);
                }
                if(ch != null){
                    for(char c : ch)
                        characterMap.put(c, characterMap.getOrDefault(c, 0)+1);
                }
            }
        }
    }
    
    public List<Line> getLines(){
        return _lines;
    }
    
    public int lineCount(){
        return _lines.size();
    }

    public static TreeMap<String, Integer> getWordMap() {
        return wordMap;
    }

    public static TreeMap<Character, Integer> getCharacterMap() {
        return characterMap;
    }
}
