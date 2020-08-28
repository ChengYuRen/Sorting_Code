package com.Algorithm.Shell_Sort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Shell_SortTest {

    @org.junit.jupiter.api.Test
    void sort() {
        int[] testArray={1042,33,4,67,5,89,123,456,777,3456,121,0,961127,-1,-122};
        System.out.print(Arrays.toString(Shell_Sort.sort(testArray)));

    }
}