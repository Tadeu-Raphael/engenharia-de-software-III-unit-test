package com.tadeu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora c = new Calculadora();

    @Test
    void VerificarSoma() {
        float soma = c.somar(8f, 10f);
        assertEquals(18f,soma);
    }

    @Test
    void VerificarSubtracao() {
        float subtracao = c.subtrair(15f, 5f);
        assertEquals(10f, subtracao);
    }

    @Test
    void VerificarMultiplicacao() {
        float multiplicacao = c.multiplicar(5f,5f);
        assertEquals(25f, multiplicacao);
    }

    @Test
    void VerificarDivisao() {
        float divisao = c.dividir(10f, 2f);
        assertEquals(5f, divisao);
    }
}