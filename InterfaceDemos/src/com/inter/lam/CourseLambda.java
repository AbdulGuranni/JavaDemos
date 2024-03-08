package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse webcourse = ()-> new String[]{"HTML","CSS","bootstrap"};

        for(String cloud:webcourse.showCourses())
            System.out.println(cloud);
        ICourse Cloudcourse = ()->new String[]{"aws","googlecloud","azure"};
        for(String cloudcourse:Cloudcourse.showCourses()){
            System.out.println(cloudcourse);
        }
    }
}
