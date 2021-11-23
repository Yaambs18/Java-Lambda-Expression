package com.lambdaexpression;

interface SampleFunc{
    MyClass2 func(int n);
}

class MyClass2{
    private int val;

    MyClass2(int v) { val = v;}

    MyClass2() { val = 0;}

    int getVal() { return val; }
}

public class ConstructorReference {
    public static void main(String[] args) {
        SampleFunc myClassCons = MyClass2::new;

        MyClass2 mc = myClassCons.func(100);

        System.out.println("val in mc is " + mc.getVal());
    }
}
