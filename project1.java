package com.test;
import java.util.Scanner;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.swing.*;

public class project1 {
    public static void main(String args[]){
        //定义四个变量用来存储数据
        String inorout = "";  //收支
        int account =10000;  //账户余额

        String details = "";  //记录用户收入和支出的详情
        label:for (;;)
        {
            System.out.println("************家庭收支记账软件************\n"); //初始化程序
            System.out.println("           1 收支明细");
            System.out.println("           2 登记收入");
            System.out.println("           3 登记支出");
            System.out.println("           4 退   出\n");
            System.out.print("          请选择<1-4>：");

            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (number!=1&&number!=2&&number!=3&&number!=4)
            {
                for (;;)
                {
                    System.out.print("请输出正确的数字:");
                    int number2 = scan.nextInt();
                    if (number2==1||number2==2||number2==3||number2==4)
                    {
                        number = number2;
                        break ;
                    }
                }
            }

            if (number==1) {//查询
                System.out.println("************当前收支明细记录************");
                System.out.println("收支\t\t\t账户金额\t\t\t收支金额\t\t\t说    明\n");
                System.out.print(details);  //记录用户收入和支出的详情
                System.out.println("-----------------------------------------------------------------\n");

                continue;
            }

            if (number==2) //收入
            {
                System.out.println();
                System.out.print("本次收入金额：");
                int income = scan.nextInt();
                System.out.print("本次收入说明：");
                String income_explain = scan.next();
                account+=income;
                details += "收入         "+account+"           "+income+"               "+income_explain+'\n';

                System.out.println("**************登记完成**************\n");
            }

            if (number ==3)  //支出程序
            {
                System.out.println();
                System.out.print("本次支出金额：");
                int pay = scan.nextInt();
                if (account<pay){
                    System.out.print("你没那么多钱\n");
                    for (;;) {
                        System.out.print("本次支出金额：");
                        int pay1 = scan.nextInt();
                        if (account>pay1){
                            break ;
                        }
                    }
                }
                System.out.print("本次支出说明：");
                String pay_explain = scan.next();
                account-=pay;
                inorout = "支出";
                details += "支出         "+account+"           "+pay+"               "+pay_explain+'\n';    //***很重要
                System.out.println("**************登记完成**************\n");
            }

            if (number==4)  //退出程序
            {
                System.out.print("是否退出(Y/N):");
                for (;;) {
                    String exit = scan.next();
                    if (exit.equals("y")){
                        break label;
                    }
                    else if (exit.equals("n"))
                    {
                        continue label;
                    }
                    else{
                        System.out.print("请输出正确的字母：");
                    }

                }

            }
        }
    }


}
