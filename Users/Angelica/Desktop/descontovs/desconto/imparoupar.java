package com.company;
import java.util.Scanner;
public class Main {

               public static void main(String[] args) {
                Scanner entrada = new Scanner (System.in);
                int numero;
                System.out.println("Vamos verificar se um número é ÍMPAR ou PAR. \nDigite aqui: ");
                numero = entrada.nextInt();

                if (numero % 2 == 1) {
                    System.out.println("O número " + numero + " é ímpar.");
                } else {
                    System.out.println("O número " + numero + " é par.");
                }


            }

        }

