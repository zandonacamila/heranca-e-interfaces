package com.alura.heranca;

public class Divisao extends Funcionario {
	char setor;
	int area;
	
	public Divisao(char setor, int area) {
		this.setor = setor;
		this.area = area;
	}
	
	public double getBonificacao() {
		return getBonificacao()*5;
	}
}
