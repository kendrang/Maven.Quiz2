package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
    ArrayList<Integer> merged = new ArrayList<>();

         merged.addAll(Arrays.asList(array1));
         merged.addAll(Arrays.asList(array2));

        return merged.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        ArrayList<Integer> firstHalf = new ArrayList<>();
        for (int i = 0 ; i < array.length -1 ; i++){
            firstHalf.add(array[index + i]);
        }

        ArrayList<Integer> lastHalf = new ArrayList<>();
        for (int j= 0 ; j < array.length ; j++){
            if(array[j]!= index){
            lastHalf.add(array[j]);
            }
            else break;
        }
        firstHalf.addAll(lastHalf);
        System.out.println(firstHalf);

        return firstHalf.toArray(new Integer[0]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                counter++;
            }
        }
        for (int j = 0; j < array2.length; j++) {

            if (array2[j] == valueToEvaluate) {
                counter++;
            }
        }

        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int maxCount = 1;
        int numberChecked = array[0];
        int currentCount = 1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i + 1]) {
                currentCount++;
            } else if (currentCount > maxCount) {
                maxCount = currentCount;
                numberChecked = array[i + 1];
            }

        }
        return numberChecked;

    }
}
