package br.com.totvschallenge.main;

import br.com.totvschallenge.entities.Usuario;

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
        System.out.println("===== Cadastro de usuário =====");
        Usuario user = new Usuario(
                lerString("Insira o nome de usuário:"),
                lerString("Insira o seu email: "),
                lerString("Insira sua senha:")
        );


        while(true){

        }
    }
}