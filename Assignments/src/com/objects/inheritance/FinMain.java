package com.objects.inheritance;

public class FinMain {
    public static void main(String[] args) {
        //String[] tools={"Junit","Docker","Git"};
        TeamOne teamOne = new TeamOne("Policy",12,"Banking","Ajay","Java FullStack");
        String[] techStack = teamOne.showTechStack();
        teamOne.showProjectDetails();
        for (String tech:techStack) {
            System.out.println(tech);
        }
        TeamTwo teamTwo = new TeamTwo(
                "Policy Bazar",
                12,
                "Banking",
                "Rahul",
                new String[] {"Junit","Docker","Git"});
//
        teamTwo.showSupportTools();
//

    }
}
