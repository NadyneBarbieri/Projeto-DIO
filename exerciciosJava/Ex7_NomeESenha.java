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
		
		// 1) Informe o seu login
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        // 2) Informe a sua senha
        System.out.println("Senha: ");
        String senha = scan.next();
        
        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (senha.equals(nome)) {
            	System.out.print("Nome e senha n�o podem ser iguais digite novamente...");
            };

            System.out.println("Senha: ");
            senha = scan.next();
        }
    }
		
}
