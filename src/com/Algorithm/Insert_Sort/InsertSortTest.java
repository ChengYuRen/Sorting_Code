package com.Algorithm.Insert_Sort;

import com.Algorithm.Bubble_Sort.Bubble_Sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    @Test
    void insertSort() {
        int[] testArray={1042,33,4,67,5,89,123,456,777,3456,121,0,961127,-1,-122};
        System.out.print(Arrays.toString(InsertSort.insertSort(testArray)));
    }
}