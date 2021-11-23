package com.lambdaexpression;

interface SomeFunc<T>{
    T func(T t);
}

public class GenericFunctionalInterface {
    public static void main(String[] args) {
        // String reverse one
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for(i=str.length()-1; i>=0; i--)
                result+=str.charAt(i);

            return result;
        };
        System.out.println("Reverse of Lambda is "+ reverse.func("Lambda"));


        // Factorial func
        SomeFunc<Integer> factorial = n -> {
            int result=1;

            for(int i=1; i<=n; i++)
                result *=i;
            return  result;
        };
        System.out.println("The factorial of 5 is "+factorial.func(5));
    }
}
