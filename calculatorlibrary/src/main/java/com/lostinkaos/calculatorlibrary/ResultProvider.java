package com.lostinkaos.calculatorlibrary;

import android.util.Log;

/**
 * Created by fasal-kaos on 5/11/2016.
 */
public class ResultProvider {

    public Integer funAdd(Integer num1,Integer num2){
        return num1+num2;
    }
    public Integer funSub(Integer num1,Integer num2){
        return num1-num2;
    }
    public Integer funMul(Integer num1,Integer num2){
        return num1*num2;
    }
    public Integer funDiv(Integer num1,Integer num2)throws Exception{
        Integer ans=0;
        if(num1 >= num2) {
          ans = num1/num2;
        }
        else {
            try {
                throw new Exception("first number is less than second");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return ans;
    }
    public Integer funMod(Integer num1,Integer num2){

        Integer ans=0;
        if(num1 >= num2) {
            ans = num1%num2;
        }
        else {
            try {
                throw new Exception("first number is less than second");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return ans;
    }
}
