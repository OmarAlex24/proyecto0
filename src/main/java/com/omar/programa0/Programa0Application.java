package com.omar.programa0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Programa0Application {

    public static void main(String[] args) {
        SpringApplication.run(Programa0Application.class, args);

        Triangulo t = new Triangulo(10.0f, 10.0f);

        t.calcularArea();
    }

}
