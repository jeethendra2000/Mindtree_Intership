package com.example.sba3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@SpringBootTest
class Sba3ApplicationTests extend TestCase{

    @Test
    public Sba3ApplicationTests( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
