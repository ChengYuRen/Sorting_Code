package com.Algorithm.Bubble_Sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Bubble_SortTest {

    @Test
    void bubbleSort() {
        int[] testArray={1042,33,4,67,5,89,123,456,777,3456,121,0,961127,-1,-122};
        System.out.print(Arrays.toString(Bubble_Sort.BubbleSort(testArray)));
    }
}