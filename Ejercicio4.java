//P1 - EJ4

package practica1;


 import java.util.Scanner;

public class Ejercicio4 {

    /*	Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
	penúltimo, el tercero, etc*/
    public static void main (String[] args){
        int temp;
        int[] valores = new int[10];
		Scanner Entrada = new Scanner(System.in);
        for (byte i = 0; i < valores.length; i++) {
            System.out.print("Ingrese un numero: ");
			valores[i] = Entrada.nextInt();
        }

        for (byte i = 0; i < valores.length / 2; i++) {

            System.out.println(valores[i]);
            System.out.println(valores[9 - i]);

        }
    }
}