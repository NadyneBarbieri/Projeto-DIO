package exerciciosJava;

import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'; 
 */


public class Ex8_Validação {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String nome, senha, salario,estCivil;
		char sexo;


		// 1) Informe o seu login
        System.out.println("Nome: ");
        nome = scan.nextLine();
        // 2) Informe a sua senha
        System.out.println("Senha: ");
        senha = scan.next();
    	// 1) Informe o seu login
        System.out.println("salario: ");
        salario = scan.nextLine();
        // 2) Informe a sua senha
        System.out.println("Sexo: ");
        sexo = scan.next();
		
        while(nome > 3 | nome> 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
	}

