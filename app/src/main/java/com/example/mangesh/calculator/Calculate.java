package com.example.mangesh.calculator;

import com.example.mangesh.calculator.MainActivity;

/**
 * Created by mangesh on 9/6/2017.
 *
 * Calculate class.
 *
 * takes two values and perform operation according to the sign.
 */

public class Calculate extends MainActivity {

    double num1,num2,ans;
    /*
    * default constructor.
    * initializes values to zero.
    *
    */
    Calculate(){
        num1=0;
        num2=0;
        ans=0;
    }

    Boolean setValue(Double val1){
        num1=val1;
        return true;
    }           /*Initializes first value.*/

    Boolean setValue2(Double val2){
        num2=val2;
        return true;
    }           /*Initializes second value.*/


    /*
    * Actual calculate function.
    * returns double value
    *
    * */
    Double calc(String sign){

        if(sign.equals("+")){
            ans = num1 + num2;
        }else if(sign.equals("-")){
            ans = num1 - num2;
        }else if(sign.equals("*")){
            ans = num1 * num2;
        }else if(sign.equals("/")){
            ans = num1 / num2;
        }else{
            return null;
        }

        return ans;
    }

}
