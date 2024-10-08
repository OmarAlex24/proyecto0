package com.omar.programa0;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(10.0f, 10.0f);

        t.calcularArea();
    }
}
