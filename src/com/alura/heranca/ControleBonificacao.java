package com.alura.heranca;

public class ControleBonificacao {

	private double soma;
	
	// método de controle bonificacao
	public void registra(Funcionario funcionario) {
		System.out.println(this.soma);
		double boni = funcionario.getBonificacao();
		this.soma += boni; 
		
	}
	
	public double getSoma() {
		return soma;
	}
}
