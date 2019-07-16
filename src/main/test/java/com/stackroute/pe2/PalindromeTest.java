package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome;

    //created object before running test cases
    @Before
    public void setUp() {

        this.palindrome = new Palindrome();
    }

    //Remove object before running test cases
    @After
    public void tearDown() {

        this.palindrome = null;

    }

    //this function should return reverse of input string and check pallindrome
    @Test
    public void givenInputStringShouldSameAsReturnReverse() {

        //action
        String Input = palindrome.reversePalindrome("mom");
        //assert
        assertEquals("The Given String is Palindrome", Input);
    }

//this function should return reverse of input string and check if not pallindrome

    @Test
    public void givenInputStringShouldNotReturnNotReverse() {


        //action
        String Input = palindrome.reversePalindrome("xyz");
        //assert
        assertEquals("The Given String is Not a palindrome", Input);
    }

    @Test
    public void giveInputNullShouldReturnErrorMessage() {

        String Input = palindrome.reversePalindrome(null);
        //assert
        assertEquals("Null value not allowed", Input);
    }


}