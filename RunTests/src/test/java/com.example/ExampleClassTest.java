package com.example;

import com.example.example.ExampleClass;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class ExampleClassTest {

    @org.junit.Test
    public void testName() throws Exception {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.doSomething();
        System.out.println("I'm running a test here");
        assertTrue(true);
    }
}
