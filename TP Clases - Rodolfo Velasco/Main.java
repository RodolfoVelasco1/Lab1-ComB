//Alumno: Rodolfo Nicolás Velasco Fessler
//Repositorio de GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB
//Carpeta del TP en GitHub: https://github.com/RodolfoVelasco1/Lab1-ComB/tree/main/TP%20Clases%20-%20Rodolfo%20Velasco

//TP Clases Java

import java.util.Random;
public class Main {
    public static void main(String[] args){

        //EJERCICIOS 1, 2 Y 3

        Perro perro1 = new Perro("Bobby", "Labrador", 5);
        System.out.println("\nMI PERRO\n");
        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Raza: " + perro1.getRaza());
        System.out.println("Edad: " + perro1.getEdad());
        perro1.ladrar();

        //EJERCICIOS 4 Y 5

        double area, circunferencia;
        Circulo circulo1 = new Circulo(3.5);
        area = circulo1.calcular_area();
        circunferencia = circulo1.calcular_circunferencia();
        System.out.println("\nCIRCUNFERENCIA\n");
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Area: " + area);
        System.out.println("Circunferencia: " + circunferencia);

        //EJERCICIOS 6 Y 7

        Estudiante estudiante1 = new Estudiante("Juan", 15, 45987654);
        System.out.println("\nESTUDIANTE\n");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Número de Identificación: " + estudiante1.getNroID());

        //EJERCICIOS 8 Y 9

        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        System.out.println("\nLIBRO\n");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año: " + libro1.getAnio());

        //EJERCICIOS 10 Y 11

        int sald = 0;
        System.out.println("\nCUENTA BANCARIA\n");
        int deposito = depositar(sald);
        int retiro = retirar(sald);

        sald = deposito + retiro;
        cuenta_Bancaria cuenta = new cuenta_Bancaria(12345,sald);
        cuenta.mostrar_Info_Clientes();

        //EJERCICIO 12

        System.out.println("\nRECTÁNGULO\n");
        rectangulo rec1 = new rectangulo(10,35);

        System.out.println("Ancho = 10.");
        System.out.println("Alto = 35.");
        rec1.mostrar_Area_Per();

        //EJERCICIOS 13 Y 14

        coche coche1 = new coche("Chevrolet", "Corsa", 2005);
        System.out.println("\nCHOCHE\n");
        coche1.mostrar_Info_Coches();
        coche1.acelerar();
        coche1.frenar();

        //EJERCICIO 15

        pelicula pelicula1 = new pelicula("El secreto de sus ojos", "Juan José Campanella", 127);

        System.out.println("\nPELÍCULA\n");
        pelicula1.mostrar_Info_Pel();

    }

    //METODOS - EJERCICIOS 10 Y 11

    public static int depositar(int sald){
        System.out.println("Se registró un depósito de $5000");

        return (sald + 5000);
    }

    //METODOS - EJERCICIOS 10 Y 11

    public static int retirar(int sald){
        System.out.println("Se registró un retiro de $1500");

        return (sald - 1500);
    }
}

//CLASES

//EJERCICIOS 1, 2 Y 3

class Perro {
    private String nombre;
    private String raza;
    private int edad;

    public Perro (String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public void ladrar(){
        System.out.println("Guau Guau");
    }
}

//EJERCICIOS 4 Y 5

class Circulo {
    private double radio;

    public Circulo (double radio){
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    public double calcular_area(){
        return Math.PI * radio * radio;
    }

    public double calcular_circunferencia(){
        return 2 * Math.PI * radio;
    }

}

//EJERCICIOS 6 Y 7

class Estudiante {
    private String nombre;
    private int edad;
    private int nroID;

    public Estudiante(String nombre, int edad, int nroID) {
        this.nombre = nombre;
        this.edad = edad;
        this.nroID = nroID;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public int getNroID() { return nroID; }
    public void setNroID(int nroID) { this.nroID = nroID; }

}

//EJERCICIOS 8 Y 9

class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor;}
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio;}

}

//EJERCICIOS 10 Y 11

class cuenta_Bancaria{
    private int nro_Cuenta;
    private int saldo;

    public cuenta_Bancaria(int nro_Cuenta, int saldo){
        this.nro_Cuenta = nro_Cuenta;
        this.saldo = saldo;
    }

    public void mostrar_Info_Clientes(){
        System.out.println("Número de cuenta: " + nro_Cuenta);
        System.out.println("Saldo en cuenta: " + saldo);
    }
}

//EJERCICIO 12

class rectangulo{
    private int ancho;
    private int alto;

    public rectangulo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public void mostrar_Area_Per(){
        int area_rec = ancho * alto;
        int per_rec = (ancho * 2) + (alto * 2);
        System.out.println("Área: " + area_rec);
        System.out.println("Perímetro: " + per_rec);
    }
}

//EJERCICIOS 13 Y 14

class coche{
    private  String marca;
    private  String modelo;
    private  int anio;

    public coche(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrar_Info_Coches(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricación: " + anio);
    }

    public void acelerar(){
        Random rand = new Random();

        int v = rand.nextInt(500) + 1;
        System.out.println("Velocidad inicial: 0 k/h");
        System.out.println("Acelerando...");
        System.out.println("Velocidad actual: " + v + " k/h");
    }

    public void frenar(){
        System.out.println("Frenando...");
        System.out.println("Velocidad final: 0 k/h");
    }
}

//EJERCICIO 15

class pelicula{
    private String titulo;
    private String director;
    private int duracion;

    public pelicula(String titulo, String director, int duracion){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public void mostrar_Info_Pel(){
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración en minutos: " + duracion);
    }
}