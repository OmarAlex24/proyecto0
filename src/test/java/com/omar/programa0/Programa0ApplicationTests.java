package com.omar.programa0;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = Programa0Application.class)
@SpringBootTest
class Programa0ApplicationTests {

    @Test
    void calcularTriangulo1(){
        Triangulo triangulo = new Triangulo(5.0f, 12.0f);

        assertEquals(30, triangulo.calcularArea());
    }

    @Test
    void calcularTriangulo2(){
        Triangulo triangulo = new Triangulo(3.0f, 0.0f);

        assertEquals(0, triangulo.calcularArea());
    }
    @Test
    void calcularTriangulo3(){
        Triangulo triangulo = new Triangulo(0.0f, 3.0f);

        assertEquals(0, triangulo.calcularArea());
    }
    @Test
    void calcularTriangulo4(){
        Triangulo triangulo = new Triangulo(5.0f, 5.0f);

        assertEquals(12.5, triangulo.calcularArea());
    }

}
