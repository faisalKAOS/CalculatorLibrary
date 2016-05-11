package com.lostinkaos.calculatorlibrary;

import android.util.Log;

/**
 * Created by fasal-kaos on 5/11/2016.
 */
public class ResultProvider {
    private static String result;
    public static String addRes,subRes,mulRes,divRes;
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
                if(num1>=num2){
                    result = String.valueOf(num1/num2);
                }else {

                    try {
                        throw new Exception("first number is less than second");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;

        }
        return result;
    }

    public static void calculateAll(Integer number1,Integer number2){

        String add = String.valueOf(number1+number2);
        items.setResultAdd(add);
        addRes = items.getResultAdd();
        String sub = String.valueOf(number1-number2);
        items.setResultSub(sub);
        subRes = items.getResultSub();
        String mul = String.valueOf(number1*number2);
        items.setResultMul(mul);
        mulRes = items.getResultMul();
        if(number1>=number2) {
            String div = String.valueOf(number1 / number2);
            items.setResultDiv(div);
            divRes = items.getResultDiv();
        }else {
            try {
                throw new Exception("first number is less than second");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
