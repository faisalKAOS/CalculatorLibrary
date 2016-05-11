package com.lostinkaos.calculatorlibrary;

import android.util.Log;

/**
 * Created by fasal-kaos on 5/11/2016.
 */
public class ResultProvider {
    private static String result;
    static Items items = new Items();
    public static String calculate(Integer num1, Integer num2, String flag){
        switch (flag){
            case "add":
                result = String.valueOf(num1+num2);
                break;
            case "sub":
                result = String.valueOf(num1-num2);
                break;
            case "mul":
                result = String.valueOf(num1*num2);
                break;
            case "div":
                result = String.valueOf(num1/num2);
                break;

        }
        return result;
    }

    public static void calculateAll(Integer number1,Integer number2){

        String add = String.valueOf(number1+number2);
        items.setResultAdd(add);

        String sub = String.valueOf(number1-number2);
        items.setResultSub(sub);

        String mul = String.valueOf(number1*number2);
        items.setResultSub(mul);

        String div = String.valueOf(number1/number2);
        items.setResultSub(div);

    }
}
