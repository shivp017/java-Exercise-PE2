package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextTest {

    private Text text;

    //created object before running test cases
    @Before
    public void setUp() {

        this.text = new Text();
    }

    //Remove object before running test cases
    @After
    public void tearDown() {

        this.text = null;

    }

    @Test
    public void givenFolderNameShouldStartWithValidValue() {
        String[] actualresult = text.getResult("Documents.java");
        assertEquals("file name is correct", actualresult);
    }

    @Test
    public void givenFileNameShouldNotStartWithValidValue() {
        String[] actualresult = text.getResult("@java");
        assertEquals("file name is not correct", actualresult);
    }

    @Test
    public void givenFileNameShouldHaveAProperExtenssion() {
        String[] actualresult = text.getResult(".txt");
        assertEquals("file name extension is correct", actualresult);
    }

    @Test
    public void givenFileNameShouldHaveAProperLength() {
        String[] actualresult = text.getResultlength(actualresult.length(200));
        assertEquals("file length is more than 200", actualresult);
    }
}
