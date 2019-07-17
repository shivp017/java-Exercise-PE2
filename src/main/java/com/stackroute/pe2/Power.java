package com.stackroute.pe2;
import java.lang.Math;

public class Power {

    String result;
    String powerOfFour(int number) {

        while(number != 1)
        {
            if (number % 4 == 0) {

                number = number / 4;
            } else {
                result = "Not a power of 4";
                break;
            }
        }
        if (number == 1) {
            result = "power of 4";
        }
        return result;
    }



}
