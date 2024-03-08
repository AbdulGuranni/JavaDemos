package com.objects.inheritance;

public class TeamTwo extends Project{
    String[] tools;
    public TeamTwo(String projectName, int durationMonths, String domain, String projectManager,String[] tools) {
        super(projectName, durationMonths, domain, projectManager);
        this.tools = tools;
    }
    void showSupportTools(){
        for(String tool:tools){
            System.out.println(tool);
        }
    }

}
