package com.alura.heranca;

public class Fiscal implements Autenticavel {

	private Autenticador autenticador; 
	
	public Fiscal() {
		this.autenticador = new Autenticador();
	}
	
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean valida(int senha) {
		return this.autenticador.valida(senha);
	}

}
