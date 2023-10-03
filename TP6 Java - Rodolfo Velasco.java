//Repositorio GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB

//Alumno: Rodolfo Nicolás Velasco Fessler.

// TP6 - JAVA

//EJERCICIO 1

import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        int positivo, negativo, contadorN, contadorP;
        positivo = 0;
        negativo = 0;
        contadorN = 0;
        contadorP = 0;
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] >= 0){
                positivo = positivo + numeros[i];
                contadorP = contadorP + 1;
            } else {
                negativo = negativo + numeros[i];
                contadorN = contadorN + 1;
            }
        }
        System.out.println("La media de valores positivos es de: " + (positivo / contadorP));
        System.out.println("La media de valores negativos es de: " + (negativo / contadorN));
    }
}


//EJERCICIO 2

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        double pares, contador, media;
        pares = 0.0;
        contador = 0.0;
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
            if (i % 2 == 0){
                pares = pares + numeros[i];
                contador = contador + 1;
            }
        }
        media = pares / contador;
        System.out.println("La media de los valores ingresados es de: " + media);
    }
}


//EJERCICIO 3

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int alumnos, contador;
        double suma, media;
        suma = 0.0;
        System.out.print("Ingrese el número de alumnos: ");
        alumnos = sc.nextInt();
        double [] notas = new double [alumnos];
        for (int i = 0; i < alumnos; i++){
            contador = i + 1;
            System.out.print("Ingrese la nota del alumno #" + contador + ": ");
            notas[i] = sc.nextDouble();
        }
        for (int i = 0; i < alumnos; i++){
            suma = suma + notas[i];
        }
        media = suma / alumnos;
        System.out.println("La media de las notas es de: " + media);
        System.out.println("Alumnos con notas superiores a la media: ");
        for (int i = 0; i < alumnos; i++){
            contador = i + 1;
            if (notas[i] > media){
                System.out.println("El alumno #" + contador + " obtuvo: " + notas[i]);
            }
        }
    }
}


//EJERCICIO 4

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] Pares = new int [20];
        int j, num;
        j = 0;
        while (j < 20){
            System.out.print("Ingrese un número par: ");
            num = sc.nextInt();
            if (num % 2 == 0){
                Pares[j] = num;
                j = j + 1;
            }
        }
        System.out.print("Los números pares que ingresó fueron: ");
        for (int i = 0; i < 20; i++){
            System.out.print(Pares[i] + ", ");
        }
    }
}


//EJERCICIO 5

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        int positivo, negativo, cero;
        positivo = 0;
        negativo = 0;
        cero = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0){
                cero = cero + 1;
            } else if (numeros[i] > 0) {
                positivo = positivo + 1;
            } else {
                negativo = negativo + 1;
            }
        }
        System.out.println("Usted ingresó " + positivo + " números positivos.");
        System.out.println("Usted ingresó " + negativo + " números negativos.");
        System.out.println("Usted ingresó " + cero + " ceros.");
    }
}


//EJERCICIO 6

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        double positivo, negativo, contadorP, contadorN, mediaP, mediaN;
        positivo = 0.0;
        negativo = 0.0;
        contadorP = 0.0;
        contadorN = 0.0;
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > 0) {
                positivo = positivo + numeros[i];
                contadorP = contadorP + 1;
            } else if (numeros[i] < 0) {
                negativo = negativo + numeros[i];
                contadorN = contadorN + 1;
            }
        }
        mediaP = positivo / contadorP;
        mediaN = negativo / contadorN;
        System.out.println("La media de números positivos es de: " + mediaP);
        System.out.println("La media de números negativos es de: " + mediaN);
    }
}


//EJERCICIO 7

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, persona, superior, inferior;
        N = 0;
        superior = 0;
        inferior = 0;
        while (N <= 0){
            System.out.print("Ingrese la cantidad de personas: ");
            N = sc.nextInt();
        }
        double [] alturas = new double [N];
        double suma, media;
        suma = 0;
        for (int i = 0; i < N; i++){
            persona = i + 1;
            System.out.print("Ingresa la altura de la persona #" + persona + ": ");
            alturas[i] = sc.nextDouble();
            suma = suma + alturas[i];
        }
        media = suma / N;
        System.out.println("La altura media es de: " + media);
        for (int i = 0; i < N; i++){
            if (alturas[i] > media){
                superior = superior + 1;
            } else if (alturas[i] < media){
                inferior = inferior + 1;
            }
        }
        System.out.println(superior + " personas tienen una altura superior a la media.");
        System.out.println(inferior + " personas tienen una altura inferior a la media.");
    }
}


//EJERCICIO 8

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] empleados = new String [20];
        double [] sueldos = new double [20];
        String nombre;
        double mayor;
        mayor = 0;
        nombre = "";
        for (int i = 0; i < 20; i++){
            System.out.print("Ingrese el nombre del empleado: ");
            empleados[i] = sc.nextLine();
            System.out.print("Ingrese su sueldo: $ ");
            sueldos[i] = sc.nextDouble();
            sc.nextLine();
            if (sueldos[i] > mayor){
                nombre = empleados[i];
                mayor = sueldos[i];
            }
        }
        System.out.println("El empleado que más gana es " + nombre);
        System.out.println("Su sueldo es de: $" + mayor);
    }
}


//EJERCICIO 9

import java.util.Random;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int desde, hasta, tamano;
        while (true){
            System.out.print("Ingrese el tamaño de la lista: ");
            tamano = sc.nextInt();
            if (tamano <= 0){
                System.out.println("Error. Ingrese un número mayor a cero.");
            } else {
                System.out.print("¿Desde qué valor aleatorio tomará la lista?: ");
                desde = sc.nextInt();
                System.out.print("¿Hasta qué valor aleatorio tomará la lista?: ");
                hasta = sc.nextInt();
                if (desde >= hasta){
                    System.out.println("Error. El valor DESDE donde empieza a tomar números, debe ser menor al valor HASTA donde tomará números.");
                } else {
                    break;
                }
            }
        }
        int [] numeros = new int [tamano];
        numeros = aleatorio(desde, hasta, tamano);
        System.out.println("La lista contiene los siguientes números: ");
        for (int i = 0; i < tamano; i++){
            System.out.print(numeros[i] + ", ");
        }
    }

    public static int [] aleatorio(int desde, int hasta, int tamano) {
        Random random = new Random();
        int [] numeros = new int [tamano];
        for (int i = 0; i < tamano; i++){
            numeros[i] = random.nextInt(hasta - desde + 1) + desde;
        }
        return numeros;
    }
}


//EJERCICIO 10 A

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        System.out.print("Ingresa el número de filas de la lista: ");
        filas = sc.nextInt();
        System.out.print("Ingresa el número de columnas de la lista: ");
        columnas = sc.nextInt();
        System.out.println("Lista A.");
        int [] [] A = new int [filas] [columnas];
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("Ingrese el valor ubicado en " + i + "," + j + ": ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Lista B.");
        int [] [] B = new int [filas] [columnas];
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("Ingrese el valor ubicado en " + i + "," + j + ": ");
                B[i][j] = sc.nextInt();
            }
        }

        int [] [] C = new int [filas] [columnas];
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Los valores que se encuentran en la lista C.");
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println("Posición " + i + "," + j + ": " + C[i][j]);
            }
        }

    }
}


//EJERCICIO 10 B

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        leerNumero();
        System.out.print("Ingresa el número de filas de la lista: ");
        filas = sc.nextInt();
        System.out.print("Ingresa el número de columnas de la lista: ");
        columnas = sc.nextInt();

        System.out.println("Lista A.");
        int [] [] A = crearMatriz(filas, columnas);
        A = llenarMatriz(A, filas, columnas);
        System.out.println("Lista B.");
        int [] [] B = crearMatriz(filas, columnas);
        B = llenarMatriz(B, filas, columnas);
        System.out.println("Lista C.");
        int [] [] C = crearMatriz(filas, columnas);
        C = sumarMatriz(A, B, C, filas, columnas);
        imprimirMatriz(C, filas, columnas);
    }

    public static void leerNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();
        System.out.println(numero);
    }
    public static int [] [] crearMatriz(int filas, int columnas){
        int [] [] A = new int [filas] [columnas];
        return A;
    }
    public static int [] [] llenarMatriz(int [] [] matriz, int filas, int columnas){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("Ingrese el valor ubicado en " + i + "," + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }
    public static int [] [] sumarMatriz(int [] [] A, int [] [] B, int [] [] C, int filas, int columnas){
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void imprimirMatriz(int [] [] matriz, int filas, int columnas){
        System.out.println("Los valores que se encuentran en esta lista.");
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println("Posición " + i + "," + j + ": " + matriz[i][j]);
            }
        }
    }
}



