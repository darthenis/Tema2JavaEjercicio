package org.ejercicio;

public class Main {
    public static void main(String[] args) {

        System.out.println(agregarIva(70));

    }


    public static double agregarIva(double precio){

            double iva = 21;

            return precio + ((precio/100) * iva);
    }
}
