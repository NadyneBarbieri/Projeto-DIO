package exerciciosJava;

import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e a 
sua senha e não aceite a senha igual ao nome do usuário, 
mostrando uma mensagem de erro e voltando a pedir as informações.
*/
public class Ex7_NomeESenha {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
       String nome,senha;
        
        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            System.out.println("Senha: ");
            senha = scan.next();
            if (nome.equals(senha)) {
            	System.out.print("Nome e senha não podem ser iguals digite novamente...");
            }

            System.out.println("Usuario logado!");
        }
    }
		
}
