package com.project;

public class Punto {

    private int x ;
    private int y;
    private String descripcion;

    public Punto(int x, int y, String descripcion) {
        this.x = x;
        this.y = y;
        this.descripcion = descripcion;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
