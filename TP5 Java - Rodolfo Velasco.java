//Alumno: Rodolfo Nicolás Velasco Fessler
//Repositorio de GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB
//TP 5 - JAVA

//EJERCICIO 1
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número entero: ");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
    }
}

//EJERCICIO 2
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        if (num % 10 == 0){
            System.out.println("El número " + num + " es múltiplo de 10.");
        } else {
            System.out.println("El número " + num + " no es múltiplo de 10");
        }
    }
}

//EJERCICIO 3

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letra;
        System.out.print("Ingrese una letra: ");
        letra = sc.next().charAt(0);
        if (letra == Character.toUpperCase(letra)){
            System.out.println("La letra \"" + letra + "\" es mayúscula.");
        } else {
            System.out.println("La letra  \"" + letra + "\" no es mayúscula.");
        }
    }
}

//EJERCICIO 4

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese un número: ");
        num1 = sc.next().charAt(0);
        System.out.print("Ingrese otro número: ");
        num2 = sc.next().charAt(0);
        if (num1 == num2){
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
        }
    }
}

//EJERCICIO 5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }
        if (num2 > num1) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}

//EJERCICIO 6

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = sc.nextInt();
        if ((num1 % 10) == (num2 % 10)){
            System.out.println(num1 + " y " + num2 + " terminan en con el mismo dígito.");
        }else{
            System.out.println(num1 + " y " + num2 + " terminan en dígitos diferentes.");
        }
    }
}

//EJERCICIO 7

 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println(num + " es múltiplo de 3 y de 5.");
        }else{
            System.out.println(num + " no es múltiplo de 3 y de 5.");
        }
    }
}

//EJERCICIO 8

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println(num + " es múltiplo de 2 y de 3.");
        } else if (num % 2 == 0 && num % 3 != 0) {
            System.out.println(num + " es múltiplo de 2.");
        } else if (num % 3 == 0 && num % 2 != 0) {
            System.out.println(num + " es múltiplo de 3.");
        } else {
            System.out.println(num + " no es múltiplo de 2 ni de 3.");
        }
    }
}

//EJERCICIO 9

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra1, letra2;
        System.out.print("Ingrese la primera letra: ");
        letra1 = sc.next().charAt(0);
        System.out.print("Ingrese la segunda letra: ");
        letra2 = sc.next().charAt(0);
        if (letra1 == letra2){
            System.out.println("Ambas letras son iguales.");
        } else {
            System.out.println("Las letras son diferentes.");
        }
    }
}

//EJERCICIO 10

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra1, letra2;
        System.out.print("Ingrese la primera letra: ");
        letra1 = sc.next().charAt(0);
        System.out.print("Ingrese la segunda letra letra: ");
        letra2 = sc.next().charAt(0);
        if (letra1 == Character.toLowerCase(letra1) && letra2 == Character.toLowerCase(letra2)){
            System.out.println("Ambas letras son minúsculas.");
        } else if (letra1 == Character.toLowerCase(letra1) && letra2 != Character.toLowerCase(letra2)){
            System.out.println("Sólo la letra \"" + letra1 + "\" es minúscula.");
        }else if (letra1 != Character.toLowerCase(letra1) && letra2 == Character.toLowerCase(letra2)){
            System.out.println("Sólo la letra \"" + letra2 + "\" es minúscula.");
        } else {
            System.out.println("Ninguna de las letras ingresadas es minúscula.");
        }
    }
}

//EJERCICIO 11

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        String [] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        System.out.print("Ingrese un caracter: ");
        letra = sc.next().charAt(0);
        for (int i = 0; i < 9; i++){
            if (letra == num[i].charAt(0)){
                letra = '1';
            }
        }
        if (letra == '1'){
            System.out.println("El caracter ingresado es un dígito numérico.");
        } else {
            System.out.println("El caracter ingresado no es un dígito numérico.");
        }
    }
}

//EJERCICIO 12

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        num2 = 0;
        while (num2 <= 0){
            System.out.print("Ingrese el dividendo: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese el divisor: ");
            num2 = sc.nextInt();
            if (num2 > 0){
                System.out.println(num1 + " / " + num2 + " = " + num1/num2);
            } else {
                System.out.println("Error. Ingresó un número menor o igual a 0.");
            }
        }

    }
}

//EJERCICIO 13

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Ingrese un año: ");
        año = sc.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
}

//EJERCICIO 14

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, digitos;
        System.out.print("Ingrese un número de 3 dígitos: ");
        num = sc.nextInt();
        digitos = String.valueOf(num).length();
        if (digitos != 3){
            System.out.println("Error: El número ingresado no tiene 3 dígitos.");
        } else if ((num/100) == (num%10)) {
            System.out.println("El número " + num + " es capicua.");
        } else {
            System.out.println("El número " + num + " no es capicua");
        }

    }
}

//EJERCICIO 15

import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int H, M, S;
        Boolean valido = false;
        System.out.print("Ingrese la hora: ");
        H = sc.nextInt();
        System.out.print("Ingrese los minutos: ");
        M = sc.nextInt();
        System.out.print("Ingrese los segundos: ");
        S = sc.nextInt();
        if(H >= 0 && H <=24 && M >= 0 && M <=59 && S >= 0 && S <= 59) {
            System.out.println("La hora ingresada es válida.");
            valido = true;
        } else {
            System.out.println("La hora ingresada no es valida.");
        }
        if (valido == true){
            if (H < 10){
                System.out.print("La hora ingresada es: 0" + H + ":");
            }else{
                System.out.print("La hora ingresada es: " + H + ":");
            }
            if (M < 10){
                System.out.print("0" + M + ":");
            }else{
                System.out.print(M + ":");
            }
            if (S < 10){
                System.out.print("0" + S);
            }else{
                System.out.print(S);
            }
        }
    }
}

//EJERCICIO 16

import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String [] meses ={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int mes;
        System.out.print("Ingrese el número del mes: ");
        mes = sc.nextInt();
        if (mes > 12 || mes < 1){
            System.out.println("El número ingresado es incorrecto.");
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            System.out.println("El mes ingresado es " + meses[mes - 1] + ". Este mes tiene 31 días.");
        } else if (mes == 2){
            System.out.println("El mes ingresado es Febrero. Este mes tiene 28 días.");
        } else {
            System.out.println("El mes ingresado es " + meses[mes - 1] + ". Este mes tiene 30 días.");
        }
    }
}

//EJERCICIO 17

import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.print("Ingrese su calificación: ");
        nota = sc.nextInt();
        if (nota >= 0 && nota < 5){
            System.out.println("Calificación: Insuficiente.");
        } else if (nota >= 5 && nota < 6){
            System.out.println("Calificación: Suficiente.");
        } else if (nota >= 6 && nota < 7){
            System.out.println("Calificación: Bien.");
        } else if (nota >= 7 && nota < 9){
            System.out.println("Calificación: Notable.");
        } else if (nota >= 9 && nota <= 10){
            System.out.println("Calificación: Sobresaliente.");
        } else {
            System.out.println("La nota ingresada no es válida.");
        }
    }
}

//EJERCICIO 18

public class Main{
    public static void main(String[] args){
        int num;
        num = 1;
        while (num <= 100){
            System.out.println(num);
            num = num + 1;
        }
    }
}

//EJERCICIO 19

public class Main{
    public static void main(String[] args){
        int num;
        num = 1;
        do{
            System.out.println(num);
            num = num + 1;
        } while (num <= 100);
    }
}

//EJERCICIO 20

public class Main{
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
}

//EJERCICIO 21

public class Main{
    public static void main(String[] args){
        int num;
        num = 100;
        while (num > 0){
            System.out.println(num);
            num = num - 1;
        }
    }
}

//EJERCICIO 22

public class Main{
    public static void main(String[] args){
        int num;
        num = 100;
        do{
            System.out.println(num);
            num = num - 1;
        } while(num > 0);
    }
}

//EJERCICIO 23

public class Main{
    public static void main(String[] args){
        for (int i = 100; i > 0; i--){
            System.out.println(i);
        }
    }
}

//EJERCICIO 24

//ESTRUCTURA FOR
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}

//ESTRUCTURA WHILE
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = 1;
        System.out.print("Ingrese un número: ");
        num2 = sc.nextInt();

        while(num1 <= num2){
            System.out.println(num1);
            num1 = num1 + 1;
        }
    }
}

//ESTRUCTURA DO-WHILE
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = 1;
        System.out.print("Ingrese un número: ");
        num2 = sc.nextInt();

        do{
            System.out.println(num1);
            num1 = num1 + 1;
        } while (num1 <= num2);
    }
}

//EJERCICIO 25

//ESTRUCTURA FOR
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        for (int i = num; i >= 1; i--){
            System.out.println(i);
        }
    }
}

//ESTRUCTURA WHILE
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        while (num >= 1){
            System.out.println(num);
            num = num - 1;
        }

    }
}

//ESTRUCTURA DO-WHILE
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        do{
            System.out.println(num);
            num = num - 1;
        } while (num >= 1);

    }
}

//EJERCICIO 26

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, mayor, menor;
        index = 0;
        while (true) {
            System.out.print("Ingrese un número: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese otro número: ");
            num2 = sc.nextInt();
            if (num1 == num2 ){
                System.out.println("Error. Los números no pueden ser iguales. Vuelva a intentarlo.");
            } else {
                mayor = Math.max(num1, num2);
                menor = Math.min(num1, num2);
                break;
            }
        }

        for (int i = menor; i <= mayor; i++){
            System.out.println(i);
        }
    }
}

//EJERCICIO 27

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B;
        while (true){
            System.out.print("Ingrese un número: ");
            A = sc.nextInt();
            System.out.print("Ingrese un número más grande que el anterior: ");
            B = sc.nextInt();
            if (B <= A){
                System.out.println("Error: El segundo número debe ser mayor que el primero. Vuelva a intentarlo.");
            } else {
                break;
            }
        }
        for (int i = A; i <= B; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

//EJERCICIO 28

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, M;
        while (true){
            System.out.print("Ingrese un número: ");
            N = sc.nextInt();
            System.out.print("Ingrese un número más grande que el anterior: ");
            M = sc.nextInt();
            if (N >= M || N <= 0 || M <= 0){
                System.out.println("El primer número debe ser menor al segundo número. Y ambos deben ser mayor a 0.");
            } else {
                break;
            }
        }
        for (int i = 0; i <= M; i++){
            if (i % N == 0){
                System.out.println(i);
            }
        }
    }
}

//EJERCICIO 29

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double Km, millas;
        System.out.print("Ingrese la cantidad de millas: ");
        millas = sc.nextDouble();
        Km = millas * 1.6093;
        System.out.println(millas + " millas equivalen a " + Km + " kms.");
    }
}

