package com.resumely.object;


import com.resumely.modules.AbstractFile;
import com.resumely.modules.IResume;

import java.util.Map;

public class Resume extends AbstractFile implements IResume{
    Map<String,Integer> totalWords;
    Map<String,Integer> totalCharacters;
    
    public Resume(String resume) {
        super(resume);
    }

    public Info getInfo() {
        return null;
    }

    public History getHistory() {
        return null;
    }

    public String getCandidateName() {
        return null;
    }
}
