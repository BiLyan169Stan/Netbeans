package com.edu.netbeans.calculadora.brian;

import java.util.Scanner;

public class CalculadoraBrian {

    private static int numeroUno;
    private static int numeroDos;

    private static Scanner leerDatos = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repetir = true;
        while (repetir) {
            System.out.println("Ingrese la opcion: ");
            System.out.println("op: 1    Multiplicacion");
            System.out.println("op: 2    Suma");
            System.out.println("op: 3    Resta");
            System.out.println("op: 4    Division");
            System.out.println("op: 5    Modulo");
            System.out.println("op: 6    Salir");
            try {
                int op = Integer.parseInt(leerDatos.nextLine());

                switch (op) {

                    case 1:
                        multiplicacion();
                        break;

                    case 2:
                        suma();
                        break;

                    case 3:
                        resta();
                        break;

                    case 4:
                        division();
                        break;

                    case 5:
                        modulo();
                        break;

                    case 6:
                        salir();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese solo numeros");
            }

        }

    }

    private static void multiplicacion() {
        try {
            System.out.println("---------- Multiplicación ----------");
            System.out.println("Ingrese el primero numero");
            numeroUno = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Ingrese el segundo numero");
            numeroDos = Integer.parseInt(leerDatos.nextLine());

            int resultado = numeroDos * numeroUno;

            System.out.println("El resultado de la Multiplicación es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo numeros");
        }

    }

    private static void suma() {
        try {
            System.out.println("---------- Suma ----------");
            System.out.println("Ingrese el primero numero");
            numeroUno = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Ingrese el segundo numero");
            numeroDos = Integer.parseInt(leerDatos.nextLine());

            int resultado = numeroDos + numeroUno;

            System.out.println("El resultado de la Suma es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo numeros");
        }

    }

    private static void resta() {
        try {
            System.out.println("---------- Resta ----------");
            System.out.println("Ingrese el primero numero");
            numeroUno = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Ingrese el segundo numero");
            numeroDos = Integer.parseInt(leerDatos.nextLine());

            int resultado = numeroUno - numeroDos;

            System.out.println("El resultado de la Resta es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo numeros");
        }

    }

    private static void division() {
        try {
            System.out.println("---------- Division ----------");
            System.out.println("Ingrese el primero numero");
            numeroUno = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Ingrese el segundo numero");
            numeroDos = Integer.parseInt(leerDatos.nextLine());

            if (numeroUno == 0) {
                System.out.println("Error: No se puede dividir entre cero.");
            } else {
                int resultado = numeroDos / numeroUno;
                System.out.println("El resultado de la Division es: " + resultado);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese solo numeros");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
    }

    private static void modulo() {
        try {
            System.out.println("---------- Modulo ----------");
            System.out.println("Ingrese el primer numero");
            numeroUno = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Ingrese el segundo numero");
            numeroDos = Integer.parseInt(leerDatos.nextLine());

            if (numeroUno == 0) {
                System.out.println("Error: No se puede calcular el modulo con divisor cero.");
            } else {
                int resultado = numeroDos % numeroUno;
                System.out.println("El resultado del modulo es: " + resultado);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese solo numeros válidos.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }

    private static void salir() {
        System.exit(0);
    }

}
