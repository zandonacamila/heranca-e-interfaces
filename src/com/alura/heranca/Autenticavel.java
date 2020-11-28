package com.alura.heranca;


//contrato autenticavel
	//quem assinar precisa implementar
		//setSenha e metodo valida
public interface Autenticavel {

	public abstract void setSenha(int senha);
		
	public abstract boolean valida(int senha);
	
}
