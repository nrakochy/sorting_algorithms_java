package com.company;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public List sort(List<Integer> unsortedList) {
        for (Integer unsortedListIndex = 0; unsortedListIndex < (unsortedList.size()- 1); unsortedListIndex++) {
            Integer element1 = unsortedList.get(unsortedListIndex);
            Integer element2 = unsortedList.get(unsortedListIndex + 1);
            rearrangeTwoElementsInList(element1, element2, unsortedListIndex, unsortedList);
        }
        return unsortedList;
    }

    private List rearrangeTwoElementsInList(Integer element1, Integer element2, Integer listIndex, List unsortedList) {
        if ((element1 > element2)) {
            unsortedList.add(listIndex + 1, element1);
            unsortedList.add(listIndex, element2);
        }
        return unsortedList;
    }
}
