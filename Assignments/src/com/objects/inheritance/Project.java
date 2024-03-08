package com.objects.inheritance;

public class Project {
    String projectName;
    int durationMonths;
    String domain;
    String projectManager;

    public Project(String projectName, int durationMonths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationMonths = durationMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void showProjectDetails(){
        System.out.println("Project Name:"+" "+projectName);
        System.out.println("Duration Months"+" "+durationMonths);
        System.out.println("Domain"+" "+domain);
        System.out.println("Project Manager"+" "+projectManager);
    }
}
