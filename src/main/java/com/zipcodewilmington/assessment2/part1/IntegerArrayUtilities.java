package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 ==0){
            return true;
        }

        else return false;
    }

    public Integer[] range(int start, int stop) {
        Integer [] answer = new Integer[(stop-start)+1];
        answer[0]= start;

            for (int j = 0 ; j < answer.length; j ++) {

                answer[j] = start ++;
        }

        return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer answer =0;
       answer = array[0] + array[1];
        return answer;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer answer =0;
        answer = array[array.length-1] * array[array.length-2];
        return answer;
    } // they meant last two
}
