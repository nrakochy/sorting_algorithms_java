package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12/10/14.
 */
public class InsertionSort {
    public List sort(Integer[] unsortedArray) {
        List<Integer> sortedList = new ArrayList<Integer>();
        Integer unsortedArrayLength = unsortedArray.length;

        for(Integer unsortedIndex = 0; unsortedIndex < unsortedArrayLength; unsortedIndex++){
            Integer unsortedElement = unsortedArray[unsortedIndex];

            if (sortedList.isEmpty()) {
                sortedList.add(unsortedElement);
            } else {
                Integer sortedListSize = sortedList.size();
                for(Integer sortedIndex = 0; sortedIndex < sortedListSize; sortedIndex++){
                    if(unsortedElement <= sortedList.get(sortedIndex)){
                        sortedList.add(sortedIndex, unsortedElement);
                        sortedIndex = sortedListSize;
                    }
                }
                if(unsortedElement > sortedList.get(sortedListSize-1)){
                    sortedList.add(unsortedElement);
                }
            }
        }
        return sortedList;
    }
}


// Details on the algorithm can be found on wikipedia- http://en.wikipedia.org/wiki/Insertion_sort


