package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorTest {
    private Calculador calculador;
    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }
    @Test
    public void testSum_NegativeNumbers_ShouldCorrectSum(){
        calculador = new Calculador();
        int numeroA= -63;
        int numeroB=50;

        int resultado= calculador.sumar(numeroA,numeroB);
        assertEquals(-13,resultado,"-63 + 50 deeberia ser -13");
    }

    // uso de prueba parametrizadas
    @ParameterizedTest
    @CsvSource({
        "100000000,9999999,109999999",
        "150000000,955566666,109999999",
        "199999999,111111111,109999999"
    })
    public void testSum_BigNumber_ShouldCorrectSum(int numeroA, int numeroB,int suma_esperada){
        calculador= new Calculador();
        int suma=calculador.sumar(numeroA,numeroB);
        assertThat(suma).isEqualTo(suma_esperada);
    }

}