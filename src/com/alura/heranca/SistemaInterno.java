package com.alura.heranca;

public class SistemaInterno {

	int senha = 2222;
	
	public void valida(Autenticavel g) {
		boolean autenticou = g.valida(senha);
		if(autenticou) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("Não pode entrar");
		}
	}
}
