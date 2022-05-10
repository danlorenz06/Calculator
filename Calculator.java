package com.Ecpe205.Factorial;

import java.util.Scanner;

public class factorial {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value");
        int a = in.nextInt();

        int number = a;//It is the number to calculate factorial
        int i, fact=1;
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    public int equals(int value, int i) 

public static int basepowerexp(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * basepowerexp(exp - 1, base);}}
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base: ");
        int base = Integer.parseInt(in.nextLine());
        System.out.println("Enter Base: ");
        int exp = Integer.parseInt(in.nextLine());
        System.out.println("The answer to " + base + " to the power of " + exp
                + " is " + basepowerexp(base, exp));}}

   public int equals(int value, int i) {
        return 0;
    }

//https://github.com/danlorenz06/ecpe205-unit-test.git