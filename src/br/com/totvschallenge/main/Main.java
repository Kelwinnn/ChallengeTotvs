package br.com.totvschallenge.main;

import java.util.Scanner;

public class Main {

    static Scanner leitura = new Scanner(System.in);

    public static String lerString(String mensagem){
        System.out.println(mensagem);
        return leitura.nextLine();
    }

    public static double lerReal(String mensagem){
        System.out.println(mensagem);
        return leitura.nextDouble();
    }
    public static int lerInt(String mensagem){
        System.out.println(mensagem);
        return leitura.nextInt();
    }

    public static void main(String[] args) {

    }
}