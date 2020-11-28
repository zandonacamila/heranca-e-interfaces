package com.alura.heranca;

public class Administrador extends Funcionario implements Autenticavel {

	Autenticador autenticador = new Autenticador();
	
	@Override
	public double getBonificacao() {
	
		return 0;
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
