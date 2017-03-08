package com.resumely;

import com.resumely.object.Line;

import com.resumely.object.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LineList{
    private static List<Line> _lines;
    static Map<Token,Integer> words;
    static Map<Token,Integer> characters;
    
    public void add(Line line){
        if(_lines == null)
           _lines = new ArrayList<Line>();
        
        _lines.add(line);
    }
    
    public List<Line> getLines(){
        return _lines;
    }
    
    public int lineCount(){
        return _lines.size();
    }
}
