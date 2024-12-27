package com.mohan.javaBasics;

public class Day1 {
    public static void main(String[] args) {
     //Write a program to check if a number is even or odd.
        System.out.println(checkEvenOrOdd( 3));
        //Write a program to print the Fibonacci series up to n terms.
        int num=7;
        System.out.println(FindFibSeries(num));
        System.out.println();
        //Write a program to find the factorial of a number using loops.
        int num1=4;
        int ans=1;
        for(int i=1;i<=num1;i++){
            ans=ans*i;
        }
        System.out.println(ans);

//        int x=1;
//        int y=2;
//        System.out.println(sub(mul(add(x,y),2),3));

    }

    private static int FindFibSeries(int num){
     //   System.out.print( " "+num);
        if(num <=1 )
            return num;
        else
            return (FindFibSeries(num-1) + FindFibSeries(num -2));
    }

    public  static  String checkEvenOrOdd(int num){
        return num %2 ==0 ? "Even" :"Odd";
    }

    public  static  int add(int x,int y){
        System.out.println("add x="+x+" y="+y +" x+y = "+(x+y));
        return x+y;
    }
    public  static  int mul(int x,int y){
        System.out.println("mul x="+x+" y="+y +" x*y = "+(x*y));
        return x*y;
    }

    public  static  int sub(int x,int y){
        System.out.println("sub x="+x+" y="+y +"  x-y = "+( x-y));
        return x-y;
    }
}
