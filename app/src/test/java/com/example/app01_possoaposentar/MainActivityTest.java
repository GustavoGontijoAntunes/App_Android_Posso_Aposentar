package com.example.app01_possoaposentar;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {
    @Test
    // Idade maior do que 65
    public void testeCaseA(){
        assertTrue(MainActivity.possoAposentar(68));
    }

    @Test
    // Idade igual a 65
    public void testeCaseB(){
        assertTrue(MainActivity.possoAposentar(65));
    }

    @Test
    // Idade menor do que 65
    public void testeCaseC() {
        assertFalse(MainActivity.possoAposentar(30));
    }

    @Test
    // Método Calcular()
    public void testeCaseD() {
        assertEquals(40.0, MainActivity.calcular(20.0), 0.00001); // Delta existe para arredondamentos aceitáveis
    }
}