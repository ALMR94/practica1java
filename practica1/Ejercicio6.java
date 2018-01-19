package practica1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int a[], b[], c[];
        int i, j;
        a = new int[12];
        b = new int[12];
// la tabla 3(c) tendrá que tener el doble de tamaño que 1(a) y 2(b).
        c = new int[24];
// leemos la tabla 1(a)
        System.out.println("Empezamos con la tabla 1.");
        Scanner Entrada = new Scanner(System.in);
        for (i = 0; i < 12; i++) {
            System.out.print("Introduce el número: ");
            a[i] = Entrada.nextInt();
        }
// leemos la tabla 2(b)
        System.out.println("Ahora vamos con la segunda tabla de números.");
        for (i = 0; i < 12; i++) {
            System.out.print("Introduce el número: ");
            b[i] = Entrada.nextInt();
        }
// asignaremos los elementos de la tabla 3(c)
// para las tablas 1(a) y 2(a) utilizaremos como índice i
// y para la tabla 3(c) utilizaremos como índice j.
        j = 0;
        i = 0;
        while (i < 12) {
// copiamos 3(c) de la tabla 1(a)
            for (int k = 0; k < 3; k++) {
                c[j] = a[i + k];
                j++;
            }
// copiamos 3(c) de la tabla 2(b)
            for (int k = 0; k < 3; k++) {
                c[j] = b[i + k];
                j++;
            }
// como hemos copiado 3(c) de 1(a) y 2(b), incrementamos la i en 3(c).
            i += 3;
// la j se incrementa cada vez que se añade un elemento a la tabla 3(c).
        }
        System.out.println("La tabla 3 queda así: ");
        for (j = 0; j < 24; j++) // seguimos utilizando j, para la tabla 3(c).
        {
            System.out.print(c[j] + " ");
        }
        System.out.println("");
    }
}
