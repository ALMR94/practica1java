package practica1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        MenuAplicacion menu = new MenuAplicacion();
        switch (menu.menuInicial()) {
            case 1:
                System.out.println("Ejercicio 1: ");
                Ejercicio1.main(args); 
                    break; 
            case 2:
                System.out.println("Ejercicio 2: ");
                Ejercicio2.main(args); 
                    break;
            case 3: 
                System.out.println("Ejercicio 3: ");
                Ejercicio3.main(args); 
                    break; 
            case 4:
                System.out.println("Ejercicio 4: ");
                Ejercicio4.main(args); 
                    break;
            case 5: 
                System.out.println("Ejercicio 5: ");
                Ejercicio5.main(args); 
                    break; 
            case 6: 
                System.out.println("Ejercicio 6: ");
                Ejercicio6.main(args); 
                    break;
} 
        }
    }
    
    class MenuAplicacion { 
        byte menuInicial() { 
            Scanner teclado = new Scanner(System.in); 
            byte seleccion; 
            System.out.println("Elige el número de ejrcicio que quieres probar del 1 al 6: ");
            seleccion = teclado.nextByte(); 
            System.out.println(seleccion); 
            return seleccion; 
    }

    public void Ejercicio1() {
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

    public void Ejercicio2() {
        int num[] = new int[5];
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número: ");
            num[i] = numero.nextInt();
        }
        System.out.println("Los números escritos al revés son:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }

    public void Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int pos = 0, neg = 0, cero = 0; //contadores
        int i;

//Leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Escribe el número: ");
            numeros[i] = sc.nextInt();
        }
        //se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
        //mostrar resultados
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }

    public void Ejercicio4() {
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

    public void Ejercicio5() {
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

    public void Ejercicio6() {
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

