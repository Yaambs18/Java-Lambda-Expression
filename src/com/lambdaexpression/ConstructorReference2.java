package com.lambdaexpression;

interface MyFuncc<R, T> {
    R func(T n);
}

class MyClasss<T> {
    private T val;

    MyClasss(T v) {val = v;}

    MyClasss() { val = null;}

    T getVal() { return val;}
}

class MyClasss2{
    String str;

    MyClasss2(String s) { str = s;}

    MyClasss2() { str = ""; }

    String getValue() { return str; }
}

public class ConstructorReference2  {
    static <R, T> R myClasssFactory(MyFuncc<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFuncc<MyClasss<Double>, Double> myClasssCons = MyClasss<Double>::new;

        MyClasss<Double> mc = myClasssFactory(myClasssCons, 100.1);

        System.out.println("val in mc is "+ mc.getVal());

        MyFuncc<MyClasss2, String> myClasssCons2 = MyClasss2::new;

        MyClasss2 mc2 = myClasssFactory(myClasssCons2, "Lambda");

        System.out.println("str in mc2 is "+ mc2.getValue());
    }
}
