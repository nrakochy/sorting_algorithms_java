package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void verifySortReturnsSortedArrayWhenGivenPresortedArray(){
        InsertionSort insertion_sort = new insertionSort();
        int[] twoElementArray = {1,2};
        int[] sortedTwoElementArray = {1,2};

        assertEquals("Did not return presorted array", sortedTwoElementArray, insertion_sort.sort(twoElementArray));
    }

    @Test
    public void verifySortReturnsSortedArrayWithTwoElements(){
        InsertionSort insertion_sort = new insertionSort();
        int[] twoElementArray = {2,1};
        int[] sortedTwoElementArray = {1,2};

        assertEquals("Did not return correctly sorted two-element array", sortedTwoElementArray, insertion_sort.sort(twoElementArray));
    }

}