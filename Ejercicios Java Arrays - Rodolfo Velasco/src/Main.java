//Repositorio GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB

//Alumno: Rodolfo Nicolás Velasco Fessler

//Ejercicios de Práctica Java (Arrays)

//DECLARACIÓN E INICIALIZACIÓN

//EJERCICIO 1

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        for (int i = 0; i<10; i++){
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }
    }
}


//EJERCICIO 2

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] numeros = new double [10];
        double index;
        index = 2.0;
        int contador;
        for (int i = 0; i<10; i++){
            while (true){
                contador = 0;
                for (double j = 1.0; j <= index; j++){
                    if (index % j == 0){
                        contador = contador + 1;
                    }
                }
                if (contador == 2){
                    numeros[i] = index;
                    index = index + 1;
                    break;
                }
                index = index + 1;
            }
            System.out.print(numeros[i] + ", ");
        }
    }
}


//EJERCICIO 3

public class Main {
    public static void main(String[] args){
        int [] [] numeros = new int [10] [10];
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                numeros[i] [j] = j;
                System.out.println("Lista en posición " + i + "," + j + " = " + numeros[i][j]);
            }
        }
    }
}


//EJERCICIO 4

public class Main {
    public static void main(String[] args){
        int [] [] [] numeros = new int [10] [10] [10];
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                for (int m = 0; m<10; m++){
                    numeros[i][j][m] = m;
                    System.out.println("Lista en posición " + i + "," + j + "," + m + " = " + numeros[i][j][m]);
                }
            }
        }
    }
}


//LECTURA Y ESCRITURA

//EJERCICIO 1

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i<10; i++){
            System.out.print(numeros[i] + ", ");
        }
    }
}


//EJERCICIO 2

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] numeros = new double [10];
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número real: ");
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i<10; i++){
            System.out.print(numeros[i] + ", ");
        }
    }
}


//EJERCICIO 3

public class Main {
    public static void main(String[] args){
        char [] caracteres = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i<5; i++){
            System.out.print(caracteres[i] + ", ");
        }
    }
}


//EJERCICIO 4

public class Main {
    public static void main(String[] args){
        boolean [] caracteres = {true, false};
        for (int i = 0; i<2; i++){
            System.out.print(caracteres[i] + ", ");
        }
    }
}


//OPCIONES ARITMÉTICAS

//EJERCICIO 1

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        int suma = 0;
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
            suma = suma + numeros[i];
        }
        System.out.print("Los números que ingresó: ");
        for (int i = 0; i<10; i++){
            System.out.print(numeros[i] + ", ");
        }
        System.out.println("\nLa suma de sus números es igual a " + suma);
    }
}


//EJERCICIO 2

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] numeros = new double [10];
        double multiplicar = 1;
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextDouble();
            multiplicar = multiplicar * numeros[i];
        }
        System.out.print("Los números que ingresó: ");
        for (int i = 0; i<10; i++){
            System.out.print(numeros[i] + ", ");
        }
        System.out.println("\nLa multiplicación de sus números da como resultado: " + multiplicar);
    }
}


//EJERCICIO 3

import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        System.out.print("Los números que ingresó en orden de menor a mayor: ");
        for (int i = 0; i<10; i++){
            System.out.print(numeros[i] + ", ");
        }
    }
}


//EJERCICIO 4

import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] cadenas = new String [10];
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese una palabra: ");
            cadenas[i] = sc.nextLine();
        }
        Arrays.sort(cadenas);
        System.out.print("Los números que ingresó en orden de menor a mayor: ");
        for (int i = 0; i<10; i++){
            System.out.print(cadenas[i] + ", ");
        }
    }
}


//EJERCICIOS ADICIONALES

//EJERCICIO 1

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        int pares;
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }
        pares = contarPares(numeros);
        System.out.println("La cantidad de números pares es de " + pares);
    }
    public static int contarPares(int [] numeros){
        int pares;
        pares = 0;
        for (int i = 0; i < 10; i++){
            if (numeros[i] % 2 == 0){
                pares = pares + 1;
            }
        }
        return pares;
    }
}


//EJERCICIO 2

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] numeros = new double [10];
        int mayores;
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número real: ");
            numeros[i] = sc.nextDouble();
        }
        mayores = contarMayores(numeros);
        System.out.println("Cantidad de números mayores a 10 que ingresó: " + mayores);
    }
    public static int contarMayores(double [] numeros){
        int mayores;
        mayores = 0;
        for (int i = 0; i < 10; i++){
            if (numeros[i] > 10){
                mayores = mayores + 1;
            }
        }
        return mayores;
    }
}


//EJERCICIO 3

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        int multiplos;
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }
        multiplos = sumarMultiplos(numeros);
        System.out.println("La suma de los números ingresados que son múltiplos de 3 es igual a: " + multiplos);
    }
    public static int sumarMultiplos(int [] numeros){
        int multiplos;
        multiplos = 0;
        for (int i = 0; i < 10; i++){
            if (numeros[i] % 3 == 0){
                multiplos = multiplos + numeros[i];
            }
        }
        return multiplos;
    }
}


//EJERCICIO 4

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        int mayor;
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }
        mayor = buscarMayor(numeros);
        System.out.println("El mayor número ingresado fue: " + mayor);
    }
    public static int buscarMayor(int [] numeros){
        int mayor;
        mayor = numeros[0];
        for (int i = 0; i < 10; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}


//EJERCICIO 5

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        int menor;
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }
        menor = buscarMenor(numeros);
        System.out.println("El menor número ingresado fue: " + menor);
    }
    public static int buscarMenor(int [] numeros){
        int menor;
        menor = numeros[0];
        for (int i = 0; i < 10; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }
}


//EJERCICIO 6

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        int [] array2 = new int [10];
        for (int i = 0; i<10; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }
        array2 = copiarArray(numeros);
        System.out.print("Números copiados en la nueva lista: ");
        for (int i = 0; i < 10; i++){
            System.out.print(array2[i] + ",");
        }
    }
    public static int [] copiarArray(int [] numeros){
        int [] array2 = new int [10];
        for (int i = 0; i < 10; i++){
            array2[i] = numeros[i];
        }
        return array2;
    }
}

