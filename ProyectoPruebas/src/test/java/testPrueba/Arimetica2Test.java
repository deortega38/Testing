/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testPrueba;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import prueba.Aritmetica;

/**
 *
 * @author 1061804583
 */
public class Arimetica2Test {    
    private Aritmetica aritmetica;
    
    @BeforeEach
    public void init(){
        aritmetica = new Aritmetica();
    }
    
    @Test
    //los metodos de pruebas siempre tienen que ser publicos
    public void suma() {
        //fail("No se ha implementado");
        assertEquals(2, aritmetica.suma(1, 1));
    }
    

    @Test
    public void suma2() {
        //fail("No se ha implementado");
        assertEquals(2.4, aritmetica.suma(1.2, 1.2));
    }

    @Test
    public void resta() {
        //fail("No se ha implementado");
        assertEquals(0, aritmetica.resta(3, 3));
    }

    @Test
    public void multplicacion() {
        //fail("No se ha implementado");
        assertEquals(4, aritmetica.multiplicacion(2, 2));
    }
    

    @Test
    public void division() {
        //fail("No se ha implementado");
        assertEquals(4, aritmetica.division(8, 2));
    }
    
    @AfterEach
    public void finish(){
      aritmetica=null;
    }
}
