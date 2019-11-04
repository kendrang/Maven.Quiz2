package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        return null;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

//        Integer backCounter = 1;
//        Integer[] temp = new Integer[backCounter];
//        for (int j = 0; j < 1; j++) {
//            if (array[index - backCounter] >= 0) {
//                array[index - backCounter] = temp[j];
//                backCounter++;
//            }
//        }
//        System.out.println(temp.toString());
//
//        Integer[] rotated = new Integer[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            Integer counter = 0;
//            rotated[counter] = array[index + counter];
//            counter++;
//        }
//        rotated[rotated.length] = temp[0];
//
//        return rotated;
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer counter = 0;
        for (int i = 0 ; i < array1.length ; i ++) {
            if (array1[i] == valueToEvaluate) {
                counter++;
            }
        }
        for (int j = 0 ; j <array2.length ; j++){

            if (array2[j] ==valueToEvaluate){
                counter ++;
            }
        }

        return counter;
    }

    public Integer mostCommon(Integer[] array) {

        return null;
    }
}
