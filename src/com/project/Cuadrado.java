package com.project;

public class Cuadrado {

    // atributos
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;

    // creacion
    public Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4) {
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
        this.punto4 = p4;
    }

    // funcionalidades, comportamientos

    /**
     *  Esto retorna el valor del punto 1
     * @return Punto
     */
    public Punto getPunto1(){
        return this.punto1;
    }

    public Punto getPunto2(){
        return this.punto2;
    }

    public Punto getPunto3(){
        return this.punto3;
    }

    public Punto getPunto4(){
        return this.punto4;
    }

    public void setPunto1(Punto p){
        this.punto1 = p;
    }

    public void setPunto2(Punto p){
        this.punto2 = p;
    }

    public void setPunto3(Punto p){
        this.punto3 = p;
    }

    public void setPunto4(Punto p){
        this.punto4 = p;
    }

    public Double calcularArea(){

        /**
         *  calculo
         */

        return 0d;
    }
}
