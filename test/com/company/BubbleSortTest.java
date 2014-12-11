package com.company;


import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void verifySortReturnsSortedListWhenGivenPresortedArray() {
        BubbleSort sorter = new BubbleSort();
        List<Integer> twoElementList = new ArrayList<Integer>();
        twoElementList.add(1);
        twoElementList.add(2);
        assertEquals("Did not return presorted list", twoElementList, sorter.sort(twoElementList));
    }

    @Test
    public void verifySortReturnsSortedListWhenGivenArrayOfTwoUnsortedElements() {
        BubbleSort sorter = new BubbleSort();
        List<Integer> twoElementList = new ArrayList<Integer>();
        twoElementList.add(2);
        twoElementList.add(1);

        List<Integer> sortedTwoElementList = new ArrayList<Integer>();
        twoElementList.add(1);
        twoElementList.add(2);

        assertEquals("Did not return correctly sorted two-element list", sortedTwoElementList, sorter.sort(twoElementList));
    }
//
//    @Test
//    public void verifySortReturnsSortedListWhenGivenArrayOfThreeUnsortedElements() {
//        BubbleSort sorter = new BubbleSort();
//        ArrayList<Integer> threeElementArray = new ArrayList<Integer>{2, 3, 1};
//        ArrayList<Integer> sortedThreeElementArray = new ArrayList<Integer>{1, 2, 3};
//        List sortedThreeElementList = Arrays.asList(sortedThreeElementArray);
//
//        assertEquals("Did not return correctly sorted three-element list", sortedThreeElementList, sorter.sort(threeElementArray));
//    }
//
//    @Test
//    public void verifySortReturnsSortedListWhenGivenArrayOfFourUnsortedElements() {
//        BubbleSort sorter = new BubbleSort();
//        ArrayList<Integer> fourElementArray = new ArrayList<Integer>{4, 3, 2, 1};
//        ArrayList<Integer> sortedFourElementArray = new ArrayList<Integer>{1, 2, 3, 4};
//        List sortedFourElementList = Arrays.asList(sortedFourElementArray);
//
//        assertEquals("Did not return correctly sorted three-element list", sortedFourElementList, sorter.sort(fourElementArray));
//    }
//
//    @Test
//    public void verifySortReturnsSortedListWhenGivenArrayOfFourUnsortedElementsWithDuplicateNumbers() {
//        BubbleSort sorter = new BubbleSort();
//        ArrayList<Integer> fourElementArray = new ArrayList<Integer>{4, 4, 2, 2};
//        ArrayList<Integer> sortedFourElementArray = new ArrayList<Integer>{2, 2, 4, 4};
//        List sortedFourElementList = Arrays.asList(sortedFourElementArray);
//
//        assertEquals("Did not return correctly sorted three-element list", sortedFourElementList, sorter.sort(fourElementArray));
//    }
//
//    @Test
//    public void verifySortReturnsSortedListWhenGivenArrayOfTwentyUnsortedElementsWithDuplicateNumbers() {
//        BubbleSort sorter = new BubbleSort();
//        ArrayList<Integer> twentyElementArray = new ArrayList<Integer>{20, 19, 18, 10, 9, 8, 7, 17, 16, 15, 14, 6, 5, 4, 3, 2, 1, 13, 12, 11};
//        ArrayList<Integer> sortedTwentyElementArray = new ArrayList<Integer>{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        List sortedTwentyElementList = Arrays.asList(sortedTwentyElementArray);
//
//        assertEquals("Did not return correctly sorted three-element list", sortedTwentyElementList, sorter.sort(twentyElementArray));
//    }
}