package com.Algorithm.Quick_Sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Quick_SortTest {
    @Test
    void quick_sort() {
        int[] testArray={1042,33,4,67,5,89,123,456,777,3456,121,0,961127,-1,-122};
        int right=testArray.length-1;
        int left=0;
        System.out.print(Arrays.toString(Quick_Sort.quick_sort(testArray, left, right)));
    }
}