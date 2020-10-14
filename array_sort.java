package com.test;

import java.util.Arrays;

/**
 *  算法四之数组元素的排序算法
 */
public class array_sort {
    public static void main(String args[]) {
        //冒泡排序  8个数需要7大轮循环
        int []arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }

        //遍历
        System.out.print(Arrays.toString(arr));
    }
}
