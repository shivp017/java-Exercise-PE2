package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest evenNumTest;

    @Before
    public  void  setup(){

        this.evenNumTest=new EvenNumTest();
    }

    @After
    public  void teardown(){

        this.evenNumTest=null;
    }


    @Test
    public  void givennumberShouldReturnEven(){
        //act
        Boolean b = evenNumTest.isEven(22);
        //Assert

        assertEquals(true,b);
    }

    @Test
    public  void givennumberShouldNotReturnEven(){
        //act
        Boolean b = evenNumTest.isEven(22);
        //Assert

        assertEquals(false,b);
    }


    @Test
    public void  givenInputshouldReturnErron(){

        //act
        Boolean b =evenNumTest.isEven(0);
        assertEquals(false,b);
    }


}