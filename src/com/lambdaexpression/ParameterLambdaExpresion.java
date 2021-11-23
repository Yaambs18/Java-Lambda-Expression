package com.lambdaexpression;

interface NumericTest{
    boolean test(int n);
}

public class ParameterLambdaExpresion {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n%2)==0;

        if(isEven.test(10)) System.out.println("10 is even");
        if(!isEven.test(9)) System.out.println("9 is odd");

        NumericTest isPositive = (n) -> n>=0;

        if(isPositive.test(1)) System.out.println("1 is positive");
        if(!isPositive.test(-1)) System.out.println("-1 is negative");
    }
}
