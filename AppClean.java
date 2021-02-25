package org.example.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppClean {

    public static void  main(String[] args){

        System.out.println(removeDoubleVolume());

    }

    public static List<Integer> removeDoubleVolume(){
        List<Integer> firstList = Arrays.asList(1,1,1,1,2,2,3,4,5);
        List<Integer> secondList = new ArrayList<>();
        int temporary = 0;
        for (Integer i : firstList) {
            if (temporary != i){
                temporary = i;
                secondList.add(temporary);
            }
        }
        return secondList;

    }
}
