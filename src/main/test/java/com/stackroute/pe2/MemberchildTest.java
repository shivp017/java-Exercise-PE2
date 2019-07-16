package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberchildTest {


          private Memberchild memberchild;
    //created object before running test cases
        @Before
        public  void  setUp(){

            this.memberchild=new Memberchild();
        }
    //Remove object before running test cases
        @After
        public  void tearDown(){

            this.memberchild=null;

        }
//this function will check the i/p Name

        @Test
        public void givenInputStringShouldReturnName(){

            //action
            String Input=memberchild.memName("name");
            //assert
            assertEquals("Harry Potter",Input);
        }



        //this function will check the input name should not be null
        @Test
        public void givenInputNameShouldNotReturnNull(){

            //action
            String Input=memberchild.memName("name");
            //assert
            assertEquals(null,Input);
        }

        @Test
        public Void givenInputSalaryShouldNotReturnNull() {
            //action
            int Input = memberchild.memSalary(3700);
            //assert
            assertEquals(null, Input);
        }

        @Test
        public Void givenInputAgeshouldAbove18(){
            //action
            int Input=memberchild.memAge(7);
            //assert
            assertEquals("Age less than 18",Input);

        }

    }



