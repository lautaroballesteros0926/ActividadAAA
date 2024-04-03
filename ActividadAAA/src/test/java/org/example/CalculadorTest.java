package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorTest {
    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }
    @Test
    public void testSum_NegativeNumbers_ShouldCorrectSum(){
        Calculador calculador = new Calculador();
        int numeroA= -63;
        int numeroB=50;

        int resultado= calculador.sumar(numeroA,numeroB);
        assertEquals(-13,resultado,"-63 + 50 deeberia ser -13");
    }
    public void testSum_BigNumber_ShoulCorrectSum(){
        
    }

}