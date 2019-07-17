package com.stackroute.pe2;

public class EvenNumber {

public boolean isEven(int number) {
    boolean result;
    if(number % 2 == 0) {
        result = true;
    } else {
        result = false;
    }
    return result;
}
public String isInvalidInput(int number) {
    return "Invalid number or input ";
}
}