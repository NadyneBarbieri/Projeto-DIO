package exerciciosJava;

import java.util.Scanner;

/*
Fa�a um programa que leia um nome de usu�rio e a 
sua senha e n�o aceite a senha igual ao nome do usu�rio, 
mostrando uma mensagem de erro e voltando a pedir as informa��es.
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
            	System.out.print("Nome e senha n�o podem ser iguals digite novamente...");
            }

            System.out.println("Usuario logado!");
        }
    }
		
}
