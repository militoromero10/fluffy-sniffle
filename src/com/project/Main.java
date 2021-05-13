package com.project;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        byte bt = 0;
        short sh = 12;
        int entero = 123;
        long enteroMuyGrande = 123456;

        float fl = 0.6f;
        double dou = 1.2;

        char caracter = 'o';

        boolean flag = true;
        boolean flag2 = false;

        Byte byteDato = 0;
        Short shor = 0;
        Integer enteroObj = 0;
        Long longObj = 0l;

        Float floatObj = 0.123f;
        Double doubleObj = 0.123d;

        Character caracterObj = 'K';

        Boolean flag3 = Boolean.TRUE;

        String cadena = "Camilo Andres";


        System.out.println(enteroMuyGrande + 5000000);
        System.out.println(cadena+ 123);

        Punto punto1 = new Punto(0,0, "punto 1");
        Punto punto2 = new Punto(0,1, "punto 2");
        Punto punto3 = new Punto(1,0, "punto 3");
        Punto punto4 = new Punto(1,1, "punto 4");

        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);

        Punto coordenada = new Punto(1,2, "punto 5");

        cuadrado.setPunto1(coordenada);

        Punto retornado = cuadrado.getPunto1();

        System.out.println("mi area es: " +cuadrado.calcularArea());

        // condicional
        if( flag ) {
            System.out.println("verdadero");
        } else if( flag2 ) {
            System.out.println("falso");
        } else {
            System.out.println("medio");
        }

        final String valor = "B";
        switch ( valor ) {
            case "A" :
                System.out.println("el valor es A");
                break;
            case "B" :
                System.out.println("el valor es B");
                break;
            default:
                System.out.println("no era ninguno de los anteriores");
        }

        List<Integer> enteros = new ArrayList<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);

        for(int i =0; i<3; i++){
            if( i == 2){
                break;
            }
            Integer enteroTemp = enteros.get(i);
        }

        int k = 0;
        while( k < 5 ){
            if(k<3){
                System.out.println(k);
            }else{
                break;
            }
        }

        List<Cuadrado> listaDeCuadrados = new ArrayList<>();
        Set<Cuadrado> conjuntoCuadrados = new HashSet<>();
        Queue<Cuadrado> documentos = new LinkedList<>();
        Stack<Cuadrado> stack = new Stack<>();

    }

}
