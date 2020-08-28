package com.Algorithm.Shell_Sort;

import java.util.Arrays;

public class Shell_Sort {

    public Shell_Sort(int[] array){}
    //int[] testArray={1042,33,4,67,5,89,123,456,777,3456,121,0,961127,-1,-122};

      // System.out.print(Arrays.toString(Shell_Sort.sort(testArray)));

    public static int[] sort(int[] ints) {
        int length = ints.length;
        int interval = length / 2;  //第一次的间隔 默认是长度的一半

        while (interval > 0) {
            for (int j = interval; j < length; j++) {
                int i = j;
                while (i >= interval && ints[i - interval] > ints[i]) {
                    int temp = ints[i - interval] + ints[i];
                    ints[i - interval] = temp - ints[i - interval];
                    ints[i] = temp - ints[i - interval];
                    i -= interval;
                }
            }
            interval = interval / 2;
        }
        return ints;
    }
}
