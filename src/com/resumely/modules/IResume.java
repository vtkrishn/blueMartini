package com.resumely.modules;

import com.resumely.object.History;
import com.resumely.object.Info;
import com.resumely.object.Name;

public interface IResume {
    public Name getCandidateName();
    public Info getInfo();
    public History getHistory();
}
