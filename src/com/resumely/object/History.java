package com.resumely.object;

import java.util.List;

public class History {
    List<Project> projectList;
    public History() {
        super();
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public List<Project> getProjectList() {
        return projectList;
    }
}
