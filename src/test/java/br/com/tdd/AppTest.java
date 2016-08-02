package br.com.tdd;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        Dollar product= five.times(2);
        assertEquals(10, product.amount);
        product= five.times(3);
        assertEquals(15,product.amount);
    }
    
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
