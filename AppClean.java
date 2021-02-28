package org.example.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class AppClean {
    private static int[] numbers;

    public static void  main(String[] args){

        System.out.println(removeDoubleVolume());

    }

    public static List<Integer> removeDoubleVolume(){
        int[] arr1 = {5,5,2,2,1,1,1,2,2,3,4,5,2,2};
        numbers = arr1;
        if(numbers.length == 0) return new ArrayList<Integer>();
        quickSort(0, numbers.length-1);

        List<Integer> secondList = new ArrayList<>();
        int temporary = numbers[0];
        secondList.add(temporary);
        for (int i=0; i < numbers.length; i++) {
            if (temporary != numbers[i]){
                temporary = numbers[i];
                secondList.add(temporary);
            }
        }
        return secondList;
    }

    private static void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(begin, end);

            quickSort(begin, partitionIndex-1);
            quickSort(partitionIndex+1, end);
        }
    }

    private static int partition(int begin, int end) {
        int pivot = numbers[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (numbers[j] <= pivot) {
                i++;

                int swapTemp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = swapTemp;
            }
        }

        int swapTemp = numbers[i+1];
        numbers[i+1] = numbers[end];
        numbers[end] = swapTemp;

        return i+1;
    }
}
