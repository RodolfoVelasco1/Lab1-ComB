//Alumno: Rodolfo Nicolás Velasco Fessler
//Repaso Parcial 1

//Ejercicio A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int number1;
        int number2;
        int remainder1;
        int remainder2;
        System.out.println("Ingrese un número: ");
        number1 = sca.nextInt();
        System.out.println("Ingrese otro número: ");
        number2 = sca.nextInt();
        remainder1 = number1 % 10;
        remainder2 = number2 % 10;
        if (remainder1 == remainder2){
            System.out.println("Ambos números terminan en " + remainder1);

        }else{
            System.out.println("Los números ingresados terminan cifras diferentes.");
        }

//Ejercicio B

        int number, firstNumber, lastNumber;
        System.out.println("Ingrese un número de 3 cifras: ");
        number = sca.nextInt();
        if (String.valueOf(number).length() != 3){
            System.out.println("Error. El numero ingresado no tiene 3 cifras.");

        }else{
            firstNumber = number / 100;
            lastNumber = number % 10;
            if (firstNumber  == lastNumber){
                System.out.println("El número ingresado es capicúa.");
            }else{
                System.out.println("El número ingresado no es capicúa.");
            }
        }
    }

}
