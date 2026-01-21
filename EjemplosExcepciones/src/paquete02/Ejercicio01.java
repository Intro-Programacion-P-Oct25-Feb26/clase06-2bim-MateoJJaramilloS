/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int x = 1;
        int a = obtenerValor(x);
        int b = obtenerValor(x+1);
        int c = obtenerSuma(a, b);
        imprimir(a,b,c);

    }

    public static int obtenerValor(int x) {
         Scanner entrada = new Scanner(System.in);
         boolean bandera = true;
         while (bandera){
         try {
            System.out.printf("Ingrese valor %s a operar: ", x);
            int valor1 = entrada.nextInt();
            if (valor1 %2 != 0 || valor1 < 0){
            throw new Exception("Solo ingresar números pares positivos");
            }
            bandera = false;
            return valor1;
        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
        }      
    }
    public static int obtenerSuma(int a, int b){
        int suma= a + b;
        return suma;
        
    }
    public static void imprimir(int a, int b, int c){
        System.out.printf("La suma de %d + %d es igual a: %d ", a, b, c);
    }
    }

