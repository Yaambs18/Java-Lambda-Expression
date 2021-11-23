package com.lambdaexpression;

import java.util.Locale;

interface StringFunc2{
    String func(String str);
}

public class LambdaExpressionAsArgument {
    static String stringOp(StringFunc2 strFunc, String str) {
        return strFunc.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java.";
        String outStr ;

        System.out.println("Here is input string: "+ inStr);

        // lambda expression
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The String in uppercase: "+ outStr);

        // lambda block
        outStr = stringOp((str) -> {
            String result ="";
            int i;

            for(i = 0; i<str.length(); i++){
                if(str.charAt(i)!= ' ')
                    result += str.charAt(i);
            }
            return result;
        }, inStr);
        System.out.println("The string without spaces: "+outStr);
    }
}
