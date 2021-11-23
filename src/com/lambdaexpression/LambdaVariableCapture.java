package com.lambdaexpression;

interface MyFunc{
    int func(int n);
}

public class LambdaVariableCapture {
    public static void main(String[] args) {
        int num =10;

        MyFunc myLambda = (n) -> {
            int v= num + n;

//            num++;   // illegal because try to modify num.

            return v;
        };
//        num = 9;  // remove the effectively final status from num.
    }
}
