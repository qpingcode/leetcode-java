package me.qping.learning;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description 快排
 * @Author qping
 * @Date 2018/8/14 08:57
 * @Version 1.0
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,3,6,4,21,4,67,8,4,9};

        System.out.println(Arrays.toString(arr));
        quickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int left, int right) {

        int i = left;
        int j = right;

        if(i >= j){
            return;
        }

        int key = arr[i];


        while(i < j){
            // 右边哨兵移动直至找到比key值小的
            while(i < j && arr[j] > key){
                j--;
            }

            // 左边哨兵移动直至找到比key值大的
            while(i < j && arr[i] <= key){
                i++;
            }

            // 交换哨兵找到的两个位置
            if(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // 交换key值和最后哨兵碰头的位置
        arr[left] = arr[i];
        arr[i] = key;

        // 分两段继续排序
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

    public static void quickSort2(int[] arr, int left, int right) {

        int i = left;
        int j = right;

        if(i >= j){
            return;
        }

        int key = arr[i];


        while(i < j){
            // 右边哨兵移动直至找到比key值小的
            while(i < j && arr[j] < key){
                j--;
            }

            // 左边哨兵移动直至找到比key值大的
            while(i < j && arr[i] >= key){
                i++;
            }

            // 交换哨兵找到的两个位置
            if(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // 交换key值和最后哨兵碰头的位置
        arr[left] = arr[i];
        arr[i] = key;

        // 分两段继续排序
        quickSort2(arr, left, i - 1);
        quickSort2(arr, i + 1, right);
    }



}
