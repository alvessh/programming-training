package se;

import java.util.Scanner;

public class Login {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		String usuarioCorreto = "admin";
		String senhaCorreta = "batata&ARROZ";
		
		System.out.println("Informe seu usuário: ");
		String usuario = scanner.nextLine();
		
		System.out.println("Informe sua senha: ");
		String senha = scanner.nextLine();
		
		if (senha.equals(senhaCorreta) 
				&& usuario.equals(usuarioCorreto)) {
			System.out.println("Acesso autorizado!");
		} else {
			System.out.println("Senha e/ou usuário invalido!");
		}
		
	}
}
