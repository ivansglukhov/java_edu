package ru.ivan.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.util.PrimitiveIterator;

public class primeTests {

    @Test

    public void testPrime(){
        Assert.assertTrue(primes.isPrimeFast(Integer.MAX_VALUE));
    }

    @Test

    public void testnonPrimes(){
        Assert.assertFalse(primes.isPrime(Integer.MAX_VALUE-2));
    }

    @Test(enabled = false)

    public void testPrimeLong(){
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(primes.isPrime(n));
    }
}
