package com.Algorithm.Bubble_Sort;

public class Bubble_Sort {

    public static int[] BubbleSort(int[] array){
        if (array==null || array.length<2){
            return array;
        }
        int arrayLength= array.length;

        for (int i=0;i<arrayLength;i++){
            boolean flag=true;

            for (int j=0;j<arrayLength-1;j++){

                if (array[j+1]<array[j]){
                    flag=false;
                    int temp;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

            if (false){  //是否发生位置交换
                break;
            }
        }
        return array;
    }
}
