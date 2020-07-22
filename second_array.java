package com.test;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

//以下是关于一维数组和二维数组的知识应用
//数组算法
public class second_array {
    public static void main(String args[]) {
    }
    //记录学生的成绩 从中找出学生的最高分并打出学生的等级
    static void studentscore() {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int number = scan.nextInt();
        System.out.println("请输出学生的成绩");
        int max = 0;
        int[] student = new int[number];
        for (int i = 0; i < student.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位学生的成绩:");
            int b = scan.nextInt();
            student[i] = b;
            if (b > max) {
                max = b;
            }
        }
        for (int j = 0; j < student.length; j++) {
            switch ((max - student[j]) / 10) {
                case 0:
                    System.out.println("student " + j + " score is " + student[j] + " grade is A");
                    break;
                case 1:
                    System.out.println("student " + j + " score is " + student[j] + " grade is B");
                    break;
                case 2:
                    System.out.println("student " + j + " score is " + student[j] + " grade is C");
                    break;
                default:
                    System.out.println("student " + j + " score is " + student[j] + " grade is D");
                    break;
            }
        }

    }

    //算法一：  杨辉三角
    static void yanghuisanjiao(){
        int [][]arr = new int[10][10];
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<i+1;j++)
            {
                if (j==0||j==i) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]+"\t");
                }
                else
                {
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                    System.out.print(arr[i][j]+"\t");
                }

            }
            System.out.println();
        }
    }

    //回形数
    static void huixingshu(){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入矩阵的维数: ");
        int n = scan.nextInt();
        int number = 1;
        int[][] arr = new int[n][n];
        int start = 0;      //起始点坐标
        int end = n - 1;    //终止点坐标
        while (start<end) {   //一个回形为一个大循环
            for (int i = start; i <= end; i++)  //赋值第一行
            {
                arr[start][i] = number;
                number++;
            }
            for (int j = start + 1; j <= end; j++)  //赋值最后一列
            {
                arr[j][end] = number;
                number++;
            }
            for (int p = end -1; p >= start; p--)  //赋值最后一行
            {
                arr[end][p] = number;
                number++;
            }
            for (int q = end - 1; q >= start + 1; q--) //赋值第一列
            {
                arr[q][start] = number;
                number++;
            }
            start++;
            end--;
        }
        if (n%2!=0)   //判断是不是奇数回形数
        {
            arr[start][end] = number;
        }
        for (int k=0;k<arr.length;k++)
        {
            for (int v=0;v<arr[k].length;v++)
            {
                System.out.print(arr[k][v]+"\t");
            }
            System.out.println();
        }
    }

    //算法二：  求数组中元素的最大值。最小值，总和，平均数
    static void shuzu(){
        int []arr = new int[10];
        int max ;
        int min ;
        int sum =0;
        for (int i=0;i<arr.length;i++)  //为数组赋值
        {
            arr[i] = (int)(Math.random()*90+10);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        max = arr[0];
        for (int i=1;i<arr.length;i++)  //求最大值
        {
            if (max<arr[i])
                max = arr[i];
        }
        System.out.println(max);
        min = arr[0];
        for (int i=1;i<arr.length;i++)  //求最小值
        {
            if (min>arr[i])
                min = arr[i];
        }
        System.out.println(min);
        for (int i=0;i<arr.length;i++)  //求总和
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    //面试题目----创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值，同时，要求元素的值各不相同
    static void suijifuzhi(){
        int []arr = new int[6];
        for (int i=0;i<arr.length;i++) {
            arr[i] = (int) (Math.random() * 29+1);
            for (int j=0;j<i;j++)
            {
                while(arr[i]==arr[j])
                    arr[i] = (int) (Math.random() * 30);
            }
            System.out.print(arr[i] + " ");
        }
    }

    //算法三：数组的复制
    static void shuzu1(){
        int []array1,array2;
        //array1的初始化
        array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i=0;i<array1.length;i++)
        {
            System.out.print(array1[i]+"\t");
        }
        //赋值array2变量等于array1  地址值一样  地址的操作会影响地址中的数
        array2 = new int[array1.length];
        for (int i=0;i<array2.length;i++)
        {
            array2[i] = array1[i];
        }
        //修改array2中的偶索引元素，使其等于索引值
        for (int i=0;i<array2.length;i+=2)
        {
            array2[i] = i;
        }
        System.out.println();
        //打印array1
        for (int i=0;i<array1.length;i++)
        {
            System.out.print(array1[i]+"\t");
        }
    }

    //数组的反转
    static void shuzu2(){
        //中间变量进行接收
        int []array;
        array = new int[]{2,3,5,7,11,13,17,19};
        //反转
        for (int i = 0; i < (array.length/2); i++) {
            int a = array[i];
            array[i] = array[array.length-1 - i];
            array[array.length - 1-i] = a;
        }
        //遍历
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    //数组的查找(搜索)--线性查找
    static void shuzu3(){
        String []arr = new String[]{"aa","cc","ee","dd","bb"};
        String goal = "ee";
        boolean flag = true;
        for (int i=0;i<arr.length;i++)
        {
            if (goal.equals(arr[i]))
            {
                System.out.print(i);
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.print("没有找到");
        }
    }

    /*数组的查找(搜索)--二分法查找
    前提--所要查找到数组必须有序*/
    static void shuzu4(){
        int []arr = new int[]{-98,-65,-41,2,31,51};
        int start = 0;  //初始索引值
        int end = arr.length-1;  //末尾索引值
        int goal = 31;
        boolean flag = true;
        while (start<=end)
        {
            int middle = (start+end)/2;
            if (arr[middle]==goal)
            {
                System.out.print(middle);
                flag = false;
                break;
            }
            else if (goal>arr[middle])
            {
                start = middle+1;
            }
            else{
                end = middle-1;
            }
        }
        if (flag)
            System.out.print("没有找到");
    }


}

