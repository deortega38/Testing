/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testPrueba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import prueba.Aritmetica;

/**
 *
 * @author 1061804583
 */
public class AritmeticaTest {

    @Test
    //los metodos de pruebas siempre tienen que ser publicos
    public void suma() {
        Aritmetica aritmetica = new Aritmetica();
        //fail("No se ha implementado");
        assertEquals(2, aritmetica.suma(1, 1));
    }

    @Test
    public void suma2() {
        Aritmetica aritmetica = new Aritmetica();
        //fail("No se ha implementado");
        assertEquals(2.4, aritmetica.suma(1.2, 1.2));
    }

    @Test
    public void resta() {
        Aritmetica aritmetica = new Aritmetica();
        //fail("No se ha implementado");
        assertEquals(0, aritmetica.resta(3, 3));
    }

    @Test
    public void multplicacion() {
        Aritmetica aritmetica = new Aritmetica();
        //fail("No se ha implementado");
        assertEquals(4, aritmetica.multiplicacion(2, 2));
    }

    @Test
    public void division() {
        Aritmetica aritmetica = new Aritmetica();
        //fail("No se ha implementado");
        assertEquals(4, aritmetica.division(8, 2));
    }

}
