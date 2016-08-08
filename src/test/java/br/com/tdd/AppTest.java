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
        assertEquals(new Dollar(10),five.times(2));
        assertEquals(new Dollar(15),five.times(3));
    }
    
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    public void testFrancMultiplication()
    {
        Franc five = new Franc(5);
        assertEquals(new Franc(10),five.times(2));
        assertEquals(new Franc(15),five.times(3));
    }
}
