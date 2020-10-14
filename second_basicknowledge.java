package com.test;
import java.util.Scanner;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.swing.*;

//以下是关于java第二章基础知识
public class second_basicknowledge {
    public static void main(String args[]) {
//        int arr[][] = new int[5][3];
//        System.out.println(arr[0][0]);
}
    //猜中彩票，比较两位数，完全猜对，或者顺序不对但猜中了两个数，或者...
    static void caipiao() {
      //if-else猜彩票的问题

        int random = (int)(Math.random()*90+10);
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个两位数(0-99)：");
        int number = scan.nextInt();
        int a = random/10;
        int b = random - 10*a;
        int c = number/10;
        int d = number - 10*c;
        if (a==c && b==d){
            System.out.println("奖金10000");
        }else if (a==d&&b==c){
            System.out.println("奖金3000");
        }else if (a==c||b==d){
            System.out.println("奖金1000");
        }else if (a==d||b==c){
            System.out.println("奖金500");
        }else {
            System.out.println("nothing");
        }
        System.out.println(random);

    }

    //输入两个正整数m和n， 求其最大公约数和最小公倍数
    static void gongeyushu(){
        //输入两个正整数m和n， 求其最大公约数和最小公倍数
        Scanner scan = new Scanner(System.in);
        System.out.print("输入第一个数：");
        int m = scan.nextInt();
        System.out.print("输入第二个数：");
        int n = scan.nextInt();
        if (m<n){   //取出最大数
            int a =n;
            n = m;
            m = a;
        }

        for (int i=1;;i++){   //求出最小公倍数
            if ((m*i)%n==0) {
                System.out.print("最小公倍数是： ");
                System.out.println(m * i);
                break;
            }
        }
        //判断n是奇数还是偶数
        if (n%2==0){
            for (int i=(n/2);i>=1;i--){
                if (m%i==0&&n%i==0){
                    System.out.print("最大公约数是： ");
                    System.out.println(i);
                    break;
                }
            }
        }

        if (n%2!=0){
            for (int i=((n-1)/2);i>=1;i--){
                if (m%i==0&&n%i==0){
                    System.out.print("最大公约数是： ");
                    System.out.println(i);
                    break;
                }
            }
        }

    }

    //输入年月日，求出这一天是这一年的第多少天
    static void nianyueri(){
        int m1=31,m2=28,m3=31,m4=30,m5=31,m6=30,m7=31,m8=31,m9=30,m10=31,m11=30,m12=31;

        Scanner scan = new Scanner(System.in);
        System.out.println("年");
        int a = scan.nextInt(); //年
        System.out.println("月份");
        int b = scan.nextInt();
        System.out.println("日");
        int c = scan.nextInt();
        if ((a%4==0&&a%100!=0)||(a%400==0)){
            m2+=1;

        }else {

        }
        switch (b-1){
            case 0:
                System.out.println(c);
                break;
            case 1:
                System.out.println(m1+c);
                break;
            case 2:
                System.out.println(m1+m2+c);
                break;
            case 3:
                System.out.println(m1+m2+m3+c);
                break;
            case 4:
                System.out.println(m1+m2+m3+m4+c);
                break;
            case 5:
                System.out.println(m1+m2+m3+m4+m5+c);
                break;
            case 6:
                System.out.println(m1+m2+m3+m4+m5+m6+c);
                break;
            case 7:
                System.out.println(m1+m2+m3+m4+m5+m6+m7+c);
                break;
            case 8:
                System.out.println(m1+m2+m3+m4+m5+m6+m7+m8+c);
                break;
            case 9:
                System.out.println(m1+m2+m3+m4+m5+m6+m7+m8+m9+c);
                break;
            case 10:
                System.out.println(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+c);
                break;
            case 11:
                System.out.println(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+c);
                break;

        }

    }

    //输出一个菱形
    static void lingxing(){
        //上半部分
        for (int i=1;i<6;i++){   //控制行数
            for (int j=5-i;j>0;j--) { //输出空格
                System.out.print(' ');
            }

            System.out.print('*');

            for (int m=1;m<i;m++){//输出一对 空格 *
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        //下半部分
        for (int i=1;i<5;i++){   //控制行数
            for (int j=1;j<i;j++) { //输出空格
                System.out.print(' ');
            }

            for (int m=5;m>i;m--) {//输出一对 空格 *
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //输出99乘法表
    static void chengfa(){
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                int a=i*j;
                System.out.print(i+"*"+j+"="+a+" ");
            }
            System.out.println();
        }

    }

    //求质数2-100
    static void zhishu(){
        long start = System.currentTimeMillis(); //记录当时时间毫秒级
        System.out.println(start);
        for (int i=2;i<100;i++)
        {
            for (int j=i/2;j>0;j--)
            {
                if (j==1)
                {
                    System.out.println(i);
                }
                if (i%j==0)
                {
                    break;
                }

            }

        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start);
    }

    //带label的for和continue循环
    static void label(){

        label:for (int i=1;i<4;i++)
        {
            for (int j=1;j<10;j++)
            {
                if (j%4==0)
                {
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }


    }

    //求出1-1000的完数 完数：一个数如果恰好等于它的因子之和 如6=3+2+1
    static void wanshu(){
        int i;
        int num=0;
        label:for (int j=2;j<1000;j++)
        {
            num = 0;
            for (int k=j-1;k>0;k--)
            {
                if (j%k==0){
                    num+=k;
                }
                if (k==1){
                    if (num==j)
                    {
                        System.out.println(j);
                    }
                    else {
                        continue label;
                    }
                }
            }
        }

    }
}
