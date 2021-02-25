package org.example.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GetVolume {

    public static void main(String[] args){

        System.out.println("Максимальным числом в списке будет: " + getMax());
        System.out.println("Минимальным числом в списке будет: " + getMin());
        System.out.println("Средним арифметическим числом из списка будет: " + getMedianVolume());

        }

        public static int getMedianVolume(){
         List<Integer> list = Arrays.asList(3,2,3,4,34,23,234);
         int temporary = 0 ;
         int result = 0;
            for (Integer i : list) {
                temporary += list.get(result);
                result++;
            }
            result = temporary / list.size();

        return result;
        }

        public static int getMin (){
            List<Integer> list = Arrays.asList(3,2,3,4,34,23,234);
            int minVolume = list.get(0);
            for (Integer i : list) {
                if(i < minVolume) minVolume = i ;
            }
        return minVolume;
        }

        public static int getMax (){
            List<Integer> list = Arrays.asList(3,2,3,4,34,23,234);
            int maxVolume = list.get(0);
            for (Integer i : list) {
                if(i > maxVolume) maxVolume = i ;
            }
        return maxVolume;
        }

}


