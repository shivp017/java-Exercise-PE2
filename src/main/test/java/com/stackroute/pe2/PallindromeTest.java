package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest {
    Pallindrome pallindrome;

    @Before
    public  void  setup(){

        this.pallindrome=new Pallindrome();
    }

    @After
    public  void teardown(){

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