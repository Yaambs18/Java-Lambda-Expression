package com.lambdaexpression;

interface NumericTest2{
    boolean test(int num1, int num2);
}

public class ParameterLambdaExpression2 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (num1, num2) -> num1%num2==0;

        if(isFactor.test(10,2)){
            System.out.println("2 is a fctor of 10.");
        }

        if(!isFactor.test(10,3)){
            System.out.println("3 is not a fctor of 10.");
        }
    }
}
