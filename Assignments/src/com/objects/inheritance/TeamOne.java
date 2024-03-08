package com.objects.inheritance;

public class TeamOne extends Project{
    String techStack;

    public TeamOne(String projectName, int durationMonths, String domain, String projectManager, String techStack) {
        super(projectName, durationMonths, domain, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack(){
        String[] tech ={"Java","MySQL","Spring"};
        return tech;
    }
}
