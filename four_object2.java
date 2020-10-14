package com.test;
import com.sun.xml.internal.stream.StaxErrorReporter;
import sun.rmi.server.Activation$ActivationSystemImpl_Stub;
import sun.security.mscapi.CPublicKey;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

//以下是关于类与对象的知识   封装性，构造器，this关键字。
public class four_object2 {
    public static void main(String args[]){

    }



}

//方法的重载练习习题
class example{
    double radius;


    public int max(int i,int j){
        return (i>j)?i:j ;
    }

    public double max(double i,double j){
        return (i>j)?i:j;
    }

    public double max(double i, double j, double k){
        double max = (i>j)?i:j;
        return (max>k)?max:k;
    }

    //探讨几道网红题
    //数组中的每个值都除以第一个值并将新值放在数组中。需要从后向前除
    public void example1(){
        int[] arr = new int[]{12, 3, 3, 34, 56, 77, 432};
        for(int i = arr.length - 1;i>=0;i--)
        {
            arr[i] = arr[i] / arr[0];
        }

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public void example2(){
        int[] arr = new int[]{1,2,3};
        System.out.println(arr); //地址值

        char[] arr1 = new char[]{'a','b','c'};
        System.out.println(arr1); //abc 底层调用的方法不用 所以不是地址值
    }

}


class Circle{
    double radius;

    //构造器
    public  Circle(){
        System.out.print("123");
    }

    public Circle(int n){
        radius = n;
    }
    //求圆的变量
    public double findArea(){
        return (Math.PI*radius*radius);
    }
}


class PassObject{
    public void printAreas(Circle c,int time){
        for (int i=1;i<=time;i++){
            c.radius = i;
            System.out.print(i+"  ");
            System.out.println("面积为："+c.findArea());
        }

    }
}

//构造器练习一
class Person1{
    private int age;
    private String name ;

    public Person1(){
        age = 18;
    }

    public Person1(String name , int i){
        name = name;
        age = i;
    }
}

//构造器练习二
class TriAngle{
    private double base;
    private double height;

    public TriAngle(){

    }
    public TriAngle(double b,double h){
        base = b;
        height = h;
    }

    public void setbase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }

    public void setHeight(double h){
        height =  h;
    }
    public double getHeight(){
        return height;
    }


}

//构造器练习三
class Boy{
    private String name;
    private int age;

    public Boy(){

    }

    public Boy(String name){
        this.name = name;
    }

    public Boy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String i){
        name = i;
    }
    public String getName(){
        return name;
    }
    public void setAge(int i){
        age = i;
    }
    public int getAge(){
        return age;
    }
    public void marry(Girl girl){
        System.out.print(girl.getName());
    }
    public void shout(){
        if(this.age>=22){
            System.out.print("ok");
        }else {
            System.out.print("fail");
        }

    }
}

class Girl{
    private String name;
    private int age;

    public Girl(){

    }

    public Girl(String name){
        this.name = name;
    }
    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String i){
        this.name = i;
    }
    public String getName(){
        return name;
    }
    public void marry(Boy boy){
        System.out.print(boy.getName());
        boy.marry(this);
    }
    //比较两个对象
    public int compare(Girl girl){
        if (this.age > girl.age){
            return 1;
        }else{
            return -1;
        }
    }
}







