package com.alura.heranca;

public class Autenticador implements Autenticavel {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean valida(int senha) {
		if(senha == this.senha) {
			return true;
		}
		return false;
	}
}
