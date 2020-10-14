package com.test;
import sun.util.resources.cldr.so.CurrencyNames_so_ET;

import java.util.Scanner;

//面向对象 综合练习一
//1.创建一个Customer，名字叫JaneSmith，他有一个账号id为1000， 余额为2000， 年利率为0.0123的账户。
//2.对JaneSmith进行操作，存入100元，再取出960元，再取出2000元，打印出JaneSmith的基本信息。
public class practice1 {
    public static void main(String[] args){
        Customer c1 = new Customer("Jane","Smith");
        Account a1 = new Account(1000,2000,0.0123);
        c1.setAccount(a1);
        c1.getAccount().deposit(100);
        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(2000);
        System.out.print("Customer ["+c1.getFirstname()+" "+c1.getLastname()+"] has a account:"+"id is "+c1.getAccount().getId()+", "+"annualInterestRate is "
        +c1.getAccount().getAnnualInterestRate()+", "+"balance is "+c1.getAccount().getBalance());
    }
}

class Account{
    private int id;   //账户
    private double balance;  //余额
    private double annualInterestRate;  //年利率

    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void withdraw(double amout){
        if (balance<amout){
            System.out.println("余额不足，取款失败");
        }else {
            balance -= amout;
            System.out.println("成功取出"+amout);
        }
    }

    public void deposit(double amout){
        if(amout>0){
            balance += amout;
            System.out.println("成功存入"+amout);
        }
    }

}

class Customer{
    private String firstname;
    private String lastname;
    private Account account;

    public Customer(String f,String l){
        this.firstname = f;
        this.lastname = l;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}