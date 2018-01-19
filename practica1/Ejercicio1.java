//P1 - EJ1

package practica1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número: ");
            num[i] = numero.nextInt();
        }
        System.out.println("Los números son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }
}
