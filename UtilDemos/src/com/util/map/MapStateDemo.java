package com.util.map;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> statesmap = new HashMap<>();
        statesmap.put("Karnataka", Arrays.asList("Bangalore","Mysore","Mangalore"));
        statesmap.put("Telangana", Arrays.asList("Hyderabad","Nizambad","Secundrabad"));
        statesmap.put("Tamil Nadu", Arrays.asList("Chennai","Coimbatore","Vellore"));
        statesmap.put("Kerala", Arrays.asList("Kochi","Kozhikode","Mannur"));
        System.out.println(statesmap);
        System.out.println(statesmap.get("Karnataka"));
        System.out.println(statesmap.get("Tamil Nadu"));
        for(Map.Entry<String,List<String>> stateEntries:statesmap.entrySet()){
            System.out.println(stateEntries.getKey());
            List<String> cities = stateEntries.getValue();
            for(String city:cities)
                System.out.println(city);
        }
        for(String stateName:statesmap.keySet()){
            System.out.println("State: "+stateName);
            List<String> cities = statesmap.get(stateName);
            for(String city:cities){
                System.out.println("city: "+city);
            }
        }
    }
}
