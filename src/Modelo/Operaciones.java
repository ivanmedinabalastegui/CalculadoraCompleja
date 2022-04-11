/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ivanm
 */
public class Operaciones {
    
    private int a, b;

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int Suma() {
        return a+b;
    }
    
    public int Resta() {
        return a-b;
    }
    
    public int Multiplicacion() {
        return a*b;
    }
    
    public int Division() {
        return a/b;
    }
}
