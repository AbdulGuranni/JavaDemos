package com.inter.basics;

public class DeveloperDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equals("indoor")){
            System.out.println("Carrom and shuttle available");
        }else{
            System.out.println("cricket");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("Weekly lunch outing");
    }
}
