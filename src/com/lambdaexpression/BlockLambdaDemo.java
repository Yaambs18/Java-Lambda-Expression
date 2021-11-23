package com.lambdaexpression;

interface NumericFunc{
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = n -> {
            int result=1;

            for(int i=1; i<=n; i++)
                result *=i;
            return  result;
        };

        System.out.println("The factorial of 5 is "+factorial.func(5));
        System.out.println("The factorial of 7 is "+factorial.func(7));
    }
}
