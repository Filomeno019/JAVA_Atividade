package Banco_AF;

import java.util.Scanner;

public class StartProject {
	
	public static void main(String[] args) {
		
		try (Scanner cc = new Scanner(System.in)) {
		

			int opcao = 0;

			System.out.println("                BANCO FILOMENO SA.");
			System.out.println("--------------------------------------------------");
			System.out.println("        Bem Vindo ao maior banco do Brasil !!\n ");
			System.out.println("Segue as opções abaixo:");
			System.out.println(
					"1: Abrir nova conta  \n2: Encerrar conta \n3: Depositar valor em conta \n4: Sacar valor em conta");
			opcao = cc.nextInt();

			while (opcao != 6) {
				while (opcao <= 0 || opcao >= 6) {
					System.out.println("Não reconheço essa opção, tente novamente...");
					opcao = cc.nextInt();
				}
				switch (opcao) {
				case 1:
					ContaBancaria.abrirConta();
					break;

				case 2:
					ContaBancaria.encerrarConta();
					break;

				case 3:
					ContaBancaria.depositarValor(opcao);
					break;

				case 4:
					ContaBancaria.sacarValor(opcao);
					break;

				}
				System.out.println("--------------------------------------------------");
				System.out.println("        Tecle 6 caso queira sair do menu !!");
				opcao = cc.nextInt();

				if (opcao == 6) {
					System.out.println("Saindo do Menu...");
				}
			}
		}
	}

}
