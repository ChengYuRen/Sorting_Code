package com.Algorithm.Select_Sort;

import java.util.Arrays;

public class Select_Sort {
    public Select_Sort(int[] array) {

    }

    public static int[] SelectSort(int[] Num_arrays) {
        int length = Num_arrays.length;  //获取长度
        for (int i = 0; i < length - 1; i++) {
            int min_Num = i;
            for (int j = i + 1; j < length; j++) {
                if (Num_arrays[min_Num] > Num_arrays[j]) {
                    min_Num = j;  //交换下标
                }
            }
            int temp = Num_arrays[i];
            Num_arrays[i] = Num_arrays[min_Num];
            Num_arrays[min_Num] = temp;
        }
        return Num_arrays;
    }

}
