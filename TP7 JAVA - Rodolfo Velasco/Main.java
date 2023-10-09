//Repositorio GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB

//Alumno: Rodolfo Nicolás Velasco Fessler

//TP7 - JAVA

//EJERCICIO 1

import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        Arrays.sort(numeros);
        System.out.print("Los números en orden de menor a mayor: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }
}


//EJERCICIO 2

import java.util.Collections;
        import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Integer [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.print("Los números en orden de mayor a menor: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }
}


//EJERCICIO 3

import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        float [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        Arrays.sort(numeros);
        System.out.print("Los números en orden de menor a mayor: ");
        for (float n : numeros){
            System.out.print(n + ", ");
        }
    }
}


//EJERCICIO 4

import java.util.Collections;
        import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Integer [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.print("Los números en orden de mayor a menor: ");
        for (float n : numeros){
            System.out.print(n + ", ");
        }
    }
}


//EJERCICIO 5

import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        String [] animales = {"perro", "gato", "canario", "ratón", "pato", "conejo"};
        Arrays.sort(animales);
        System.out.print("Los animales en orden alfabético: ");
        for (String a : animales){
            System.out.print(a + ", ");
        }
    }
}


//EJERCICIO 6

import java.util.Collections;
        import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        String [] animales = {"perro", "gato", "canario", "ratón", "pato", "conejo"};
        Arrays.sort(animales, Collections.reverseOrder());
        System.out.print("Los animales en orden inverso: ");
        for (String a : animales){
            System.out.print(a + ", ");
        }
    }
}


//EJERCICIO 9

public class Main {
    public static void main(String[] args){
        int [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        burbuja(numeros);
        System.out.print("Los números ordenados por algoritmo de ordenamiento por burbuja: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void burbuja(int [] numeros){
        int auxiliar;
        for (int i = 0; i < numeros.length - 1; i++){
            for (int j = 0; j < numeros.length - i - 1; j++){
                if (numeros[j + 1] < numeros[j]){
                    auxiliar = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = auxiliar;

                }
            }
        }

    }
}


//EJERCICIO 10

public class Main {
    public static void main(String[] args){
        int [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        seleccion(numeros);
        System.out.print("Los números ordenados por algoritmo de ordenamiento por selección: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void seleccion(int [] numeros){
        int i, j, menor, posicion, tmp;
        for (i = 0; i < numeros.length - 1; i++){
            menor = numeros[i];
            posicion = i;
            for (j = i + 1; j < numeros.length; j++){
                if (numeros[j] < menor) {
                    menor = numeros[j];
                    posicion = j;
                }
            }
            if (posicion != i){
                tmp = numeros[i];
                numeros[i] = numeros[posicion];
                numeros[posicion] = tmp;
            }
        }
    }
}


//EJERCICIO 11

public class Main {
    public static void main(String[] args){
        int [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        insercion(numeros);
        System.out.print("Los números ordenados por algoritmo de ordenamiento por inserción: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void insercion(int [] numeros){
        int auxiliar, i, j;
        for (i = 1; i < numeros.length; i++){
            auxiliar = numeros[i];
            j = i - 1;
            while (j >= 0 && auxiliar < numeros[j]){
                numeros[j+1] = numeros[j];
                j--;
            }
            numeros[j+1] = auxiliar;
        }
    }
}



//EJERCICIO 12

public class Main {
    public static void main(String[] args){
        int [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        mergesort(numeros, 0, numeros.length - 1);
        System.out.print("Los números ordenados por algoritmo de ordenamiento por mezcla: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }
    public static void mergesort(int [] numeros, int izquierda, int derecha){
        if (izquierda < derecha){
            int m = (izquierda + derecha) / 2;
            mergesort(numeros, izquierda, m);
            mergesort(numeros, m + 1, derecha);
            merge(numeros, izquierda, m, derecha);
        }
    }

    public static void merge(int [] numeros, int izquierda, int m, int derecha){
        int i, j, k;
        int [] B = new int[numeros.length];
        for (i = izquierda; i <= derecha; i++){
            B[i] = numeros[i];
        }
        i = izquierda;
        j = m + 1;
        k = izquierda;

        while (i <= m && j <= derecha){
            if (B[i] <= B[j])
                numeros[k++] = B[i++];
            else
                numeros[k++] = B[j++];
        }
        while (i <= m){
            numeros[k++] = B[i++];
        }
    }
}


//EJERCICIO 13

public class Main {
    public static void main(String[] args){
        int [] numeros = {6, 5, 1, 2, 9, 10, 4, 3, 7, 8};
        shell(numeros);
        System.out.print("Los números ordenados por algoritmo de ordenamiento shell: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void shell(int [] numeros){
        int salto, aux, i;
        boolean cambios;
        for (salto = numeros.length / 2; salto != 0; salto /= 2){
            cambios = true;
            while (cambios){
                cambios = false;
                for (i = salto; i < numeros.length; i++){
                    if (numeros[i - salto] > numeros[i]){
                        aux = numeros[i];
                        numeros[i] = numeros[i - salto];
                        numeros[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }
}


//EJERCICIO 14

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [20];
        int orden, metodo;
        orden = 0;
        metodo = 0;
        for (int i = 0; i < 20; i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = sc.nextInt();
        }
        while(orden != 1 && orden != 2){
            System.out.println("¿Cómo desea ordenar su lista?");
            System.out.println("1. Ascendente  2. Descendente");
            System.out.println("Ingrese el número de orden deseado: ");
            orden = sc.nextInt();
        }
        while(metodo != 1 && metodo != 2 && metodo != 3){
            System.out.println("¿Qué método de ordenamiento desea utilizar?");
            System.out.println("1. Inserción  2. Burbuja  3. Selección");
            System.out.println("Ingrese el número de método deseado: ");
            metodo = sc.nextInt();
        }

        if (orden == 1){
            if (metodo == 1){
                imprimirLista(numeros);
                insercionAs(numeros);
            } else if (metodo == 2){
                imprimirLista(numeros);
                burbujaAs(numeros);
            } else {
                imprimirLista(numeros);
                seleccionAs(numeros);
            }
        } else {
            if (metodo == 1){
                imprimirLista(numeros);
                insercionDes(numeros);
            } else if (metodo == 2){
                imprimirLista(numeros);
                burbujaDes(numeros);
            } else {
                imprimirLista(numeros);
                seleccionDes(numeros);
            }
        }


    }
    public static void imprimirLista(int [] numeros){
        System.out.print("Los números de su lista son: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
        System.out.println("");
    }

    public static void insercionAs(int [] numeros){
        int auxiliar, i, j;
        for (i = 1; i < numeros.length; i++){
            auxiliar = numeros[i];
            j = i - 1;
            while (j >= 0 && auxiliar < numeros[j]){
                numeros[j+1] = numeros[j];
                j--;
            }
            numeros[j+1] = auxiliar;
        }
        System.out.print("Los números ordenados en orden ASCENDENTE por algoritmo de ordenamiento por INSERCIÓN: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void burbujaAs(int [] numeros){
        int auxiliar;
        for (int i = 0; i < numeros.length - 1; i++){
            for (int j = 0; j < numeros.length - i - 1; j++){
                if (numeros[j + 1] < numeros[j]){
                    auxiliar = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = auxiliar;

                }
            }
        }
        System.out.print("Los números ordenados en orden ASCENDENTE por algoritmo de ordenamiento por BURBUJA: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void seleccionAs(int [] numeros){
        int i, j, menor, posicion, tmp;
        for (i = 0; i < numeros.length - 1; i++){
            menor = numeros[i];
            posicion = i;
            for (j = i + 1; j < numeros.length; j++){
                if (numeros[j] < menor) {
                    menor = numeros[j];
                    posicion = j;
                }
            }
            if (posicion != i){
                tmp = numeros[i];
                numeros[i] = numeros[posicion];
                numeros[posicion] = tmp;
            }
        }
        System.out.print("Los números ordenados en orden ASCENDENTE por algoritmo de ordenamiento por SELECCIÓN: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void insercionDes(int [] numeros){
        int auxiliar, i, j;
        for (i = 1; i < numeros.length; i++){
            auxiliar = numeros[i];
            j = i - 1;
            while (j >= 0 && auxiliar > numeros[j]){
                numeros[j+1] = numeros[j];
                j--;
            }
            numeros[j+1] = auxiliar;
        }
        System.out.print("Los números ordenados en orden DESCENDENTE por algoritmo de ordenamiento por INSERCIÓN: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void burbujaDes(int [] numeros){
        int auxiliar;
        for (int i = 0; i < numeros.length - 1; i++){
            for (int j = 0; j < numeros.length - i - 1; j++){
                if (numeros[j + 1] > numeros[j]){
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;

                }
            }
        }
        System.out.print("Los números ordenados en orden DESCENDENTE por algoritmo de ordenamiento por BURBUJA: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }

    public static void seleccionDes(int [] numeros){
        int i, j, menor, posicion, tmp;
        for (i = numeros.length - 1; i >= 0; i--){
            menor = numeros[i];
            posicion = i;
            for (j = i - 1; j >= 0; j--){
                if (numeros[j] < menor) {
                    menor = numeros[j];
                    posicion = j;
                }
            }
            if (posicion != i){
                tmp = numeros[i];
                numeros[i] = numeros[posicion];
                numeros[posicion] = tmp;
            }
        }
        System.out.print("Los números ordenados en orden DESCENDENTE por algoritmo de ordenamiento por SELECCIÓN: ");
        for (int n : numeros){
            System.out.print(n + ", ");
        }
    }
}


