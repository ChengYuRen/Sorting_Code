package com.Algorithm.violence_Test;

import java.util.Random;

public class test_Top100 {

    public static void main(String[] args) {
        int numberCount = 100000000;
        int maxNumber = numberCount;
        int inputArray[] = new int[numberCount];
        Random random = new Random();
        for (int i = 0; i < numberCount; i++) {
            inputArray[i] = Math.abs(random.nextInt(maxNumber));
        }
        System.out.println("开始排序...");

        long current = System.currentTimeMillis();

        int[] result = test_Top100.getTop100(inputArray);
        System.out.println("排序耗时:");
       System.out.println(System.currentTimeMillis() - current);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
    public static int[] getTop100(int[] inputArray){

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            if (maxValue < inputArray[i]) {
                maxValue = inputArray[i];
            }
        }
        byte[] bitmap = new byte[maxValue+1];
        for (int i = 0; i < inputArray.length; i++) {
            int value=inputArray[i];
            bitmap[value] = 1;
        }

        int[] result = new int[10];
        int index = 0;
        for (int i = maxValue; i >= 0 & index < 10; i--) {
            if (bitmap[i] == 1) {
                result[index++] = i;
            }
        }
        return result;
    }
}
