package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    private EvenNumTest evenNumTest;
//created object before running test cases
    @Before
    public  void  setUp(){

        this.evenNumTest=new EvenNumTest();
    }
//remove object after running test cases
    @After
    public  void tearDown(){

        this.evenNumTest=null;
    }

//function to check the given number is even or not (true:even)
    @Test
    public  void givennumberShouldReturnEven(){
        //act
        Boolean inputNumber = evenNumTest.isEven(22);
        //Assert

        assertEquals(true,inputNumber);
    }
    //function to check the given number is odd or not (false:odd)
    @Test
    public  void givennumberShouldNotReturnEven(){
        //act
        Boolean inputNumber= evenNumTest.isEven(22);
        //Assert

        assertEquals(false,inputNumber);
    }

//function to check the given input number is valid or not like for -ve ,0 or special characters
    @Test
    public void  givenInputshouldReturnError(){

        //act
       String inputNumber =evenNumTest.isInvalidInput(0);
       //assert
        assertEquals("Invalid number or input ",inputNumber);
    }




}