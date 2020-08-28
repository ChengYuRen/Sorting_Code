package com.Algorithm.Insert_Sort;

public class InsertSort {


    public InsertSort(int[] testArray) {
    }

    public static int[] insertSort(int[] ints){
        if (ints.length < 2){
            //判断 输入的 数组要是仅仅只有一个数字  直接返回即可
            return ints;
        }
        int Num_length=ints.length;   //数组的长度

        //第一遍遍历数组
        for (int i=1;i<Num_length;i++){
            int temp=ints[i];  //数组的第二个元素 作为主动去比较的对象
            int k=i-1;
            while (k>=0 && ints[k]>temp){
                k--;
                //腾出位置 插入数据
            }

            for (int j=i;j>k+1;j--){
                ints[j]=ints[j-1];  //插入

            }
            ints[k+1]=temp;
        }
        return ints;
    }
}
