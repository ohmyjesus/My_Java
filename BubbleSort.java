package com.test;

public class BubbleSort {
    //冒泡排序
    public static void main(String[] args)
    {
        int []arr = new int[]{99,55,42,68,-6,0,85,14,32};
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
