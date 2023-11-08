//Alumno: Rodolfo Nicolás Velasco Fessler
//Repositorio de GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB

//TP12 - Expresiones Regulares

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Creación de conjunto y Validación de datos: \n");
        validacionDatos();
        System.out.println("\nInforme de investigación: \n");
        informe();
        System.out.println("\nEjercicios:\n");
        System.out.println("\nEjercicio 1, 2 y 3:\n");
        String cadena = "Saludos";
        System.out.println("Cadena: " + cadena);
        terminaEnDigito(cadena);
        if (terminaEnDigito(cadena)){
            System.out.println("La cadena termina en un dígito.");
        } else {
            System.out.println("La cadena no termina en un dígito.");
        }
        empiezaConDigito(cadena);
        if (empiezaConDigito(cadena)){
            System.out.println("La cadena empieza con un dígito.");
        } else {
            System.out.println("La cadena no empieza con un dígito.");
        }
        longitudValida(cadena);
        if (longitudValida(cadena)){
            System.out.println("La cadena tiene entre 5 y 10 caracteres.");
        } else {
            System.out.println("La cadena no tiene entre 5 y 10 caracteres.");
        }
        System.out.println("\nEjercicio 4:\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su DNI en formato xx-xxx-xxx : ");
        String dni = sc.nextLine();
        System.out.print("\n");
        dniValido(dni);
        if (dniValido(dni)){
            System.out.println("El DNI ingresado es válido.");
        } else {
            System.out.println("El DNI ingresado no es válido.");
        }
        System.out.println("\nEjercicio 5:\n");
        ArrayList<String> mails = new ArrayList<String>();
        ingresarEmailValido(mails);
        System.out.print("Lista de emails: ");
        for (String m : mails){
            System.out.print(m + ", ");
        }
        System.out.println("\n");
        System.out.println("\nEjercicio 6:\n");
        cadena = "boca";
        System.out.println("Cadena: " + cadena);
        contieneABC(cadena);
        if (contieneABC(cadena)){
            System.out.println("La cadena contiene las letras a, b y c.");
        } else {
            System.out.println("La cadena no contiene las letras a, b y c.");
        }
    }
    public static void validacionDatos(){
        ArrayList<String> datos = new ArrayList<>();
        datos.add("juanmorales@gmail.com");
        datos.add("2612235689");
        datos.add("37513954");
        datos.add("07/11/2023");
        datos.add("5500");
        for (String d : datos){
            if(validarEmail(d)){
                System.out.println(d + " es un email valido");
            }else if (validarTelefono(d)){
                System.out.println(d + " es un telefono valido");
            }else if (validarDNI(d)){
                System.out.println(d + " es un DNI valido");
            } else if (validarFecha(d)){
                System.out.println(d + " es una fecha válida");
            } else if (validarCP(d)){
                System.out.println(d + " es un código postal valido");
            } else {
                System.out.println(d + " no es valido");
            }
        }
    }
    public static boolean validarEmail(String email){
        String regex = "^[a-zA-Z0-9_+&*-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public static boolean validarTelefono(String telefono){
        String regex = "\\d{10}";
        return telefono.matches(regex);
    }

    public static boolean validarDNI(String DNI){
        String regex = "\\d{8}";
        return DNI.matches(regex);
    }

    public static boolean validarFecha(String fecha){
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        return fecha.matches(regex);
    }

    public static boolean validarCP(String CP){
        String regex = "\\d{4}";
        return CP.matches(regex);
    }

    public static void informe(){
        System.out.println("Las expresiones regulares son patrones de búsqueda que se utilizan para encontrar y manipular cadenas de texto. Se utiliza en la validación de datos, ya que permiten verificar si los datos cumplen con patrones específicos.");
        System.out.println("En mi programa se creó un conjunto con diferentes datos (correo electrónico, número de teléfono, DNI, fecha y código postal) y se utilizaron expresiones regulares para validar los datos. Se utilizaron distintos patrones para verificar si los Strings cumplían con el formato válido. Con los patrones podemos especificar el formato que debe seguir, las letras o caracteres que puede utilizar y la cantidad de dígitos que debe tener, entre otras cosas.");
        System.out.println("Ejemplo 1:");
        System.out.println("Para validar la cantidad de dígitos podemos utilizar la expresión regular: \"\\d{}\". \n Se utiliza \"\\\" para indicar con qué debe coincidir. Y se utiliza \"d{}\" para decir la cantidad de dígitos que debe tener la cadena para ser válido (se pone dentro de las llaves la cantidad de dígitos válidos)");
        System.out.println("En mi programa se utilizó esa expresión regular para validar el número de teléfono, el DNI y el código postal. Por ejemplo: \nString regex = \"\\d{4}\" \nSe utilizó este patrón para validar el código postal. Esta expresión regular verifica que la cadena tenga 4 dígitos.");
        System.out.println("Ejemplo 2:");
        System.out.println("Para validar una fecha podemos utilizar una expresión regular similar a la anterior: \"\\d{2}/\\d{2}/\\d{4}\". \n Se utiliza \"\\d{}\" para indicar con qué debe coincidir con cierta cantidad de dígitos para ser válido. Al lado agregamos \"/\" que se utiliza para darle el formato de fecha.");
        System.out.println("En mi programa se utilizó esa expresión regular para validar fecha. Por ejemplo: \nString regex = \"\\d{2}/\\d{2}/\\d{4}\" \n Esta expresión regular verifica que la cadena tenga 2 dígitos / 2 dígitos / 4 dígitos. Para que la fecha tenga el formato dd/mm/aaaa.");
        System.out.println("Ejemplo 3:");
        System.out.println("Además de validar la cantidad de dígitos, podemos validar el típo de caracteres que puede utilizar para ser válido.");
        System.out.println("Por ejemplo, en mi programa, para validar el correo electrónico, se utilizó la siguiente expresión regular: \nString regex = \"^[a-zA-Z0-9_+&*-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\" \n Esta expresión regular verificará el tipo de caracteres que utilizará y el formato que puede tener. \n^[a-zA-Z0-9_+&*-] : significa que puede comenzar con cualquier letra de la a hasta la z (ya sea minúscula o mayúscula), cualquier dígito del 0 al 9 y puede contener caracteres especiales (como _+&*-). \n+@[a-zA-Z0-9.-]: esto significa que debe contener el @ y a esto le puede seguir cualquier letra de la a hasta la z (mayúscula o minúscula), dígitos del 0 al 9, y los caracteres (. o -). \n+\\.[a-zA-Z]{2,}: finalmente, indicamos que debe tener un punto seguido de dos o más letras, y dichas letras puede ser cualquier letra de la a hasta la z (en minúscula o en mayúscula). ");
    }
    public static boolean terminaEnDigito(String cadena) {
        String regex = ".*[\\d]$";
        return cadena.matches(regex);
    }
    public static boolean empiezaConDigito(String cadena) {
        String regex = "^[\\d].*";
        return cadena.matches(regex);
    }
    public static boolean longitudValida(String cadena) {
        String regex = "^[A-Za-z]{5,10}$";
        return cadena.matches(regex);
    }
    public static boolean dniValido(String dni) {
        String regex = "\\d{2}-\\d{3}-\\d{3}$";
        return dni.matches(regex);
    }
    public static ArrayList<String>ingresarEmailValido(ArrayList<String> mails){
        String mail;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ahora deberá ingresar 5 emails válidos.");
        while (mails.size()<5){
            System.out.print("Ingrese un mail: ");
            mail = sc.nextLine();
            mailValido(mail);
            if (mailValido(mail)){
                mails.add(mail);
                System.out.println("Mail agregado.");
            } else {
                System.out.println("Mail no válido. Inténtelo de nuevo.");
            }
        }
        return mails;
    }
    public static boolean mailValido(String mail){
        String regex = "^[a-zA-Z0-9_+&*-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return mail.matches(regex);
    }
    public static boolean contieneABC(String cadena) {
        String regex = "^(?=.*a)(?=.*b)(?=.*c).*";
        return cadena.matches(regex);
    }
}

