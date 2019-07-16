package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumber {

    private EvenNumber evenNumber;

    //created object before running test cases
    @Before
    public void setUp() {

        this.evenNumber= new EvenNumber();
    }

    //remove object after running test cases
    @After
    public void tearDown() {

        this.evenNumTest = null;
    }

    //function to check the given number is even or not (true:even)
    @Test
    public void givenNumberShouldReturnEven() {
        //act
        Boolean inputNumber = evenNumber.isEven(22);
        //Assert

        assertEquals(true, inputNumber);
    }

    //function to check the given number is odd or not (false:odd)
    @Test
    public void givenNumberShouldNotReturnEven() {
        //act
        Boolean inputNumber = evenNumber.isEven(22);
        //Assert

        assertEquals(false, inputNumber);
    }

    //function to check the given input number is valid or not like for -ve ,0 or special characters
    @Test
    public void givenInputZeroShouldReturnErrorMessage() {

        //act
        String inputNumber = evenNumber.isInvalidInput(0);
        //assert
        assertEquals("Invalid number or input ", inputNumber);
    }


}