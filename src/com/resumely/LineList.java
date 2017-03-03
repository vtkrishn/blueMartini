package com.resumely;

import com.resumely.object.Line;

import java.util.ArrayList;
import java.util.List;

public class LineList{
    private static List<Line> _lines;
    
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
