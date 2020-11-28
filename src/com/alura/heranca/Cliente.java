package com.alura.heranca;

public class Cliente implements Autenticavel {

	private Autenticador autenticador;
	
	@SuppressWarnings("unused")
	public Cliente() {
		Autenticador autenticador = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

	@Override
	public boolean valida(int senha) {
		return this.autenticador.valida(senha);
	}
}
