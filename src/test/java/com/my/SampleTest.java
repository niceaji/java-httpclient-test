package com.my;

import junit.framework.TestCase;

/**
 * Created by aji on 14. 3. 24..
 */
public class SampleTest extends TestCase{

    public void testRevese(){

        String actual = Sample.revese("hello");
        String expected = "olleh";
        assertEquals(expected, actual);
    }


}
