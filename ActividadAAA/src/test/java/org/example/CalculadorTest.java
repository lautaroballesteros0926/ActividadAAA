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
        "150000000,955566666,1105566666",
        "199999999,99999999,299999998"
    })
    public void testSum_BigNumber_ShouldCorrectSum(int numeroA, int numeroB,int suma_esperada){
        calculador= new Calculador();
        int suma=calculador.sumar(numeroA,numeroB);
        assertThat(suma).isEqualTo(suma_esperada);
    }
    @Test
    public void testSum_NegativeandPositiveNumbers_ShouldRetunrCorrectSum(){
        int numA=44;
        int numB=-44;
        calculador= new Calculador();
        int suma=calculador.sumar(numA,numB);
        assertThat(suma).isEqualTo(0);
    }

    // Testeando la resta
    @Test
    public void testResta_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(5, resultado, "10 - 5 deberia ser 5");
    }
    @Test
    public void testResta_NegativeNumbers_ShouldCorrectSum(){
        calculador = new Calculador();
        int numeroA= -70;
        int numeroB=-60;
        int resultado= calculador.restar(numeroA,numeroB);
        assertEquals(-10,resultado,"-70 -(-60) deeberia ser -10");
    }

    // uso de prueba parametrizadas
    @ParameterizedTest
    @CsvSource({
            "-100000000,9999999,-109999999",
            "-199929999,955566666,-1155496665",
            "199999999,-8888888,208888887"
    })
    public void testResta_BigNumber_ShouldCorrectSum(int numeroA, int numeroB,int resta_esperada){
        calculador= new Calculador();
        int resta=calculador.restar(numeroA,numeroB);
        assertThat(resta).isEqualTo(resta_esperada);
    }
    @Test
    public void testResta_NegativeandPositiveNumbers_ShouldReturnCorrectResta(){
        int numA=-54;
        int numB=-54;
        calculador= new Calculador();
        int suma=calculador.restar(numA,numB);
        assertThat(suma).isEqualTo(0);
    }
}