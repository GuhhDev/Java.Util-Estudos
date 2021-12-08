package br.com.aulas.Aula03;

import br.com.aulas.Aula02.Modelo.Conta;

public class GuardadorDeContas {

	// Aqui é criado um array do tipo conta que só referencia conta;
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona (Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int i) {
		
		return this.referencias[i];
	}
}