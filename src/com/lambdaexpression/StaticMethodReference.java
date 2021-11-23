package com.lambdaexpression;

interface StringFunc3{
    String func(String str);
}

class MyStringOps{
    static String strReverse(String str){
        String result = "";
        int i;

        for(i=str.length()-1; i>=0; i--)
            result+=str.charAt(i);

        return result;
    }
}
public class StaticMethodReference {
    static String stringOp(StringFunc3 sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java.";
        String outStr ;

        System.out.println("Here is input string: "+ inStr);

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Reversed String: "+ outStr);
    }
}
