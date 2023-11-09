//Alumno: Rodolfo Nicolás Velasco Fessler
//Repositorio en GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB

//Ejercicios Expresiones Regulares

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("\nEjercicio 1:\n");
        ejercicio1();
        System.out.println("\nEjercicio 2:\n");
        ejercicio2();
        System.out.println("\nEjercicio 3:\n");
        ejercicio3();
        System.out.println("\nEjercicio 4:\n");
        ejercicio4();
        System.out.println("\nEjercicio 5\n");
        ejercicio5();
        System.out.println("\nEjercicio 6\n");
        ejercicio6();
        System.out.println("\nEjercicio 7\n");
        ejercicio7();
        System.out.println("\nEjercicio 8\n");
        ejercicio8();
        System.out.println("\nEjercicio 9\n");
        ejercicio9();
        System.out.println("\nEjercicio 10\n");
        ejercicio10();
        System.out.println("\nEjercicio 11\n");
        ejercicio11();
        System.out.println("\nEjercicio 12\n");
        ejercicio12();
        System.out.println("\nEjercicio 13\n");
        ejercicio13();
        System.out.println("\nEjercicio 14\n");
        ejercicio14();
        System.out.println("\nEjercicio 15\n");
        ejercicio15();
        System.out.println("\nEjercicio 16\n");
        ejercicio16();
    }
    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su número de teléfono: ");
        String telefono = sc.nextLine();
        if (telefono.matches("\\d{7,10}")) {
            System.out.println("El número de teléfono es válido.");
        } else {
            System.out.println("El número de teléfono no es válido.");
        }
    }

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su número de CUIL (sin guiones ni puntos): ");
        String cuil = sc.nextLine();
        if (cuil.matches("\\d{11}")) {
            System.out.println("El número de CUIL es válido.");
        } else {
            System.out.println("El número de CUIL no es válido.");
        }
    }

    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su correo electrónico: ");
        String email = sc.nextLine();
        if (email.matches("^[a-zA-Z0-9_+&*-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("El correo electrónico es válido.");
        } else {
            System.out.println("El correo electrónico no es válido.");
        }
    }

    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una nomenclatura de 22 caracteres exactos: ");
        String nomenclatura = sc.nextLine();
        if (nomenclatura.matches(".{22}")) {
            System.out.println("La nomenclatura es válida.");
        } else {
            System.out.println("La nomenclatura no es válida.");
        }
    }

    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un nombre de entre 7 y 10 caracteres (solo letras): ");
        String nombre = sc.nextLine();
        if (nombre.matches("[a-zA-Z]{7,10}")) {
            System.out.println("El nombre es válida.");
        } else {
            System.out.println("El nombre no es válida.");
        }
    }

    public static void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        String [] datos = new String [3];
        System.out.print("Ingrese su número de teléfono (entre 7 y 10 dígitos): ");
        datos[0] = sc.nextLine();
        System.out.print("Ingrese su número de CUIL (sin guiones ni puntos): ");
        datos[1] = sc.nextLine();
        System.out.print("Ingrese su correo electrónico: ");
        datos[2] = sc.nextLine();
        for(String item : datos){
            if (item.matches("\\d{7,10}")) {
                System.out.println(item + ": El número de teléfono es válido.");
            } else if (item.matches("\\d{11}")) {
                System.out.println(item + ": El número de CUIL es válido.");
            } else if (item.matches("^[a-zA-Z0-9_+&*-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                System.out.println(item + ": El correo electrónico es válido.");
            } else {
                System.out.println(item + ": Dato no válido.");
            }
        }
    }

    public static void ejercicio7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese varios correos electrónicos separados por una coma (no ponga espacios): ");
        String lista_mails = sc.nextLine();
        String [] mails = lista_mails.split(",");
        for(String item : mails){
            if (item.matches("^[a-zA-Z0-9_+&*-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                System.out.println(item + ": El correo electrónico es válido.");
            } else {
                System.out.println(item + ": El correo electrónico no es válido.");
            }
        }
    }

    public static void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de teléfono internacional (prefijo-número): ");
        String telefono = sc.nextLine();

        if (telefono.matches("\\+\\d{1,3}-\\d{7,14}")) {
            System.out.println("El número de teléfono es válido.");
        } else {
            System.out.println("El número de teléfono no es válido.");
        }
    }

    public static void ejercicio9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un correo electrónico, el dominio debe ser \"miempresa.com\": ");
        String mail = sc.nextLine();
        if (mail.matches("^[A-Za-z0-9+_.-]+@miempresa\\.com$")) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }
    }

    public static void ejercicio10(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su código postal (una letra y 4 dígitos): ");
        String cp = sc.nextLine();
        if (cp.matches("^[A-Za-z]{1}\\d{4}$")) {
            System.out.println("El código postal es válido.");
        } else {
            System.out.println("El código postal no es válido.");
        }
    }

    public static void ejercicio11(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su DNI: ");
        String dni = sc.nextLine();
        if (dni.matches("\\d{8}")) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("El DNI no es válido.");
        }
    }

    public static void ejercicio12(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String dni = sc.nextLine();
        if (dni.matches("[a-zA-Z0-9_]{5,15}")) {
            System.out.println("El nombre de usuario es válido.");
        } else {
            System.out.println("El nombre de usuario no es válido.");
        }
    }

    public static void ejercicio13(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();
        if (fecha.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d$")) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
    }

    public static void ejercicio14(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del dominio web: ");
        String dominioWeb = sc.nextLine();
        if (dominioWeb.matches("^[A-Za-z0-9]+(\\.[A-Za-z]{2,})$")) {
            System.out.println("El nombre de dominio web es válido.");
        } else {
            System.out.println("El nombre de dominio web no es válido.");
        }
    }

    public static void ejercicio15(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();
        if (producto.matches("^[A-Za-z]{5,}")) {
            System.out.println("El nombre del producto es válido.");
        } else {
            System.out.println("El nombre del producto no es válido.");
        }
    }

    public static void ejercicio16(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        String contrasena = sc.nextLine();
        if (contrasena.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida. Debe tener letras y números y un mínimo de 8 caracteres.");
        }
    }
}
