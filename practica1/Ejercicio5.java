//P1 - EJ5

package practica1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String[] args){
        int a[], b[], c[];
        int i, j;
        a = new int[10];
        b = new int[10];
// la tabla 3 tendrá que tener el doble de tamaño que 1 (a) y 2 (b).
        c = new int[20];
// leemos la tabla 1 en a
        System.out.println("Empezamos con la tabla 1.");
        Scanner Entrada = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            a[i] = Entrada.nextInt();
        }
// leemos la tabla 2 en b

        System.out.println("Ahora vamos con la segunda tabla de números.");
        for (i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            b[i] = Entrada.nextInt();
        }
// asignaremos los elementos de la tabla 3 (c)
// para las tablas 1 (a) y 2 (b) utilizaremos como índice i
// y para la tabla 3 (c) utilizaremos como índice j.
        j = 0;
        for (i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("Así es como queda la tabla 3 combinando las otras 2: ");
        for (j = 0; j < 20; j++) // seguimos utilizando j, para la tabla 3 (c).
        {
            System.out.print(c[j] + " ");
        }
        System.out.println("");
    }
}