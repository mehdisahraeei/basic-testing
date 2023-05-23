package com.my.testing;

import com.my.testing.OtherSample.SubSample;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SubSampleTest {

    private SubSample sample;

    public SubSampleTest() {
        sample = new SubSample();
    }

    @Test
    public void TestBoolean() {
        boolean bool = sample.getBoolean(true);
        assertTrue(bool);
        //assertFalse for values of false
    }

    @Test
    public void TestObject() {
        Object object = sample.getObject();
        assertNull(null);
    }

    @Test
    public void TestChar() {
        char ch = sample.getChar('A');
        assertEquals(ch, 'A');
        // 'a' is Wrong
    }

    @Test
    public void TestFloat() {
        float z = sample.getFloat(14.53f);
        assertEquals(z, 14.53f, 0);
    }

    @Test
    public void TestArray()
    {
        int[] arrOld=sample.getArr();
        int[] arrMe=new int[]{10,20,30};

        assertArrayEquals(arrOld,arrMe); //compare for Arrays
    }

}