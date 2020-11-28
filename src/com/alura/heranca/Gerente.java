package com.alura.heranca;


public class Gerente extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	public double getBonificacao() { // sobrescrita usa a mesma assinatura do método -> não é mais sobrescrita
		return getBonificacao() + super.getSalario();
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
