package com.alura.heranca;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente clara = new Gerente();
		clara.setSalario(10000);
		System.out.println(clara.getBonificacao());
		clara.setSalario(2000);

	}

}
