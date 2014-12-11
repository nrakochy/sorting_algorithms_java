package com.company;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class InsertionSortTest {

    @Test
    public void verifySortReturnsSortedListWhenGivenPresortedArray(){
        InsertionSort sorter = new InsertionSort();
        Integer[] twoElementArray = new Integer[]{1,2};
        List sortedTwoElementList = Arrays.asList(twoElementArray);

        assertEquals("Did not return presorted list", sortedTwoElementList, sorter.sort(twoElementArray));
    }

    @Test
    public void verifySortReturnsSortedListWhenGivenArrayOfTwoUnsortedElements(){
        InsertionSort sorter = new InsertionSort();
        Integer[] twoElementArray = new Integer[]{2,1};
        Integer[] sortedTwoElementArray = new Integer[]{1,2};
        List sortedTwoElementList = Arrays.asList(sortedTwoElementArray);

        assertEquals("Did not return correctly sorted two-element list", sortedTwoElementList, sorter.sort(twoElementArray));
    }

   @Test
    public void verifySortReturnsSortedListWhenGivenArrayOfThreeUnsortedElements(){
        InsertionSort sorter = new InsertionSort();
        Integer[] threeElementArray = new Integer[]{2,3,1};
        Integer[] sortedThreeElementArray = new Integer[]{1,2,3};
        List sortedThreeElementList = Arrays.asList(sortedThreeElementArray);

        assertEquals("Did not return correctly sorted three-element list", sortedThreeElementList, sorter.sort(threeElementArray));
    }
}