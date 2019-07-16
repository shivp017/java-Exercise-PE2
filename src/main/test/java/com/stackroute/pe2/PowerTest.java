package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

   private Power power;
////created object before running test cases
    @Before
    public  void  setUp(){

        this.power=new Power();
    }
    //remove object before running test cases
    @After
    public  void tearDown(){

        this.power=null;
    }

//check if i/p is power of four
    @Test
    public  void givennumberispowerof4(){
        //act
        String flag = power.poweroffour(44);
        //Assert

        assertEquals("power of 4",flag);
    }

//check if not power of four

    public  void givenNumberIsNotPowerof4() {
        //act
       String flag1 = power.poweroffour(6488);
        //Assert
        assertEquals("Not a power of 4",flag1);
    }


}

