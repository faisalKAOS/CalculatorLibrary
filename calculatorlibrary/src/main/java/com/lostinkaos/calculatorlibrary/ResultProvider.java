package com.lostinkaos.calculatorlibrary;

import android.util.Log;

/**
 * Created by fasal-kaos on 5/11/2016.
 */
public class ResultProvider {
    private static String result;
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
}
