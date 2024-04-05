/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testPrueba;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prueba.Promedio;

/**
 *
 * @author 1061804583
 */
public class PromedioTest {
    
    private Promedio promedio;
    
    @BeforeEach
    public void init(){
        promedio = new Promedio();
    }
    
    @Test
    public void promedioTest(){
        assertEquals(3, promedio.promedionotas(2, 2.5, 4.5));
    }

    @AfterEach
    public void finich(){
        promedio = null;
    }
    
}
