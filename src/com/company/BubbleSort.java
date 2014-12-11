package com.company;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public List sort(Integer[] unsortedArray) {
        List sortedList = new ArrayList<Integer>();

        for (Integer unsortedArrayIndex = 0; unsortedArrayIndex < unsortedArray.length - 1; unsortedArrayIndex++) {
            Integer element1 = unsortedArray[unsortedArrayIndex];
            Integer element2 = unsortedArray[unsortedArrayIndex + 1];
            arrangeTwoElementsInList(element1, element2, unsortedArrayIndex, sortedList);
        }
        return sortedList;
    }

    private List arrangeTwoElementsInList(Integer element1, Integer element2, Integer arrayIndex, List sortedList) {
        if ((element1 < element2)) {
            sortedList.add(arrayIndex, element1);
            sortedList.add(arrayIndex + 1, element2);
        } else {
            sortedList.add(arrayIndex, element2);
            sortedList.add(arrayIndex + 1, element1);
        }
        return sortedList;
    }
}
