package util;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.StockInsuficienteException;

public class Validador {
    public static void validarNombre(String nombre){
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    public static void validarPrecio(double precio){
        if (precio < 0){
            throw new IllegalArgumentException("el precio no puede ser negativo.");
        }
    }
    
    public static void validarStock( int stock){
        if (stock < 0){
            throw new StockInsuficienteException("el stock no puede ser negativo.");
        }
    }

    public  static void validarCategoria(String categoria){
        if(categoria == null || categoria.trim().isEmpty()){
            throw new IllegalArgumentException("La categoria no puede estar vacia.");
        }
    }


    //Lectura por consola
    public static int leerEntero(Scanner sc, String mensaje){
        while(true){
            System.out.println(mensaje);
            try{
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            }catch (InputMismatchException e){
                System.out.println("Debe ingresar un número entero. Intente nuevamente.");
                sc.nextLine(); //limpia el salto de linea
            }
        }
    }

    public static double leerDouble(Scanner sc, String mensaje){
        while(true){
            System.out.println(mensaje);
            try{
                double valor = sc.nextDouble();
                return valor;
            }catch (Exception e){
                System.out.println("Debe ingresar un número decimal");
                sc.nextLine();
            }
        }
    }
    public static String leerTexto(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }
}