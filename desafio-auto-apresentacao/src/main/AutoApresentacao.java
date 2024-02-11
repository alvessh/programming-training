package main;

import java.util.Scanner;

public class AutoApresentacao {
	public static void main(String ...args) {
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe seu e-mail:");
		String email = tela.nextLine();
		
		System.out.println("Informe sua senha: ");
		String senha = tela.nextLine();
		
		Boolean simOuNao = validarLogin(email, senha);
		if (simOuNao == true) {
			System.out.println("Logado com sucesso!");
		} else {
			System.out.println("Senha inválida!");
		}
		
	}
	static Boolean validarLogin(String email, String senha) {
		String senhaBaseDedados = "senha123";
		
		if (senha.equals(senhaBaseDedados)) {
			return true;
		} else {
			return false;
		}
	}
}
