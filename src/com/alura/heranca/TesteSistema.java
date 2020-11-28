package com.alura.heranca;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(5623);
		
		
		SistemaInterno si = new SistemaInterno();
		si.valida(g);
		si.valida(cliente); 
	}

}
