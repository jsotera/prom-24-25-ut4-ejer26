package es.masanz.ut4;

import es.masanz.ut4.util.GeneradorPalabras;

public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            String palabra = GeneradorPalabras.obtenerPalabraVariable();
            System.out.println("["+palabra+"]");
        }

    }
}