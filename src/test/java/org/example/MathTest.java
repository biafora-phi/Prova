package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static  org.junit.Assert.*;

public class MathTest {

    private static Math m;

    @Before
    public void preparazione(){
        m = new Math();
        System.out.println("Sono in preparazione");
    }

    @Test
    public void isPrimeWork(){
        assertFalse(m.isPrime(10));
        assertFalse(m.isPrime(1));
    }

    @Test
    public void numberGeneratorWork(){
        assertEquals(Arrays.asList(2, 3, 5, 7, 9, 11, 13, 17, 19), m.primeNumbersGenerator(20));
    }

}
