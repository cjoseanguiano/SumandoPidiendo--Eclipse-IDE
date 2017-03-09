/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumandopidiendo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class SumandoPidiendo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int numero;
        int valor;
        int suma = 0;

        Scanner entrada = new Scanner(System.in);
        Scanner valores = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        numero = entrada.nextInt();

        Random random = new Random();
        //			for(int i = 1; i<=4; i++)

        if (numero > 0) {
            do {
                System.out.println("----");
                valor = valores.nextInt();
                suma = suma + valor;
                System.out.println("Concepto --------------" + suma);
            } while (suma != numero);
            System.out.println("Este es  valor " + valor);
            System.out.println("Este es  numero " + numero);

        } else {
            System.out.println("Ingresa un valor mas grande");
        }

    }

}
