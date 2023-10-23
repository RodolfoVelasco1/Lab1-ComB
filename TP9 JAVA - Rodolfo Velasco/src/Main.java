//Repositorio GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB

//Alumno: Rodolfo Nicolás Velasco Fessler

//TP9 - JAVA

//EJERCICIO 1

public class Main {
    public static void main(String[] args){
        int [] [] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int [] [] matriz2 = {{7, 8, 9}, {10, 11, 12}};
        int [] [] matriz3 = new int [2] [3];
        matriz3 = sumarMatriz(matriz1, matriz2);
        System.out.println("Matriz #1: ");
        imprimir(matriz1);
        System.out.println("Matriz #2: ");
        imprimir(matriz2);
        System.out.println("Matriz #3: ");
        imprimir(matriz3);
    }
    public static int [][] sumarMatriz(int [][] matriz1, int [][] matriz2){
        int [] [] matriz3 = new int [2] [3];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;
    }
    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }

    }
}


//EJERCICIO 2

public class Main {
    public static void main(String[] args){
        int [] [] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int [] [] matriz2 = {{7, 8, 9}, {10, 11, 12}};
        int [] [] matriz3 = new int [2] [3];
        matriz3 = multiplicarMatriz(matriz1, matriz2);
        System.out.println("Matriz #1: ");
        imprimir(matriz1);
        System.out.println("Matriz #2: ");
        imprimir(matriz2);
        System.out.println("Matriz #3: ");
        imprimir(matriz3);
    }
    public static int [][] multiplicarMatriz(int [][] matriz1, int [][] matriz2){
        int [] [] matriz3 = new int [2] [3];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return matriz3;
    }
    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }

    }
}


//EJERCICIO 3

public class Main {
    public static void main(String[] args){
        int [] [] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [] [] matriz2 = new int [3] [3];
        matriz2 = matrizTranspuesta(matriz1);
        System.out.println("Matriz #1: ");
        imprimir(matriz1);
        System.out.println("Matriz #2: ");
        imprimir(matriz2);
    }
    public static int [][] matrizTranspuesta(int [][] matriz1){
        int [] [] matriz2 = new int [3] [3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz2[i][j] = matriz1[j][i];
            }
        }
        return matriz2;
    }
    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }

    }
}


//EJERCICIO 4

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] [] matriz1 = new int [3] [3];
        int [] [] matriz2 = new int [3] [3];
        matriz1 = llenarMatriz();
        matriz2 = matrizTranspuesta(matriz1);
        System.out.println("Matriz #1: ");
        imprimir(matriz1);
        System.out.println("Matriz #2: ");
        imprimir(matriz2);
        simetria(matriz1, matriz2);
    }

    public static int [][] llenarMatriz(){
        Scanner sc = new Scanner(System.in);
        int [] [] matriz1 = new int [3] [3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Ingrese un número para la posición " + i + "," + j + ": ");
                matriz1[i][j] = sc.nextInt();
            }
        }
        return matriz1;
    }

    public static int [][] matrizTranspuesta(int [][] matriz1){
        int [] [] matriz2 = new int [3] [3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz2[i][j] = matriz1[j][i];
            }
        }
        return matriz2;
    }

    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }
    }

    public static void simetria(int [][] matriz1, int [][] matriz2){
        boolean simetrico = false;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (matriz1[i][j] == matriz2[i][j]){
                    simetrico = true;
                } else {
                    simetrico = false;
                    break;
                }
            }
        }
        if (simetrico == true){
            System.out.println("Ambas matrices son simétricas.");
        } else {
            System.out.println("Ambas matrices NO son simétricas.");
        }
    }
}


//EJERCICIO 5

public class Main {
    public static void main(String[] args){
        int [] [] vector = {{1, 2, 3, 4, 5}};
        int numero, resultado;
        numero = 2;
        resultado = productoEscalar(vector, numero);
        System.out.print("Vector: ");
        imprimir(vector);
        System.out.println("\n Número: " + numero);
        System.out.println("El producto escalar del vector por el número es igual a " + resultado);
    }

    public static int productoEscalar(int [] [] vector, int numero){
        int resultado = 0;
        for (int i = 0; i < vector[0].length; i++){
            resultado = (vector[0][i] * numero) + resultado;
        }
        return resultado;
    }

    public static void imprimir(int [] [] vector){
        for (int i = 0; i < vector[0].length; i++){
            System.out.print(vector[0][i] + ", ");
        }
    }

}


//EJERCICIO 6

public class Main {
    public static void main(String[] args){
        int [] [] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int resultado;
        resultado = suma(matriz);
        System.out.print("Los números de la matriz: ");
        imprimir(matriz);
        System.out.println("La suma de todos los números de la matriz es igual a " + resultado);
    }

    public static int suma(int [] [] matriz){
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                resultado = resultado + matriz[i][j];
            }
        }
        return resultado;
    }

    public static void imprimir(int [] [] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + ", ");
            }
        }
    }

}


//EJERCICIO 7

public class Main {
    public static void main(String[] args){
        int [] [] matriz = {{25, 2, 36}, {8, 15, 71}, {78, 55, 33}};
        int [] resultado = new int [3];
        int mayor, fila, columna;
        mayor = matriz[0][0];
        fila = 0;
        columna = 0;
        resultado = mayorPosicion(matriz, mayor, resultado);
        mayor = resultado[0];
        fila = resultado[1];
        columna = resultado[2];
        System.out.println("Los números de la matriz: ");
        imprimir(matriz);
        System.out.println("El mayor número de la matriz es " + mayor + " y se encuentra en la posición " + fila + "," + columna);
    }

    public static int [] mayorPosicion(int [] [] matriz, int mayor, int [] resultado){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                    resultado[0] = matriz[i][j];
                    resultado[1] = i;
                    resultado[2] = j;
                }
            }
        }
        return resultado;
    }

    public static void imprimir(int [] [] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("En posición " + i + "," + j + ": " + matriz[i][j]);
            }
        }
    }

}


//EJERCICIO 8

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] [] matriz = {{5, 2, 6}, {8, 1, 7}, {8, 5, 3}};
        System.out.println("Los números de la matriz: ");
        imprimir(matriz);
        int resultado, fila;
        resultado = 0;
        fila = elegirFila();
        resultado = sumarFilas(matriz, fila, resultado);
        System.out.println("La suma de los números de la fila #" + fila + " es igual a " + resultado);
    }

    public static int elegirFila(){
        int fila;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("La matriz tiene 3 filas");
            System.out.print("¿Qué fila desea sumar?: ");
            fila = sc.nextInt();
            if (fila == 1 || fila == 2 || fila == 3){
                break;
            } else {
                System.out.println("Lo sentimos, ingresó un número inválido. Inténtelo de nuevo.");
            }
        }
        return fila;
    }

    public static int sumarFilas(int [] [] matriz, int fila, int resultado){
        fila = fila - 1;
        for (int i = 0; i < matriz[fila].length; i++){
            resultado = resultado + matriz[fila][i];

        }
        return resultado;
    }

    public static void imprimir(int [] [] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Fila " + (i+1) + ", Columna " + (j+1) + ": " + matriz[i][j]);
            }
        }
    }

}


//EJERCICIO 9

public class Main {
    public static void main(String[] args){
        int [] [] matriz1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int [] [] matriz2 = {{0, 2, 0}, {0, 2, 0}, {0, 2, 0}};
        System.out.println("Matriz 1: ");
        imprimir(matriz1);
        diagonal(matriz1);
        System.out.println("Matriz 2: ");
        imprimir(matriz2);
        diagonal(matriz2);
    }

    public static void diagonal(int [][] matriz){
        boolean esDiagonal = false;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    if (matriz[i][j] == 0){
                        esDiagonal = false;
                        break;
                    } else {
                        esDiagonal = true;
                    }
                } else {
                    if (matriz[i][j] == 0){
                        esDiagonal = true;
                    } else {
                        esDiagonal = false;
                        break;
                    }
                }
            }
        }
        if (esDiagonal == true){
            System.out.println("La matriz es diagonal");
        } else {
            System.out.println("La matriz no es diagonal");
        }
    }

    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < matrices.length; i++){
            for (int j = 0; j < matrices[i].length; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }

    }

}


//EJERCICIO 10

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = sc.nextInt();
        int [][] matriz = new int [n][n];
        matriz = matrizIdentidad(matriz, n);
        imprimir(matriz);
    }

    public static int [][] matrizIdentidad(int [][] matriz, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < matrices.length; i++){
            for (int j = 0; j < matrices[i].length; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }

    }

}


//EJERCICIO 11

public class Main {
    public static void main(String[] args){
        int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matriz:");
        imprimir(matriz);
        paresImpares(matriz);
    }

    public static void paresImpares(int [][] matriz){
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] % 2 == 0){
                    pares = pares + 1;
                } else {
                    impares = impares + 1;
                }
            }
        }
        System.out.println("En la matriz hay " + pares + " números pares.");
        System.out.println("En la matriz hay " + impares + " números impares.");
    }

    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < matrices.length; i++){
            for (int j = 0; j < matrices[i].length; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }

    }

}


//EJERCICIO 12

public class Main {
    public static void main(String[] args){
        int [][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int a = matriz1.length;
        int b = matriz1[0].length;
        int [][] matriz2 = new int [a][b];
        System.out.println("Matriz Original:");
        imprimir(matriz1);
        matriz2 = girar90(matriz1, matriz2, a);
        System.out.println("Matriz Girada 90°:");
        imprimir(matriz2);
    }

    public static int [][] girar90(int [][] matriz1, int [][] matriz2, int a){
        int columnas = 0;
        for (int i = 0; i < a; i++){
            int filas = a - 1;
            for (int j = 0; j < matriz1[i].length; j++){
                matriz2[i][j] = matriz1[filas][columnas];
                filas = filas - 1;
            }
            columnas = columnas + 1;
        }
        return matriz2;
    }

    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < matrices.length; i++){
            for (int j = 0; j < matrices[i].length; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }

    }

}


//EJERCICIO 13

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] matriz = {{2, 11, 3}, {2, 5, 6}, {7, 11, 2}};
        int numero;
        System.out.println("Matriz Original:");
        imprimir(matriz);
        System.out.print("¿Qué número desea contar en la matriz?: ");
        numero = sc.nextInt();
        contarNumero(matriz, numero);
    }


    public static void contarNumero(int [][] matriz, int numero){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (matriz[i][j] == numero){
                    contador = contador + 1;
                }
            }
        }
        System.out.append("Cantidad de veces que aparece " + numero + " en la matriz: " + contador);
    }

    public static void imprimir(int [] [] matrices){
        for (int i = 0; i < matrices.length; i++){
            for (int j = 0; j < matrices[i].length; j++){
                System.out.print("Posición " + i + "," + j + ": ");
                System.out.println(matrices[i][j]);
            }
        }

    }

}


//EJERCICIO 14

public class Main {
    public static void main(String[] args){
        int [][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] matriz2 = new int [3][3];
        System.out.println("Matriz Original:");
        imprimir(matriz1);
        matriz2 = invertirMatriz(matriz1, matriz2);
        System.out.println("\n\nMatriz Invertida:");
        imprimir(matriz2);
    }


    public static int [][] invertirMatriz(int [][] matriz1, int [][] matriz2){
        for (int i = 0; i < matriz1.length; i++){
            int columnas = matriz1[0].length - 1;
            for (int j = 0; j < matriz1[0].length; j++){
                matriz2[i][j] = matriz1[i][columnas];
                columnas = columnas - 1;
            }
        }
        return matriz2;
    }

    public static void imprimir(int [] [] matriz){
        for (int i = 0; i < matriz.length; i++){
            System.out.print("\nNúmeros en la fila " + (i+1) + ": ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + ", ");
            }
        }
    }
}


//EJERCICIO 15

public class Main {
    public static void main(String[] args){
        int [][] matriz1 = {{1, 0, 0}, {0, 5, 0}, {0, 0, 9}};
        System.out.println("Matriz Original:");
        imprimir(matriz1);
        sumarDiagonal(matriz1);
    }


    public static void sumarDiagonal(int [][] matriz1){
        int suma = 0;
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[0].length; j++){
                if (i == j){
                    suma = suma + matriz1[i][j];
                }
            }
        }
        System.out.println("\nLa suma de las diagonales de la matriz es igual a " + suma);
    }

    public static void imprimir(int [] [] matriz){
        for (int i = 0; i < matriz.length; i++){
            System.out.print("\nNúmeros en la fila " + (i+1) + ": ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + ", ");
            }
        }
    }
}


//EJERCICIO 16

public class Main {
    public static void main(String[] args){
        int [][] matriz1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int [][] transpuesta = new int [3][3];
        int [][] inversa = new int [3][3];
        boolean ortogonal;
        ortogonal = false;
        System.out.println("Matriz Original:");
        imprimir(matriz1);
        transpuesta = matrizTranspuesta(matriz1, transpuesta);
        System.out.println("Matriz Transpuesta:");
        imprimir(transpuesta);
        inversa = matrizInversa(matriz1, inversa);
        System.out.println("Matriz Inversa:");
        imprimir(inversa);
        ortogonal = comprobarOrtogonal(transpuesta, inversa, ortogonal);
        if (ortogonal == true){
            System.out.println("La matriz es ortogonal.");
        } else {
            System.out.println("La matriz NO es ortogonal.");
        }
    }

    public static int [][] matrizTranspuesta(int [][] matriz1, int [][] transpuesta){
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[0].length; j++){
                transpuesta[i][j] = matriz1[j][i];
            }
        }
        return transpuesta;
    }

    public static int [][] matrizInversa(int [][] matriz1, int [][] inversa){
        int filas = (matriz1.length) -1;
        for (int i = 0; i < matriz1.length; i++){
            int columnas = (matriz1[0].length) - 1;
            for (int j = 0; j < matriz1[0].length; j++){
                inversa[i][j] = matriz1[filas][columnas];
                columnas = columnas - 1;
            }
            filas = filas - 1;
        }
        return inversa;
    }

    public static boolean comprobarOrtogonal(int [][] transpuesta, int [][] inversa, boolean ortogonal){
        for (int i = 0; i < transpuesta.length; i++){
            for (int j = 0; j < transpuesta[0].length; j++){
                if (transpuesta[i][j] == inversa[i][j]){
                    ortogonal = true;
                } else {
                    return false;
                }
            }
        }
        return ortogonal;
    }

    public static void imprimir(int [] [] matriz){
        for (int i = 0; i < matriz.length; i++){
            System.out.print("\nNúmeros en la fila " + (i+1) + ": ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + ", ");
            }
        }
        System.out.println("");
    }
}


//EJERCICIO 17

public class Main {
    public static void main(String[] args){
        int [] [] matriz = {{25, 2, 36}, {8, 15, 71}, {78, 55, 33}};
        int [] menor = new int [3];
        menor = menorFila(matriz, menor);

        System.out.println("Los números de la matriz: ");
        imprimir(matriz);
        System.out.println("El menor número de cada fila: ");
        imprimirFila(menor);
    }

    public static int [] menorFila(int [] [] matriz, int [] menor){
        for (int i = 0; i < matriz.length; i++){
            menor[i] = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < menor[i]){
                    menor[i] = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static void imprimir(int [] [] matriz){
        for (int i = 0; i < matriz.length; i++){
            System.out.print("Números en la fila " + (i+1) + ": ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void imprimirFila (int [] menor){
        for (int i = 0; i < menor.length; i++){
            System.out.print("Fila #" + (i+1) + ": ");
            System.out.println(menor[i]);
        }
    }
}


//EJERCICIO 18

public class Main {
    public static void main(String[] args){
        int [] [] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] matriz2 = {{7, 8}, {9, 10}, {11, 12}};
        int fila1, columna1, fila2, columna2;
        fila1 = matriz1.length;
        fila2 = matriz2.length;
        columna1 = matriz1[0].length;
        columna2 = matriz2[0].length;
        int [][] matriz3 = new int [fila1][columna2];
        System.out.println("Matriz 1: ");
        imprimir(matriz1);
        System.out.println("Matriz 2: ");
        imprimir(matriz2);
        matriz3 = productoMatriz(matriz1, matriz2, matriz3, fila1, fila2, columna1, columna2);
        System.out.println("Matriz 3 - Producto de matrices: ");
        if (matriz3 == null){
            System.out.println("Matriz nula.");
        } else {
            imprimir(matriz3);
        }
    }

    public static int [][] productoMatriz(int [][] matriz1, int [][] matriz2, int [][] matriz3, int fila1, int fila2, int columna1, int columna2){
        if (columna1 != fila2){
            return null;
        } else {
            for (int i = 0; i < fila1; i++){
                for (int j = 0; j < columna2; j++){
                    int suma = 0;
                    for (int k = 0; k < columna1; k++){
                        suma = suma + (matriz1[i][k] * matriz2[k][j]);
                    }
                    matriz3[i][j] = suma;
                }
            }
            return matriz3;
        }
    }

    public static void imprimir(int [] [] matriz){
        for (int i = 0; i < matriz.length; i++){
            System.out.print("Números en la fila " + (i+1) + ": ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}



