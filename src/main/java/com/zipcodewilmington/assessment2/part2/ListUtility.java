package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ListUtility {
    ArrayList<Integer> newList = new ArrayList<>();


    public Boolean add(int i) {

        return newList.add(i);
    }

    public Integer size() {

        return newList.size();
    }

    public List<Integer> getUnique() {

        return newList.stream().distinct().collect(Collectors.toList());
    }

    public String join() {

        return newList.toString().replace("[","").replace("]", "") ;
    }

    public Integer mostCommon() {

        int maxCount = 1;
        int numberChecked = newList.get(0);
        int currentCount = 1;
        for (int i = 0; i < newList.size() -1; i++) {
            if (newList.get(i) == newList.get(i+1)) {
                currentCount++;
            } else if (currentCount > maxCount) {
                maxCount = currentCount;
                numberChecked = newList.get(i+1);
            }

        }
        return numberChecked;
    }

    public Boolean contains(Integer valueToAdd) {

        return newList.contains(valueToAdd);
    }
}
