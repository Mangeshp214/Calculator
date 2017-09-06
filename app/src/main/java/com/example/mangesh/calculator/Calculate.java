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

    void setValue(Double val1){
        num1=val1;
    }           /*Initializes first value.*/

    void setValue2(Double val2){
        num2=val2;
    }           /*Initializes second value.*/


    /*
    * Actual calculate function.
    * returns double value
    *
    * */
    Double calc(char sign){

        if(sign == '+'){
            ans = num1 + num2;
        }else if(sign == '-'){
            ans = num1 - num2;
        }else if(sign == '*'){
            ans = num1 * num2;
        }else if(sign == '/'){
            ans = num1 / num2;
        }else{
            return null;
        }
        sign = '1';

        return ans;
    }

}
