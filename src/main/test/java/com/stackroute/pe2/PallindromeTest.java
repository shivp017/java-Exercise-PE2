package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest {

    private Pallindrome pallindrome;

    //created object before running test cases
    @Before
    public  void  setUp(){

        this.pallindrome=new Pallindrome();
    }
    //Remove object before running test cases
    @After
    public  void tearDown(){

        this.pallindrome=null;

    }

//this function should return reverse of input string and check pallindrome
    @Test
    public void givenInputStringShouldSameAsReturnReverse(){

        //action
        String Input=this.pallindrome.revpalindrome("mom");
        //assert
        assertEquals("The Given String is Palindrome",Input);
    }

//this function should return reverse of input string and check if not pallindrome

    @Test
    public void givenInputStringShouldNotReturnNotReverse(){


        //action
        String Input=this.pallindrome.revpalindrome("xyz");
        //assert
        assertEquals("The Given String is Not a palindrome",Input);
    }


}