package com.omar.programa0;

public class Triangulo {
    private Float base;
    private Float altura;
    private Float area;

    public Triangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea(){
        if(this.base == (0) || this.altura == (0)){
            System.out.println("No se puede calcular el area si uno de los valores es 0");
            return 0.0f;
        }

        this.area =(this.base * this.altura) / 2;

        System.out.println("El resultado del area es: "+this.area);
        return this.area;
    }
}
