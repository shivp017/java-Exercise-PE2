//package com.stackroute.pe2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class MemberChildTest {
//
//
//          private MemberChild memberChild;
//    //created object before running test cases
//        @Before
//        public  void  setUp(){
//
//            this.memberChild=new MemberChild();
//        }
//    //Remove object before running test cases
//        @After
//        public  void tearDown(){
//
//            this.memberChild=null;
//
//        }
////this function will check the i/p Name
//
//        @Test
//        public void givenInputStringShouldReturnName(){
//
//            //action
//            String Input=memberChild.memberName("name");
//            //assert
//            assertEquals("Harry Potter",Input);
//        }
//
//
//
//        //this function will check the input name should not be null
//        @Test
//        public void givenInputNameShouldNotReturnNull(){
//
//            //action
//            String Input=memberChild.memberName("name");
//            //assert
//            assertEquals(null,Input);
//        }
//
//        @Test
//        public void givenInputSalaryShouldNotReturnNull() {
//            //action
//            int Input = memberChild.memberSalary(3700);
//            //assert
//            assertEquals(null, Input);
//        }
//
//        @Test
//        public void givenInputAgeshouldAbove18(){
//            //action
//            int Input=memberChild.memAge(7);
//            //assert
//            assertEquals("Age less than 18",Input);
//
//        }
//
//    }
//
//
//
