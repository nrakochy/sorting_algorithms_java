package com.company;
import java.util.ArrayList;
/**
 * Created by user on 12/10/14.
 */
public class InsertionSort {
    public ArrayList sort(int[] unsortedArray){
        int unsortedArrayLength = unsortedArray.length;
        ArrayList<Integer> sortedArray = new ArrayList(unsortedArrayLength);
        for (sortedArrayIndex = 0; sortedArrayIndex <= unsortedArrayLength; sortedArrayIndex ++){
            int unsortedElement = unsortedArray[sortedArrayIndex];
        }
        return sortedArray;
    }
}

//INSERTION-SORT
// The insertion sort splits an array into two sub-arrays.
// The first sub-array (like the cards in your hand) is always sorted and increases in size as the sort continues.
// The second sub-array (like the cards to be picked up) is unsorted,
// contains all the elements yet to be inserted into the first sub-array, and decreases in size as the sort continues.

//The insertion sort maintains the two sub-arrays within the same array.
// At the beginning of the sort, the first element of the first sub-array is considered the "sorted array".
// With each pass through the loop, the next element in the unsorted second sub-array is placed into its proper position
// in the first sorted sub-array.

