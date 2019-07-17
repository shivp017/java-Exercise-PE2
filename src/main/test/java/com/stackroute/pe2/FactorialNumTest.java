//package com.stackroute.pe2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class FactorialNumTest {
//
//    private FactorialNum factorialNum ;
//
//    //created object before running test cases
//    @Before
//    public void setUp() {
//
//        this.factorialNum = new FactorialNum();
//    }
//
//    //remove object after running test cases
//    @After
//    public void tearDown() {
//
//        this.factorialNum = null;
//    }
//
//    @Test
//    public void givenInputValueShouldPositive(){
//        String actualvalue=factorialNum.intFactorial(7);
//        assertEquals("value should be positive",actualvalue);
//    }
//    @Test
//    public void givenInputValueShouldWithinRange(){
//        String actualvalue=factorialNum.intFactorial(11);
//        assertEquals("value should be within the range",actualvalue);
//    }
//    @Test
//    public void givenInputValueShouldOutOfRange(){
//        String actualvalue=factorialNum.longFactorial(21);
//        assertEquals("value should be out of range",actualvalue);
//    }
//    @Test
//    public void givenInputValueShouldReturnErrorMessage(){
//        String actualvalue=factorialNum.intFactorialNull(null);
//        assertEquals("value should be not null",actualvalue);
//    }
//
//
//
//
//}