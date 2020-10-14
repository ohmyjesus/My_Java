package com.test;
import com.sun.xml.internal.stream.StaxErrorReporter;
import sun.security.mscapi.CPublicKey;

import java.util.Scanner;

//以下是关于类与对象的知识  类的设计及方法定义
public class four_object {
    public static void main(String args[]){
        //声明Student类型的数组
        Student[] stus = new Student[20];
        for (int i=0;i<stus.length;i++){
            //给数组元素赋值
            stus[i] = new Student();
            //给Student对象的属性赋值
            stus[i].number = i+1;
            //年级[1,6]
            stus[i].state = (int)(Math.random()*6+1);
            //成绩[0,100]
            stus[i].score = (int)(Math.random()*101);
        }
        //遍历
        Student test = new Student();
        test.bianli(stus);

        //打印三年级的学生信息
        test.question1(stus);

        //使用冒泡排序按学生成绩排序，并遍历所有学生信息
        test.question2(stus);
        test.bianli(stus);
    }
}

class student{
    //属性
    public int  age;
    public String name;

    //方法 权限修饰符-返回值类型-方法名-形参列表
    public void eat(){
        System.out.println("吃");
    }
    public void drink(String win){
        System.out.println("喝"+win);
    }
    public String getName(){
        return "tom ";
    }

}

//课后练习1：类的设计
class Person{
    String name ;
    int age ;
    int sex ;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age: " + age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}

//课后练习2：类的设计
class Circle2{
    //属性
    double radius;

    //求圆的面积 方式一 有返回值
//    public double Area(){
//        double area = 3.14 * radius * radius;
//        return area;
//    }

    //方式二 无返回值
    public void Area(){
        System.out.print(3.14*radius*radius);
    }
}

//课后练习3：方法声明
class exer3{
    public int method(int m,int n){
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return (m*n);
    }

}

//课后练习4：对象数组
class Student{
    int number; //学号
    int state;  //年级
    int score;  //成绩

    public void bianli(Student[] stus){
        //遍历学生数组
        for (int j=0;j<stus.length;j++){
            System.out.print("学号"+stus[j].number+",成绩"+stus[j].score+",年级"+stus[j].state);
            System.out.println();
        }
    }
 
    public void question1(Student[] stus){
        //问题一：打印出3年级(state=3)的学生信息
        System.out.println("*******************");
        for (int k=0;k<stus.length;k++){
            if (stus[k].state == 3){
                System.out.println("学号"+stus[k].number+",成绩"+stus[k].score+",年级"+stus[k].state);
            }
        }
    }

    public void question2(Student[] stus){
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        System.out.println("*******************");
        for (int i=0;i<stus.length-1;i++){
            for (int j=0;j<stus.length-1-i;j++){
                if (stus[j+1].score<stus[j].score){
                    //如果需要换序，交换的是数组的元素：Student对象
                    Student temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }
    }


}
