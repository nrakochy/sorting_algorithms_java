package com.company;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public List sort(Integer[] unsortedArray) {
        List sortedList = new ArrayList<Integer>();

        for(Integer unsortedArrayIndex = 0; unsortedArrayIndex < unsortedArray.length; unsortedArrayIndex++){
            Integer element1 = unsortedArray[unsortedArrayIndex];


        }
        return sortedList;
    }

    private boolean elementOneIsBiggerThanElementTwo(Integer element1, Integer element2) {
        if (element1 > element2) {
            return true;
        } else {
            return false;
        }
    }
}
