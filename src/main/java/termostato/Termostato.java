/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package termostato;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Termostato {

    public static void main(String[] args) {
        
        //Creo el Scanner
        Scanner teclado = new Scanner(System.in);
        //Pido los datos por Scanner al usuario
        System.out.print("Que grados Centígrados quieres convertir en "
                + "Fahrenheit: ");
        double cen = teclado.nextDouble();
        //Pongo como constantes los números que no cambian en la secuencia
        final int NUM1 = 9, NUM2 = 5, NUM3 = 32;
        double resultado = (cen * NUM1 / NUM2) + NUM3;
        //Imprimo el resultado por pantalla
        System.out.println("El resultado de convertir " + cen + " centígrados "
                + "en Fahrenheit es: " + resultado);
    }
}
