package com.lambdaexpression;

interface SampleFunc1<T>{
    MyClass1<T> func(int n);
}

class MyClass1<T>{
    private T val;

    MyClass1(T v) { val = v;}

    MyClass1() { val = null;}

    T getVal() { return val; }
}

public class GenericConstructorReference {
    public static void main(String[] args) {

        SampleFunc1<Integer> myClassCons = MyClass1<Integer>::new;

        MyClass1<Integer> mc = myClassCons.func(100);

        System.out.println("val in mc is " + mc.getVal());
    }
}
