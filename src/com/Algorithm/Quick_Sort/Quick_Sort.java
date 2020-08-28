package com.Algorithm.Quick_Sort;

/**
 * @author ChengYuRen
 */

public class Quick_Sort {

    /**
     * @param array  传入的数组
     * @param left   左边际
     * @param right  右边际
     * @return 返回拍好序的数组
     */
    public static int[] quick_sort(int[] array, int left, int right){
        if (left<right){
            int middle= Data_partition(array,left,right);
            //两次递归分别是 左右两侧的数组的排序 左右排好序以后 —>整体有序
            array =quick_sort(array,left,middle-1);
            array =quick_sort(array,middle+1,right);
        }
        return array;
    }

    /**
     * @param arr 传入的数组
     * @param left 左边际
     * @param right 右边际
     * @return 一个具体数组 即中轴元素的位置（不断变化）
     */
    private static int Data_partition(int[] arr, int left, int right){

        int Axis_element =arr[left];   //选取中轴元素 基准元素
        int i=left+1;
        int j=right;
        while (true){
            // 向右找到第一个小于等于 pivot 的元素位置
            while (i<=j && arr[i]<= Axis_element){
                i++;
            }
            // 向左找到第一个大于等于 pivot 的元素位置
            while (i<=j && arr[j]>= Axis_element){
                j--;
            }
            if (i>=j){
                break;
            }
           //交换两个元素的位置，使得左边的元素不大于pivot,右边的不小于pivot
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        arr[left]=arr[j];
        // 使中轴元素处于有序的位置
        arr[j]=Axis_element;
        return j;

    }
}
