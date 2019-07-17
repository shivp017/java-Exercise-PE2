package com.stackroute.pe2;

public class Palindrome {

    public String reversePalindrome(String originalString) {
        String result="";
        String reversedString = "";
        if(originalString==null){
            return "Null value not allowed";
        }

        for(int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        if (reversedString.equals(originalString)) {
            result = "The Given String is Palindrome";
       }
        else {
            result = "The Given String is Not a palindrome";
        }


        return result;
    }
}
