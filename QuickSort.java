package com.test;

import java.util.Arrays;

public class QuickSort {
    //快速排序
    public static void main(String[] args){
        int[] data = new int[]{9,-16,30,23,-30,-49,25,21,30};
        quicksort(data);
        System.out.println(Arrays.toString(data));
    }

    static void quicksort(int[] data){
        sort(data,0,data.length-1);
    }

    static void sort(int[] data, int start, int end)
    {
        if (start<end){
            int base = start;
            int low = start;
            int high = end + 1;
            while(true)
            {
                while(low<end&&data[++low]<=data[base])
                    ;
                while (high > start && data[--high] >= data[base] )
                    ;
                if (low<high){
                    swap(data, low, high);
                }
                else
                {
                    break;
                }
            }
            swap(data, start, high);
            sort(data, start, high-1); //递归调用
            sort(data, high+1, end);
        }
    }
    static void swap(int[] data, int i,int j)
    {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
