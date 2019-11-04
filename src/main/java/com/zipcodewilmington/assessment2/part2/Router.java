package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Router {
    private String path;
    private String controller;
    HashMap<String,String> routerThing = new HashMap<>();


    public void add(String path, String controller) {

       routerThing.put(path,controller);
    }

    public Integer size() {

        return routerThing.size();
    }

    public String getController(String path) {

        return routerThing.get(path);
    }

    public void update(String path, String studentController) {

        routerThing.replace(path, studentController);
    }

    public void remove(String path) {

        routerThing.remove(path);
    }

    @Override
    public String toString(){
        String result ="";
//       return  routerThing.toString().replace("{","")
//               .replace("}","").replace("=","")+"\n";
        for (Map.Entry routerEntry : routerThing.entrySet()){
           result += new StringBuilder().append(routerEntry.toString()).append("\n").toString().replace("=","");
        }
        return result;
    }
}
