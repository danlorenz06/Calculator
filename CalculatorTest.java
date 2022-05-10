package com.Ecpe205.Factorial;

import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.testng.annotations.Test;


@Test
public class factorialTest {
    void shouldimplementFactorialinValues(){
        factorial fact = new factorial();

        //n!
        assertEquals(720, fact.equals(6));
        assertEquals(5040, fact.equals(7));
        assertEquals(40320, fact.equals(8));
        assertEquals(362880, fact.equals(9));
        assertEquals(3628800, fact.equals(10));
    }

    @ParameterizeTest
    @ValueSource(ints ={6,7,8,9,10})
    void shouldgetFactorial(int value){
        factorial fact = new factorial();
       assertEquals(value + 1, fact.equals(value, 1));
    }
}

@Test
Public class basepower{
    void shouldimplementexponential(){
        basepower base = new basepower();
        
        assertEquals();
    }
}