package com.alura.heranca;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente marco = new Gerente(); 
		marco.setSalario(2000);
		Divisao elisa = new Divisao('b', 135);
		elisa.setSalario(10000);
		//Funcionario francis = new Funcionario();
		//francis.setSalario(2000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(marco);
//		System.out.println(controle.getSoma());
		controle.registra(elisa);
		//controle.registra(francis);
		System.out.println(controle.getSoma());
	}

}
