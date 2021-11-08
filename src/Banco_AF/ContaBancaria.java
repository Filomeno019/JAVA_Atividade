package Banco_AF;

import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {
	Random gerador = new Random();

	static Scanner sc = new Scanner(System.in);

	private double numConta, numAgencia, numBanco;

	private static double contaSaldo;
	private String nomeBanco, nomeAgencia, contaTipo;
	private static int conta;
	private boolean contaAberta;

//	@Override
//	public String toString() {
//
//		return super.toString();
//	}
	
	

	public Random getGerador() {
		return gerador;
	}

	public void setGerador(Random gerador) {
		this.gerador = gerador;
	}

	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		ContaBancaria.sc = sc;
	}

	public double getNumConta() {
		return numConta;
	}

	public void setNumConta(double numConta) {
		this.numConta = numConta;
	}

	public double getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(double numAgencia) {
		this.numAgencia = numAgencia;
	}

	public double getNumBanco() {
		return numBanco;
	}

	public void setNumBanco(double numBanco) {
		this.numBanco = numBanco;
	}

	public static double getContaSaldo() {
		return contaSaldo;
	}

	public static void setContaSaldo(double contaSaldo) {
		ContaBancaria.contaSaldo = contaSaldo;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getContaTipo() {
		return contaTipo;
	}

	public void setContaTipo(String contaTipo) {
		this.contaTipo = contaTipo;
	}

	public int getConta() {
		return conta;
	}

	public static void setConta(int conta) {
		ContaBancaria.conta = conta;
	}

	public boolean isContaAberta() {
		return contaAberta;
	}

	public void setContaAberta(boolean contaAberta) {
		this.contaAberta = contaAberta;
	}
	
	
	

	public static void abrirConta() {

		do {
			System.out.println("Olá, como vai?\nBem vindo ao melhor banco que existe !!");
			System.out.println("                BANCO FILOMENO SA.");
			System.out.println("--------------------------------------------------");
			System.out.println("Qual tipo de conta deseja abrir??\n1: Corrente \n2: Poupança" + "\n3: Conjunta");
			conta = sc.nextInt();

		} while (conta != 1 && conta != 2 && conta != 3);
		
		if (this.getConta() == 1) {
			this.setContaAberta(contaAberta = true);
			this.setContaTipo(contaTipo = "Conta Corrente");
			
			System.out.println("");
								
		}
	}
	public static void encerrarConta() {

	}

	public static void depositarValor(double valor) {

		System.out.println("Qual o valor do depósito?");
		valor = sc.nextDouble();

		contaSaldo += valor;

		System.out.println("\nOK, seu novo saldo é de:\n" + "R$" + contaSaldo);

	}

	public static void sacarValor(double valor) {

		System.out.println("Qual o valor do saque?");
		valor = sc.nextDouble();

		if ((contaSaldo - valor) >= 0) {
			contaSaldo -= valor;

			System.out.println("\nOK, dinnheiro sacado.\n Seu novo saldo é de:" + "R$" + contaSaldo);
		} else {
			System.out.println("Não há como sacar, saldo insuficiente !!\n " + "Saldo Atual é:" + contaSaldo);
		}

	}

}
